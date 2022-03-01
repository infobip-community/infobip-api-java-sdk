
package com.infobip.client.channels.rcs.api;

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
        Call call = sendRcsMessageValidateBeforeCall(rcsMessage);
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
        Call call = sendRcsMessageValidateBeforeCall(rcsMessage, apiCallback);
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
        Call call = sendRcsBulkMessageValidateBeforeCall(rcsBulkMessage);
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
        Call call = sendRcsBulkMessageValidateBeforeCall(rcsBulkMessage, apiCallback);
        apiClient.executeAsync(call, RcsMessageResponse.class, apiCallback);
        return call;
    }

    private Call sendRcsMessageValidateBeforeCall(final RcsMessage rcsMessage) throws ApiException {
        return sendRcsMessageValidateBeforeCall(rcsMessage, null);
    }

    // TODO: Improve validation logic; remove string literal(s)
    private Call sendRcsMessageValidateBeforeCall(final RcsMessage rcsMessage,
            final ApiCallback apiCallback) throws ApiException {
        if (rcsMessage == null) {
            throw new ApiException("Missing the request");
        }
        return sendRcsMessageCall(rcsMessage, apiCallback);
    }

    private Call sendRcsBulkMessageValidateBeforeCall(final RcsBulkMessage rcsBulkMessage)
            throws ApiException {
        return sendRcsBulkMessageValidateBeforeCall(rcsBulkMessage, null);
    }

    // TODO: Improve validation logic; remove string literal(s)
    private Call sendRcsBulkMessageValidateBeforeCall(final RcsBulkMessage rcsBulkMessage,
            final ApiCallback apiCallback) throws ApiException {
        if (rcsBulkMessage == null) {
            throw new ApiException("Missing the request'");
        }
        return sendRcsBulkMessageCall(rcsBulkMessage, apiCallback);
    }

    private Call sendRcsMessageCall(final RcsMessage rcsMessage, final ApiCallback apiCallback)
            throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(SEND_RCS_MESSAGE_ENDPOINT, HttpMethodType.POST, httpHeaders,
                rcsMessage, apiCallback);
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
