
package com.infobip.client.channels.rcs.api;

import com.google.gson.reflect.TypeToken;
import com.infobip.client.channels.rcs.model.RcsBulkRequest;
import com.infobip.client.channels.rcs.model.RcsRequest;
import com.infobip.client.channels.rcs.model.RcsResponse;
import com.infobip.client.common.ApiCallback;
import com.infobip.client.common.ApiClient;
import com.infobip.client.common.ApiException;
import com.infobip.client.common.ApiResponse;
import com.infobip.client.common.HttpHeader;
import com.infobip.client.common.HttpMethodType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;

/**
 * <p>
 * Used for sending single RCS messages.
 * </p>
 */
public final class SendRcsApi {
    private static final String SEND_RCS_MESSAGE_ENDPOINT = "/ott/rcs/1/message";
    private static final String SEND_BULK_RCS_MESSAGE_ENDPOINT =
            SEND_RCS_MESSAGE_ENDPOINT + "/bulk";
    private ApiClient apiClient;

    public SendRcsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Send RCS message.
     * <p>
     *
     * @param rcsRequest (required)
     * @return ApiResponse&lt;RcsResponse&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<RcsResponse> sendRcsMessage(final RcsRequest rcsRequest)
            throws ApiException {
        Call call = sendRcsMessageValidateBeforeCall(rcsRequest);
        Type returnType = new TypeToken<RcsResponse>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * <p>
     * Send RCS message (asynchronously).
     * </p>
     *
     * @param rcsRequest (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException in case of error(s)
     */
    public Call sendRcsMessageAsync(final RcsRequest rcsRequest,
            final ApiCallback<RcsResponse> apiCallback) throws ApiException {
        Call call = sendRcsMessageValidateBeforeCall(rcsRequest, apiCallback);
        Type returnType = new TypeToken<RcsResponse>() {}.getType();
        apiClient.executeAsync(call, returnType, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send bulk RCS message.
     * </p>
     *
     * @param rcsBulkRequest (required)
     * @return ApiResponse&lt;RcsResponse&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<RcsResponse> sendRcsBulkMessage(final RcsBulkRequest rcsBulkRequest)
            throws ApiException {
        Call call = sendRcsBulkMessageValidateBeforeCall(rcsBulkRequest);
        Type returnType = new TypeToken<RcsResponse>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * <p>
     * Send bulk RCS message (asynchronously).
     * </p>
     *
     * @param rcsBulkRequest (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException in case of error(s)
     */
    public Call sendRcsBulkMessageAsync(final RcsBulkRequest rcsBulkRequest,
            final ApiCallback<RcsResponse> apiCallback) throws ApiException {
        Call call = sendRcsBulkMessageValidateBeforeCall(rcsBulkRequest, apiCallback);
        Type returnType = new TypeToken<RcsResponse>() {}.getType();
        apiClient.executeAsync(call, returnType, apiCallback);
        return call;
    }

    private Call sendRcsMessageValidateBeforeCall(final RcsRequest rcsRequest) throws ApiException {
        return sendRcsMessageValidateBeforeCall(rcsRequest, null);
    }

    // TODO: Improve validation logic; remove string literal(s)
    private Call sendRcsMessageValidateBeforeCall(final RcsRequest rcsRequest,
            final ApiCallback apiCallback) throws ApiException {
        if (rcsRequest == null) {
            throw new ApiException("Missing the request");
        }
        return sendRcsMessageCall(rcsRequest, apiCallback);
    }

    private Call sendRcsBulkMessageValidateBeforeCall(final RcsBulkRequest rcsBulkRequest)
            throws ApiException {
        return sendRcsBulkMessageValidateBeforeCall(rcsBulkRequest, null);
    }

    // TODO: Improve validation logic; remove string literal(s)
    private Call sendRcsBulkMessageValidateBeforeCall(final RcsBulkRequest rcsBulkRequest,
            final ApiCallback apiCallback) throws ApiException {
        if (rcsBulkRequest == null) {
            throw new ApiException("Missing the request'");
        }
        return sendRcsBulkMessageCall(rcsBulkRequest, apiCallback);
    }

    private Call sendRcsMessageCall(final RcsRequest rcsRequest, final ApiCallback apiCallback)
            throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(SEND_RCS_MESSAGE_ENDPOINT, HttpMethodType.POST, httpHeaders,
                rcsRequest, apiCallback);
    }

    private Call sendRcsBulkMessageCall(final RcsBulkRequest rcsBulkRequest,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(SEND_BULK_RCS_MESSAGE_ENDPOINT, HttpMethodType.POST, httpHeaders,
                rcsBulkRequest, apiCallback);
    }
}
