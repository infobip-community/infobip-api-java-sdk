
package io.github.infobip_community.client.channels.sms.api;

import static io.github.infobip_community.client.common.QueryStringBuilder.buildQueryString;
import static io.github.infobip_community.client.common.RequestValidator.validateBody;
import static io.github.infobip_community.client.common.RequestValidator.validateQueryString;
import io.github.infobip_community.client.channels.sms.model.message.outbound.SmsAdvancedBinaryMessage;
import io.github.infobip_community.client.channels.sms.model.message.outbound.SmsAdvancedTextMessage;
import io.github.infobip_community.client.channels.sms.model.message.outbound.SmsPreviewMessage;
import io.github.infobip_community.client.channels.sms.model.message.outbound.SmsQueryStringMessage;
import io.github.infobip_community.client.channels.sms.model.message.outbound.SmsQueryStringMessageDeliveryReports;
import io.github.infobip_community.client.channels.sms.model.message.outbound.SmsQueryStringMessageLogs;
import io.github.infobip_community.client.channels.sms.model.message.outbound.response.SmsLogsResponse;
import io.github.infobip_community.client.channels.sms.model.message.outbound.response.SmsPreviewResponse;
import io.github.infobip_community.client.channels.sms.model.message.outbound.response.SmsReportResponse;
import io.github.infobip_community.client.channels.sms.model.message.outbound.response.SmsResponse;
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
public final class SendSmsApi {
    private static final String SEND_SMS_MESSAGE_ENDPOINT = "/sms/2/text/advanced";
    private static final String SEND_BINARY_SMS_MESSAGE_ENDPOINT = "/sms/2/binary/advanced";
    private static final String SEND_SMS_MESSAGE_OVER_QUERY_PARAMETERS_ENDPOINT =
            "/sms/1/text/query";
    private static final String PREVIEW_SMS_MESSAGE_ENDPOINT = "/sms/1/preview";
    private static final String GET_OUTBOUND_SMS_MESSAGE_DELIVERY_REPORTS_ENDPOINT =
            "/sms/1/reports";
    private static final String GET_OUTBOUND_SMS_MESSAGE_LOGS_ENDPOINT = "/sms/1/logs";
    private ApiClient apiClient;

    public SendSmsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Send SMS message.<br>
     * 99% of all use cases can be achieved by using this API method. Everything
     * from sending a simple single message to a single destination, up to batch
     * sending of personalized messages to the thousands of recipients with a single
     * API request. Language, transliteration, scheduling and every advanced feature
     * you can think of is supported.
     * </p>
     *
     * @param smsAdvancedTextMessage SmsAdvancedTextMessage
     * @return ApiResponse&lt;SmsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href="https://www.infobip.com/docs/sms">Send SMS message
     *     Documentation</a>
     */
    public ApiResponse<SmsResponse> sendSmsMessage(
            final SmsAdvancedTextMessage smsAdvancedTextMessage) throws ApiException {
        validateBody(smsAdvancedTextMessage);
        Call call = sendSmsMessageCall(smsAdvancedTextMessage);
        return apiClient.execute(call, SmsResponse.class);
    }

