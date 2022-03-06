
package com.infobip.client.channels.rcs.api;

import static com.infobip.client.common.RequestValidator.validateBody;
import com.infobip.client.channels.rcs.model.RcsBulkMessage;
import com.infobip.client.channels.rcs.model.RcsMessage;
import com.infobip.client.channels.rcs.model.RcsMessageResponse;
import com.infobip.client.common.ApiCallback;
import com.infobip.client.common.ApiClient;
import com.infobip.client.common.ApiException;
import com.infobip.client.common.ApiResponse;
import com.infobip.client.common.HttpHeader;
import com.infobip.client.common.HttpMethodType;
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
    private static final String SEND_BULK_RCS_MESSAGE_ENDPOINT = "/ott/rcs/1/message/bulk";
    private ApiClient apiClient;

    public SendRcsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Send RCS message.
     * <p>
     *
     * @param rcsMessage (required)
     * @return ApiResponse&lt;RcsMessageResponse&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<RcsMessageResponse> sendRcsMessage(final RcsMessage rcsMessage)
            throws ApiException {
        validateBody(rcsMessage);
        Call call = sendRcsMessageCall(rcsMessage);
        return apiClient.execute(call, RcsMessageResponse.class);
    }

    /**
     * <p>
     * Send RCS message (asynchronously).
     * </p>
     *
     * @param rcsMessage (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException in case of error(s)
     */
    public Call sendRcsMessageAsync(final RcsMessage rcsMessage,
            final ApiCallback<RcsMessageResponse> apiCallback) throws ApiException {
        validateBody(rcsMessage);
        Call call = sendRcsMessageCall(rcsMessage, apiCallback);
        apiClient.executeAsync(call, RcsMessageResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send bulk RCS message.
     * </p>
     *
     * @param rcsBulkMessage (required)
     * @return ApiResponse&lt;RcsMessageResponse&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<RcsMessageResponse> sendRcsBulkMessage(final RcsBulkMessage rcsBulkMessage)
            throws ApiException {
        validateBody(rcsBulkMessage);
        Call call = sendRcsBulkMessageCall(rcsBulkMessage);
        return apiClient.execute(call, RcsMessageResponse.class);
    }

    /**
     * <p>
     * Send bulk RCS message (asynchronously).
     * </p>
     *
     * @param rcsBulkMessage (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException in case of error(s)
     */
    public Call sendRcsBulkMessageAsync(final RcsBulkMessage rcsBulkMessage,
            final ApiCallback<RcsMessageResponse> apiCallback) throws ApiException {
        validateBody(rcsBulkMessage);
        Call call = sendRcsBulkMessageCall(rcsBulkMessage, apiCallback);
        apiClient.executeAsync(call, RcsMessageResponse.class, apiCallback);
        return call;
    }

    private Call sendRcsMessageCall(RcsMessage rcsMessage) throws ApiException {
        return sendRcsMessageCall(rcsMessage, null);
    }

    private Call sendRcsMessageCall(final RcsMessage rcsMessage, final ApiCallback apiCallback)
            throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(SEND_RCS_MESSAGE_ENDPOINT, HttpMethodType.POST, httpHeaders,
                rcsMessage, apiCallback);
    }

    private Call sendRcsBulkMessageCall(RcsBulkMessage rcsBulkMessage) throws ApiException {
        return sendRcsBulkMessageCall(rcsBulkMessage, null);
    }

    private Call sendRcsBulkMessageCall(final RcsBulkMessage rcsBulkMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(SEND_BULK_RCS_MESSAGE_ENDPOINT, HttpMethodType.POST, httpHeaders,
                rcsBulkMessage, apiCallback);
    }
}
