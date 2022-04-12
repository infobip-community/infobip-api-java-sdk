
package io.github.infobip_community.client.channels.mms.api;

import static io.github.infobip_community.client.common.QueryStringBuilder.buildQueryString;
import static io.github.infobip_community.client.common.RequestValidator.validateQueryString;
import io.github.infobip_community.client.channels.mms.model.MmsQueryStringInboundMessages;
import io.github.infobip_community.client.channels.mms.model.response.MmsInboundReportResponse;
import io.github.infobip_community.client.common.ApiCallback;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import io.github.infobip_community.client.common.ApiResponse;
import io.github.infobip_community.client.common.HttpHeader;
import io.github.infobip_community.client.common.HttpMethodType;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;

@SuppressWarnings("rawtypes")
public final class ReceiveMmsApi {
    private static final String GET_INBOUND_MMS_MESSAGES_ENDPOINT = "/mms/1/inbox/reports";
    private ApiClient apiClient;

    public ReceiveMmsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Get inbound MMS messages.<br>
     * If for some reason you are unable to receive incoming MMS at the endpoint of
     * your choice in real time, you can use this API call to fetch messages. Each
     * request will return a batch of received messages - only once. The following
     * API request will return only new messages that arrived since the last API
     * request.
     * </p>
     *
     * @param mmsQueryStringInboundMessages (optional)
     * @return ApiResponse&lt;MmsInboundReportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     */
    public ApiResponse<MmsInboundReportResponse> getInboundMmsMessages(
            final MmsQueryStringInboundMessages mmsQueryStringInboundMessages) throws ApiException {
        validateQueryString(mmsQueryStringInboundMessages);
        Call call = getInboundMmsMessagesCall(mmsQueryStringInboundMessages);
        return apiClient.execute(call, MmsInboundReportResponse.class);
    }

    /**
     * <p>
     * Get inbound MMS messages (asynchronously).<br>
     * If for some reason you are unable to receive incoming MMS at the endpoint of
     * your choice in real time, you can use this API call to fetch messages. Each
     * request will return a batch of received messages - only once. The following
     * API request will return only new messages that arrived since the last API
     * request.
     * </p>
     *
     * @param mmsQueryStringInboundMessages (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     */
    public Call getInboundMmsMessagesAsync(
            final MmsQueryStringInboundMessages mmsQueryStringInboundMessages,
            final ApiCallback<MmsInboundReportResponse> apiCallback) throws ApiException {
        validateQueryString(mmsQueryStringInboundMessages);
        Call call = getInboundMmsMessagesCall(mmsQueryStringInboundMessages, apiCallback);
        apiClient.executeAsync(call, MmsInboundReportResponse.class, apiCallback);
        return call;
    }

    private Call getInboundMmsMessagesCall(
            final MmsQueryStringInboundMessages mmsQueryStringInboundMessages) throws ApiException {
        return getInboundMmsMessagesCall(mmsQueryStringInboundMessages, null);
    }

    private Call getInboundMmsMessagesCall(
            final MmsQueryStringInboundMessages mmsQueryStringInboundMessages,
            final ApiCallback apiCallback) throws ApiException {
        String queryString = buildQueryString(mmsQueryStringInboundMessages);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_INBOUND_MMS_MESSAGES_ENDPOINT, queryString,
                HttpMethodType.GET, httpHeaders, null, apiCallback);
    }
}