    /**
     * <p>
     * Send SMS message (asynchronously).<br>
     * 99% of all use cases can be achieved by using this API method. Everything
     * from sending a simple single message to a single destination, up to batch
     * sending of personalized messages to the thousands of recipients with a single
     * API request. Language, transliteration, scheduling and every advanced feature
     * you can think of is supported.
     * </p>
     *
     * @param smsAdvancedTextMessage (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href="https://www.infobip.com/docs/sms">Send SMS message
     *     Documentation</a>
     */
    public Call sendSmsMessageAsync(final SmsAdvancedTextMessage smsAdvancedTextMessage,
            final ApiCallback<SmsResponse> apiCallback) throws ApiException {
        validateBody(smsAdvancedTextMessage);
        Call call = sendSmsMessageCall(smsAdvancedTextMessage, apiCallback);
        apiClient.executeAsync(call, SmsResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send binary SMS message.<br>
     * Send single or multiple binary messages to one or more destination address.
     * </p>
     *
     * @param smsAdvancedBinaryMessage (optional)
     * @return ApiResponse&lt;SmsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href="https://www.infobip.com/docs/sms">Send binary SMS message
     *     Documentation</a>
     */
    public ApiResponse<SmsResponse> sendBinarySmsMessage(
            final SmsAdvancedBinaryMessage smsAdvancedBinaryMessage) throws ApiException {
        validateBody(smsAdvancedBinaryMessage);
        Call call = sendBinarySmsMessageCall(smsAdvancedBinaryMessage);
        return apiClient.execute(call, SmsResponse.class);
    }

    /**
     * <p>
     * Send binary SMS message (asynchronously).<br>
     * Send single or multiple binary messages to one or more destination address.
     * </p>
     *
     * @param smsAdvancedBinaryMessage (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href="https://www.infobip.com/docs/sms">Send binary SMS message
     *     Documentation</a>
     */
    public Call sendBinarySmsMessageAsync(final SmsAdvancedBinaryMessage smsAdvancedBinaryMessage,
            final ApiCallback<SmsResponse> apiCallback) throws ApiException {
        validateBody(smsAdvancedBinaryMessage);
        Call call = sendBinarySmsMessageCall(smsAdvancedBinaryMessage, apiCallback);
        apiClient.executeAsync(call, SmsResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send SMS message over query parameters.<br>
     * All message parameters of the message can be defined in the query string. Use
     * this method only if [Send SMS
     * message](#channels/sms/get-outbound-sms-message-delivery-reports) is not an
     * option for your use case!
     * </p>
     *
     * @param smsQueryStringMessage request
     * @return ApiResponse&lt;SmsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     */
    public ApiResponse<SmsResponse> sendSmsMessageOverQueryParameters(
            final SmsQueryStringMessage smsQueryStringMessage) throws ApiException {
        validateQueryString(smsQueryStringMessage);
        Call call = sendSmsMessageOverQueryParametersCall(smsQueryStringMessage);
        return apiClient.execute(call, SmsResponse.class);
    }

    /**
     * <p>
     * Send SMS message over query parameters (asynchronously).<br>
     * All message parameters of the message can be defined in the query string. Use
     * this method only if [Send SMS
     * message](#channels/sms/get-outbound-sms-message-delivery-reports) is not an
     * option for your use case!
     * </p>
     *
     * @param smsQueryStringMessage request
     * @return ApiResponse&lt;SmsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     */
    public Call sendSmsMessageOverQueryParametersAsync(
            final SmsQueryStringMessage smsQueryStringMessage,
            final ApiCallback<SmsResponse> apiCallback) throws ApiException {
        validateQueryString(smsQueryStringMessage);
        Call call = sendSmsMessageOverQueryParametersCall(smsQueryStringMessage, apiCallback);
        apiClient.executeAsync(call, SmsResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Preview SMS message.<br>
     * Avoid unpleasant surprises and check how different message configurations
     * will affect your message text, number of characters and message parts.
     * </p>
     *
     * @param smsPreviewMessage (optional)
     * @return ApiResponse&lt;SmsPreviewResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href="https://www.infobip.com/docs/sms">Preview SMS message
     *     Documentation</a>
     */
    public ApiResponse<SmsPreviewResponse>
            previewSmsMessage(final SmsPreviewMessage smsPreviewMessage) throws ApiException {
        validateBody(smsPreviewMessage);
        Call call = previewSmsMessageCall(smsPreviewMessage);
        return apiClient.execute(call, SmsPreviewResponse.class);
    }

    /**
     * <p>
     * Preview SMS message (asynchronously).<br>
     * Avoid unpleasant surprises and check how different message configurations
     * will affect your message text, number of characters and message parts.
     * </p>
     *
     * @param smsPreviewMessage (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href="https://www.infobip.com/docs/sms">Preview SMS message
     *     Documentation</a>
     */
    public Call previewSmsMessageAsync(final SmsPreviewMessage smsPreviewMessage,
            final ApiCallback<SmsPreviewResponse> apiCallback) throws ApiException {
        validateBody(smsPreviewMessage);
        Call call = previewSmsMessageCall(smsPreviewMessage, apiCallback);
        apiClient.executeAsync(call, SmsPreviewResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Get outbound SMS message delivery reports.<br>
     * If you are for any reason unable to receive real-time delivery reports on
     * your endpoint, you can use this API method to learn if and when the message
     * has been delivered to the recipient. Each request will return a batch of
     * delivery reports - only once. The following API request will return only new
     * reports that arrived since the last API request in the last 48 hours.
     * </p>
     *
     * @param smsQueryStringMessageDeliveryReports
     *     SmsQueryStringMessageDeliveryReports
     * @return ApiResponse&lt;SmsReportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href="https://www.infobip.com/docs/sms">Get outbound SMS message
     *     delivery reports Documentation</a>
     */
    public ApiResponse<SmsReportResponse> getOutboundSmsMessageDeliveryReports(
            final SmsQueryStringMessageDeliveryReports smsQueryStringMessageDeliveryReports)
            throws ApiException {
        validateQueryString(smsQueryStringMessageDeliveryReports);
        Call call = getOutboundSmsMessageDeliveryReportsCall(smsQueryStringMessageDeliveryReports);
        return apiClient.execute(call, SmsReportResponse.class);
    }

    /**
     * <p>
     * Get outbound SMS message delivery reports (asynchronously).<br>
     * If you are for any reason unable to receive real-time delivery reports on
     * your endpoint, you can use this API method to learn if and when the message
     * has been delivered to the recipient. Each request will return a batch of
     * delivery reports - only once. The following API request will return only new
     * reports that arrived since the last API request in the last 48 hours.
     * </p>
     *
     * @param smsQueryStringMessageDeliveryReports
     *     SmsQueryStringMessageDeliveryReports
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href="https://www.infobip.com/docs/sms">Get outbound SMS message
     *     delivery reports Documentation</a>
     */
    public Call getOutboundSmsMessageDeliveryReportsAsync(
            final SmsQueryStringMessageDeliveryReports smsQueryStringMessageDeliveryReports,
            final ApiCallback<SmsReportResponse> apiCallback) throws ApiException {
        validateQueryString(smsQueryStringMessageDeliveryReports);
        Call call = getOutboundSmsMessageDeliveryReportsCall(smsQueryStringMessageDeliveryReports,
                apiCallback);
        apiClient.executeAsync(call, SmsReportResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Get outbound SMS message logs<.br>
     * Use this method for displaying logs for example in the user interface. The
     * only available logs are for the last 48 hours. See [message delivery
     * reports](#channels/sms/get-outbound-sms-message-delivery-reports) if your use
     * case is to verify message delivery.
     * </p>
     *
     * @param smsQueryStringMessageLogs SmsQueryStringMessageLogs
     * @return ApiResponse&lt;SmsLogsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href="https://www.infobip.com/docs/sms">Get outbound SMS message logs
     *     Documentation</a>
     */
    public ApiResponse<SmsLogsResponse> getOutboundSmsMessageLogs(
            final SmsQueryStringMessageLogs smsQueryStringMessageLogs) throws ApiException {
        validateQueryString(smsQueryStringMessageLogs);
        Call call = getOutboundSmsMessageLogsCall(smsQueryStringMessageLogs);
        return apiClient.execute(call, SmsLogsResponse.class);
    }

    /**
     * <p>
     * Get outbound SMS message logs (asynchronously).<br>
     * Use this method for displaying logs for example in the user interface. The
     * only available logs are for the last 48 hours. See [message delivery
     * reports](#channels/sms/get-outbound-sms-message-delivery-reports) if your use
     * case is to verify message delivery.
     * </p>
     *
     * @param smsQueryStringMessageLogs SmsQueryStringMessageLogs
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href="https://www.infobip.com/docs/sms">Get outbound SMS message logs
     *     Documentation</a>
     */
    public Call getOutboundSmsMessageLogsAsync(
            final SmsQueryStringMessageLogs smsQueryStringMessageLogs,
            final ApiCallback<SmsLogsResponse> apiCallback) throws ApiException {
        validateQueryString(smsQueryStringMessageLogs);
        Call call = getOutboundSmsMessageLogsCall(smsQueryStringMessageLogs, apiCallback);
        apiClient.executeAsync(call, SmsLogsResponse.class, apiCallback);
        return call;
    }

    private Call sendSmsMessageCall(final SmsAdvancedTextMessage smsAdvancedTextMessage)
            throws ApiException {
        return sendSmsMessageCall(smsAdvancedTextMessage, null);
    }

    private Call sendSmsMessageCall(final SmsAdvancedTextMessage smsAdvancedTextMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(SEND_SMS_MESSAGE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, smsAdvancedTextMessage, apiCallback);
    }

    private Call sendBinarySmsMessageCall(final SmsAdvancedBinaryMessage smsAdvancedBinaryMessage)
            throws ApiException {
        return sendBinarySmsMessageCall(smsAdvancedBinaryMessage, null);
    }

    private Call sendBinarySmsMessageCall(final SmsAdvancedBinaryMessage smsAdvancedBinaryMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(SEND_BINARY_SMS_MESSAGE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, smsAdvancedBinaryMessage, apiCallback);
    }

    private Call sendSmsMessageOverQueryParametersCall(
            final SmsQueryStringMessage smsQueryStringMessage) throws ApiException {
        return sendSmsMessageOverQueryParametersCall(smsQueryStringMessage, null);
    }

    private Call sendSmsMessageOverQueryParametersCall(
            final SmsQueryStringMessage smsQueryStringMessage, final ApiCallback apiCallback)
            throws ApiException {
        String queryString = buildQueryString(smsQueryStringMessage);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(SEND_SMS_MESSAGE_OVER_QUERY_PARAMETERS_ENDPOINT, queryString,
                HttpMethodType.GET, httpHeaders, null, apiCallback);
    }

    private Call previewSmsMessageCall(final SmsPreviewMessage smsPreviewMessage)
            throws ApiException {
        return previewSmsMessageCall(smsPreviewMessage, null);
    }

    private Call previewSmsMessageCall(SmsPreviewMessage smsPreviewMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(PREVIEW_SMS_MESSAGE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, smsPreviewMessage, apiCallback);
    }

    private Call getOutboundSmsMessageDeliveryReportsCall(
            final SmsQueryStringMessageDeliveryReports smsQueryStringMessageDeliveryReports)
            throws ApiException {
        return getOutboundSmsMessageDeliveryReportsCall(smsQueryStringMessageDeliveryReports, null);
    }

    private Call getOutboundSmsMessageDeliveryReportsCall(
            final SmsQueryStringMessageDeliveryReports smsQueryStringMessageDeliveryReports,
            final ApiCallback apiCallback) throws ApiException {
        String queryString = buildQueryString(smsQueryStringMessageDeliveryReports);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_OUTBOUND_SMS_MESSAGE_DELIVERY_REPORTS_ENDPOINT, queryString,
                HttpMethodType.GET, httpHeaders, null, apiCallback);
    }

    private Call getOutboundSmsMessageLogsCall(
            final SmsQueryStringMessageLogs smsQueryStringMessageLogs) throws ApiException {
        return getOutboundSmsMessageLogsCall(smsQueryStringMessageLogs, null);
    }

    private Call getOutboundSmsMessageLogsCall(
            final SmsQueryStringMessageLogs smsQueryStringMessageLogs,
            final ApiCallback apiCallback) throws ApiException {
        String queryString = buildQueryString(smsQueryStringMessageLogs);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_OUTBOUND_SMS_MESSAGE_LOGS_ENDPOINT, queryString,
                HttpMethodType.GET, httpHeaders, null, apiCallback);
    }
}
