
package io.github.infobip_community.client.channels.sms.api;

import static io.github.infobip_community.client.common.QueryStringBuilder.buildQueryString;
import static io.github.infobip_community.client.common.RequestValidator.validateQueryString;
import io.github.infobip_community.client.channels.sms.model.message.inbound.SmsQueryStringInboundMessages;
import io.github.infobip_community.client.channels.sms.model.message.inbound.response.SmsInboundMessageResponse;
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
public final class ReceiveSmsApi {
    private static final String GET_INBOUND_SMS_MESSAGES_ENDPOINT = "/sms/1/inbox/reports";
    private ApiClient apiClient;

    public ReceiveSmsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Get inbound SMS messages.<br>
     * If for some reason you are unable to receive incoming SMS to the endpoint of
     * your choice in real time, you can use this API call to fetch messages. Each
     * request will return a batch of received messages - only once. The API request
     * will only return new messages that arrived since the last API request.
     * </p>
     *
     * @param smsQueryStringInboundMessages SmsInboundMessageResponse
     * @return ApiResponse&lt;SmsInboundMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     */
    public ApiResponse<SmsInboundMessageResponse> getInboundSmsMessages(
            final SmsQueryStringInboundMessages smsQueryStringInboundMessages) throws ApiException {
        validateQueryString(smsQueryStringInboundMessages);
        Call call = getInboundSmsMessagesCall(smsQueryStringInboundMessages);
        return apiClient.execute(call, SmsInboundMessageResponse.class);
    }

    /**
     * <p>
     * Get inbound SMS messages (asynchronously).<br>
     * If for some reason you are unable to receive incoming SMS to the endpoint of
     * your choice in real time, you can use this API call to fetch messages. Each
     * request will return a batch of received messages - only once. The API request
     * will only return new messages that arrived since the last API request.
     * </p>
     *
     * @param smsQueryStringInboundMessages SmsInboundMessageResponse
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     */
    public Call getInboundSmsMessagesAsync(
            final SmsQueryStringInboundMessages smsQueryStringInboundMessages,
            final ApiCallback<SmsInboundMessageResponse> apiCallback) throws ApiException {
        validateQueryString(smsQueryStringInboundMessages);
        Call call = getInboundSmsMessagesCall(smsQueryStringInboundMessages, apiCallback);
        apiClient.executeAsync(call, SmsInboundMessageResponse.class, apiCallback);
        return call;
    }

    private Call getInboundSmsMessagesCall(
            final SmsQueryStringInboundMessages smsQueryStringInboundMessages) throws ApiException {
        return getInboundSmsMessagesCall(smsQueryStringInboundMessages, null);
    }

    private Call getInboundSmsMessagesCall(
            final SmsQueryStringInboundMessages smsQueryStringInboundMessages,
            final ApiCallback apiCallback) throws ApiException {
        String queryString = buildQueryString(smsQueryStringInboundMessages);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_INBOUND_SMS_MESSAGES_ENDPOINT, queryString,
                HttpMethodType.GET, httpHeaders, null, apiCallback);
    }
}
