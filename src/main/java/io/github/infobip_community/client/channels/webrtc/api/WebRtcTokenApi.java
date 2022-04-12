
package io.github.infobip_community.client.channels.webrtc.api;

import static io.github.infobip_community.client.common.RequestValidator.validateBody;
import io.github.infobip_community.client.channels.webrtc.model.token.WebRtcToken;
import io.github.infobip_community.client.channels.webrtc.model.token.WebRtcTokenResponse;
import io.github.infobip_community.client.common.ApiCallback;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import io.github.infobip_community.client.common.ApiResponse;
import io.github.infobip_community.client.common.HttpHeader;
import io.github.infobip_community.client.common.HttpMethodType;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;

/**
 * <p>
 * This endpoint allows you to generate token for WebRTC channel.
 * </p>
 */
@SuppressWarnings("rawtypes")
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
     * @param webRtcToken (optional)
     * @return ApiResponse&lt;WebRtcTokenResponse&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<WebRtcTokenResponse> generateWebRtcToken(final WebRtcToken webRtcToken)
            throws ApiException {
        validateBody(webRtcToken);
        Call call = generateWebRtcTokenCall(webRtcToken);
        return apiClient.execute(call, WebRtcTokenResponse.class);
    }

    /**
     * <p>
     * Generate WebRTC Token (asynchronously).<br>
     * </p>
     *
     * @param webRtcToken (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException in case of error(s)
     */
    public Call generateWebRtcTokenAsync(final WebRtcToken webRtcToken,
            final ApiCallback<WebRtcTokenResponse> apiCallback) throws ApiException {
        validateBody(webRtcToken);
        Call call = generateWebRtcTokenCall(webRtcToken, apiCallback);
        apiClient.executeAsync(call, WebRtcTokenResponse.class, apiCallback);
        return call;
    }

    private Call generateWebRtcTokenCall(WebRtcToken webRtcToken) throws ApiException {
        return generateWebRtcTokenCall(webRtcToken, null);
    }

    private Call generateWebRtcTokenCall(final WebRtcToken webRtcToken,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GENERATE_WEBRTC_TOKEN_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, webRtcToken, apiCallback);
    }
}
