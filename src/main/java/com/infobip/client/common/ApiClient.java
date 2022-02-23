
package com.infobip.client.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * <p>
 * ApiClient class.
 * </p>
 */
// TODO : WIP; Improve ApiClient; serde
public final class ApiClient {
    private ObjectMapper objectMapper = new ObjectMapper();
    private OkHttpClient httpClient;
    private String basePath;
    private AuthenticationType authenticationType;
    private String apiKey;

    /**
     * <p>
     * Basic constructor for ApiClient.
     * </p>
     */
    public ApiClient() {
        initHttpClient();
    }

    /**
     * <p>
     * Set base path.
     * </p>
     *
     * @param basePath Base path of the URL, e.g http://localhost
     */
    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * <p>
     * Set authentication Type.
     * </p>
     *
     * @param authenticationType The type of authentication; currently APY_KEY
     */
    public void setAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * Set api Key.
     * </p>
     *
     * @param apiKey Api key
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * <p>
     * Build HTTP call with the given options.
     * </p>
     *
     * TODO: Split method ...
     */
    public Call buildCall(String apiEndpoint, HttpMethodType httpMethodType,
            Map<String, String> httpHeaders, Object body, ApiCallback apiCallback)
            throws ApiException {
        String url = basePath + apiEndpoint;
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(HttpHeader.AUTHORIZATION, HttpHeader.APP + HttpHeader.EMPTY_STRING + apiKey);
        headers.putAll(httpHeaders);
        Request.Builder requestBuilder = new Request.Builder().url(url);
        processHeaderParams(headers, requestBuilder);
        String json;
        try {
            json = objectMapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            throw new ApiException();
        }
        RequestBody requestBody =
                RequestBody.create(json, MediaType.parse(HttpHeader.APPLICATION_JSON));
        Request request = requestBuilder.method(httpMethodType.name(), requestBody).build();
        return httpClient.newCall(request);
    }

    /**
     * <p>
     * Set header parameters to the request builder.
     * </p>
     *
     * @param httpHeaders Header parameters in the form of Map
     * @param requestBuilder Request.Builder
     */
    public void processHeaderParams(Map<String, String> httpHeaders,
            Request.Builder requestBuilder) {
        for (Entry<String, String> param : httpHeaders.entrySet()) {
            requestBuilder.header(param.getKey(), param.getValue());
        }
    }

    /**
     * <p>
     * {@link #execute(Call, Type)}.
     * </p>
     *
     * @param <T> Type
     * @param call An instance of the Call object
     * @return ApiResponse&lt;T&gt;
     * @throws ApiException If fail to execute the call
     */
    public <T> ApiResponse<T> execute(Call call) throws ApiException {
        return execute(call, null);
    }

    /**
     * <p>
     * Execute HTTP call and deserialize the HTTP response body into the given
     * return type.
     * </p>
     *
     * @param returnType The return type used to deserialize HTTP response body
     * @param <T> The return type corresponding to (same with) returnType
     * @param call Call
     * @return ApiResponse object containing response status, headers and
     *     data, which is a Java object deserialized from response body and would be
     *     null when returnType is null.
     * @throws ApiException If fail to execute the call
     */
    public <T> ApiResponse<T> execute(Call call, Type returnType) throws ApiException {
        try {
            Response response = call.execute();
            T data = handleResponse(response, returnType);
            return new ApiResponse<T>(response.code(), response.headers().toMultimap(), data);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * <p>
     * {@link #executeAsync(Call, Type, ApiCallback)}.
     * </p>
     *
     * @param <T> Type
     * @param call An instance of the Call object
     * @param callback ApiCallback&lt;T&gt;
     */
    public <T> void executeAsync(Call call, ApiCallback<T> callback) {
        executeAsync(call, null, callback);
    }

    /**
     * <p>
     * Execute HTTP call asynchronously.
     * </p>
     *
     * @param <T> Type
     * @param call The callback to be executed when the API call finishes
     * @param returnType Return type
     * @param callback ApiCallback
     * @see #execute(Call, Type)
     */
    @SuppressWarnings("unchecked")
    public <T> void executeAsync(Call call, final Type returnType, final ApiCallback<T> callback) {
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onFailure(new ApiException(e), 0, null);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                T result;
                try {
                    result = (T) handleResponse(response, returnType);
                } catch (ApiException e) {
                    callback.onFailure(e, response.code(), response.headers().toMultimap());
                    return;
                } catch (Exception e) {
                    callback.onFailure(new ApiException(e), response.code(),
                            response.headers().toMultimap());
                    return;
                }
                callback.onSuccess(result, response.code(), response.headers().toMultimap());
            }
        });
    }

    /**
     * <p>
     * Handle the given response, return the deserialized object when the response
     * is successful.
     * </p>
     *
     * @param <T> Type
     * @param response Response
     * @param returnType Return type
     * @return Type
     * @throws ApiException If the response has an unsuccessful status code or
     *     fail to deserialize the response body
     */
    public <T> T handleResponse(Response response, Type returnType) throws ApiException {
        if (response.isSuccessful()) {
            if (returnType == null || response.code() == 204) {
                // returning null if the returnType is not defined,
                // or the status code is 204 (No Content)
                if (response.body() != null) {
                    try {
                        response.body().close();
                    } catch (Exception e) {
                        throw new ApiException(response.message(), e, response.code(),
                                response.headers().toMultimap());
                    }
                }
                return null;
            } else {
                return deserialize(response, returnType);
            }
        } else {
            String respBody = null;
            if (response.body() != null) {
                try {
                    respBody = response.body().string();
                } catch (IOException e) {
                    throw new ApiException(response.message(), e, response.code(),
                            response.headers().toMultimap());
                }
            }
            throw new ApiException(response.message(), response.code(),
                    response.headers().toMultimap(), respBody);
        }
    }

    /**
     * <p>
     * Deserialize response body to Java object, according to the return type and
     * the Content-Type response header.
     * </p>
     *
     * @param <T> Type
     * @param response HTTP response
     * @param returnType The type of the Java object
     * @return The deserialized Java object
     * @throws ApiException If fail to deserialize response
     *     body, i.e. cannot read response body
     *     or the Content-Type of the response is not supported.
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(Response response, Type returnType) throws ApiException {
        // TODO: implement ...
        return null;
    }

    private void initHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        httpClient = builder.build();
    }
}
