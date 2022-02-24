
package com.infobip.client.channels.webrtc.api;

import com.google.gson.reflect.TypeToken;
import com.infobip.client.channels.webrtc.model.WebrtcTokenRequest;
import com.infobip.client.channels.webrtc.model.WebrtcTokenResponse;
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
 * This endpoint allows you to generate token for WebRTC channel.
 * </p>
 */
public final class WebRtcTokenApi {
    private static final String GENERATE_WEBRTC_TOKEN_ENDPOINT = "/webrtc/1/token";
    private ApiClient apiClient;

    public WebRtcTokenApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Generate WebRTC Token.
     * </p>
     *
     * @param webrtcTokenRequest (optional)
     * @return ApiResponse&lt;WebrtcTokenResponse&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<WebrtcTokenResponse>
            generateWebrtcToken(final WebrtcTokenRequest webrtcTokenRequest) throws ApiException {
        Call call = generateWebrtcTokenValidateBeforeCall(webrtcTokenRequest);
        Type returnType = new TypeToken<WebrtcTokenResponse>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * <p>
     * Generate WebRTC Token (asynchronously).<br>
     * </p>
     *
     * @param webrtcTokenRequest (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException in case of error(s)
     */
    public Call generateWebrtcTokenAsync(final WebrtcTokenRequest webrtcTokenRequest,
            final ApiCallback<WebrtcTokenResponse> apiCallback) throws ApiException {
        Call call = generateWebrtcTokenValidateBeforeCall(webrtcTokenRequest, apiCallback);
        Type returnType = new TypeToken<WebrtcTokenResponse>() {}.getType();
        apiClient.executeAsync(call, returnType, apiCallback);
        return call;
    }

    private Call generateWebrtcTokenValidateBeforeCall(final WebrtcTokenRequest webrtcTokenRequest)
            throws ApiException {
        return generateWebrtcTokenValidateBeforeCall(webrtcTokenRequest, null);
    }

    // TODO: Improve validation logic
    private Call generateWebrtcTokenValidateBeforeCall(final WebrtcTokenRequest webrtcTokenRequest,
            final ApiCallback apiCallback) throws ApiException {
        return generateWebrtcTokenCall(webrtcTokenRequest, apiCallback);
    }

    private Call generateWebrtcTokenCall(final WebrtcTokenRequest webrtcTokenRequest,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GENERATE_WEBRTC_TOKEN_ENDPOINT, HttpMethodType.POST, httpHeaders,
                webrtcTokenRequest, apiCallback);
    }
}
