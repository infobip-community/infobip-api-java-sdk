
package io.github.infobip_community.client.channels.sms.api;

import static io.github.infobip_community.client.common.QueryStringBuilder.buildQueryString;
import static io.github.infobip_community.client.common.RequestValidator.validateBody;
import static io.github.infobip_community.client.common.RequestValidator.validateQueryString;
import io.github.infobip_community.client.channels.sms.model.message.scheduled.SmsQueryStringScheduledMessages;
import io.github.infobip_community.client.channels.sms.model.message.scheduled.SmsRescheduleMessage;
import io.github.infobip_community.client.channels.sms.model.message.scheduled.SmsUpdateStatus;
import io.github.infobip_community.client.channels.sms.model.message.scheduled.response.SmsBulkResponse;
import io.github.infobip_community.client.channels.sms.model.message.scheduled.response.SmsBulkStatusResponse;
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
public final class ScheduledSmsApi {
    private static final String GET_SCHEDULED_SMS_MESSAGES_ENDPOINT = "/sms/1/bulks";
    private static final String RESCHEDULE_SMS_MESSAGES_ENDPOINT = "/sms/1/bulks";
    private static final String GET_SCHEDULED_SMS_MESSAGES_STATUS_ENDPOINT = "/sms/1/bulks/status";
    private static final String UPDATE_SCHEDULED_SMS_MESSAGES_STATUS_ENDPOINT =
            "/sms/1/bulks/status";
    private ApiClient apiClient;

    public ScheduledSmsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Get scheduled SMS messages.<br>
     * See the status and the scheduled time of your SMS messages.
     * </p>
     *
     * @param smsQueryStringScheduledMessages SmsQueryStringScheduledMessages
     * @return ApiResponse&lt;SmsBulkResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href="https://www.infobip.com/docs/sms">Get scheduled SMS messages
     *     Documentation</a>
     */
    public ApiResponse<SmsBulkResponse> getScheduledSmsMessages(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages)
            throws ApiException {
        validateQueryString(smsQueryStringScheduledMessages);
        Call call = getScheduledSmsMessagesCall(smsQueryStringScheduledMessages);
        return apiClient.execute(call, SmsBulkResponse.class);
    }

    /**
     * <p>
     * Get scheduled SMS messages (asynchronously).<br>
     * See the status and the scheduled time of your SMS messages.
     * </p>
     *
     * @param smsQueryStringScheduledMessages SmsQueryStringScheduledMessages
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href="https://www.infobip.com/docs/sms">Get scheduled SMS messages
     *     Documentation</a>
     */
    public Call getScheduledSmsMessagesAsync(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages,
            final ApiCallback<SmsBulkResponse> apiCallback) throws ApiException {
        validateQueryString(smsQueryStringScheduledMessages);
        Call call = getScheduledSmsMessagesCall(smsQueryStringScheduledMessages, apiCallback);
        apiClient.executeAsync(call, SmsBulkResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Reschedule SMS messages.<br>
     * Change the date and time for sending scheduled messages.
     * </p>
     *
     * @param smsQueryStringScheduledMessages SmsQueryStringScheduledMessages
     * @param smsRescheduleMessage (optional)
     * @return ApiResponse&lt;SmsBulkResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href="https://www.infobip.com/docs/sms">Reschedule SMS messages
     *     Documentation</a>
     */
    public ApiResponse<SmsBulkResponse> rescheduleSmsMessages(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages,
            final SmsRescheduleMessage smsRescheduleMessage) throws ApiException {
        validateQueryString(smsQueryStringScheduledMessages);
        validateBody(smsRescheduleMessage);
        Call call =
                rescheduleSmsMessagesCall(smsQueryStringScheduledMessages, smsRescheduleMessage);
        return apiClient.execute(call, SmsBulkResponse.class);
    }

    /**
     * <p>
     * Reschedule SMS messages (asynchronously).<br>
     * Change the date and time for sending scheduled messages.
     * </p>
     *
     * @param smsQueryStringScheduledMessages SmsQueryStringScheduledMessages
     * @param smsRescheduleMessage (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href="https://www.infobip.com/docs/sms">Reschedule SMS messages
     *     Documentation</a>
     */
    public Call rescheduleSmsMessagesAsync(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages,
            final SmsRescheduleMessage smsRescheduleMessage,
            final ApiCallback<SmsBulkResponse> apiCallback) throws ApiException {
        validateQueryString(smsQueryStringScheduledMessages);
        validateBody(smsRescheduleMessage);
        Call call = rescheduleSmsMessagesCall(smsQueryStringScheduledMessages, smsRescheduleMessage,
                apiCallback);
        apiClient.executeAsync(call, SmsBulkResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Get scheduled SMS messages status.<br>
     * See the status of scheduled messages.
     * </p>
     *
     * @param smsQueryStringScheduledMessages SmsQueryStringScheduledMessages
     * @return ApiResponse&lt;SmsBulkStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href="https://www.infobip.com/docs/sms">Get scheduled SMS messages
     *     status Documentation</a>
     */
    public ApiResponse<SmsBulkStatusResponse> getScheduledSmsMessagesStatus(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages)
            throws ApiException {
        validateQueryString(smsQueryStringScheduledMessages);
        Call call = getScheduledSmsMessagesStatusCall(smsQueryStringScheduledMessages);
        return apiClient.execute(call, SmsBulkStatusResponse.class);
    }

    /**
     * <p>
     * Get scheduled SMS messages status (asynchronously).<br>
     * See the status of scheduled messages.
     * </p>
     *
     * @param smsQueryStringScheduledMessages SmsQueryStringScheduledMessages
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href="https://www.infobip.com/docs/sms">Get scheduled SMS messages
     *     status Documentation</a>
     */
    public Call getScheduledSmsMessagesStatusAsync(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages,
            final ApiCallback<SmsBulkStatusResponse> apiCallback) throws ApiException {
        validateQueryString(smsQueryStringScheduledMessages);
        Call call = getScheduledSmsMessagesStatusCall(smsQueryStringScheduledMessages, apiCallback);
        apiClient.executeAsync(call, SmsBulkStatusResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Update scheduled SMS messages status.<br>
     * Change status or completely cancel sending of scheduled messages.
     * </p>
     *
     * @param smsQueryStringScheduledMessages SmsQueryStringScheduledMessages
     * @param smsUpdateStatus (optional)
     * @return ApiResponse&lt;SmsBulkStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href="https://www.infobip.com/docs/sms">Update scheduled SMS messages
     *     status Documentation</a>
     */
    public ApiResponse<SmsBulkStatusResponse> updateScheduledSmsMessagesStatus(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages,
            final SmsUpdateStatus smsUpdateStatus) throws ApiException {
        validateQueryString(smsQueryStringScheduledMessages);
        validateBody(smsUpdateStatus);
        Call call = updateScheduledSmsMessagesStatusCall(smsQueryStringScheduledMessages,
                smsUpdateStatus);
        return apiClient.execute(call, SmsBulkStatusResponse.class);
    }

    /**
     * <p>
     * Update scheduled SMS messages status (asynchronously).<br>
     * Change status or completely cancel sending of scheduled messages.
     * </p>
     *
     * @param smsQueryStringScheduledMessages SmsQueryStringScheduledMessages
     * @param smsUpdateStatus (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href="https://www.infobip.com/docs/sms">Update scheduled SMS messages
     *     status Documentation</a>
     */
    public Call updateScheduledSmsMessagesStatusAsync(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages,
            final SmsUpdateStatus smsUpdateStatus,
            final ApiCallback<SmsBulkStatusResponse> apiCallback) throws ApiException {
        validateQueryString(smsQueryStringScheduledMessages);
        validateBody(smsUpdateStatus);
        Call call = updateScheduledSmsMessagesStatusCall(smsQueryStringScheduledMessages,
                smsUpdateStatus, apiCallback);
        apiClient.executeAsync(call, SmsBulkStatusResponse.class, apiCallback);
        return call;
    }

    private Call getScheduledSmsMessagesCall(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages)
            throws ApiException {
        return getScheduledSmsMessagesCall(smsQueryStringScheduledMessages, null);
    }

    private Call getScheduledSmsMessagesCall(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages,
            final ApiCallback apiCallback) throws ApiException {
        String queryString = buildQueryString(smsQueryStringScheduledMessages);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_SCHEDULED_SMS_MESSAGES_ENDPOINT, queryString,
                HttpMethodType.GET, httpHeaders, null, apiCallback);
    }

    private Call rescheduleSmsMessagesCall(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages,
            final SmsRescheduleMessage smsRescheduleMessage) throws ApiException {
        return rescheduleSmsMessagesCall(smsQueryStringScheduledMessages, smsRescheduleMessage,
                null);
    }

    private Call rescheduleSmsMessagesCall(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages,
            final SmsRescheduleMessage smsRescheduleMessage, final ApiCallback apiCallback)
            throws ApiException {
        String queryString = buildQueryString(smsQueryStringScheduledMessages);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(RESCHEDULE_SMS_MESSAGES_ENDPOINT, queryString,
                HttpMethodType.PUT, httpHeaders, smsRescheduleMessage, apiCallback);
    }

    private Call getScheduledSmsMessagesStatusCall(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages)
            throws ApiException {
        return getScheduledSmsMessagesStatusCall(smsQueryStringScheduledMessages, null);
    }

    private Call getScheduledSmsMessagesStatusCall(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages,
            final ApiCallback apiCallback) throws ApiException {
        String queryString = buildQueryString(smsQueryStringScheduledMessages);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_SCHEDULED_SMS_MESSAGES_STATUS_ENDPOINT, queryString,
                HttpMethodType.GET, httpHeaders, null, apiCallback);
    }

    private Call updateScheduledSmsMessagesStatusCall(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages,
            final SmsUpdateStatus smsUpdateStatus) throws ApiException {
        return updateScheduledSmsMessagesStatusCall(smsQueryStringScheduledMessages,
                smsUpdateStatus, null);
    }

    private Call updateScheduledSmsMessagesStatusCall(
            final SmsQueryStringScheduledMessages smsQueryStringScheduledMessages,
            final SmsUpdateStatus smsUpdateStatus, final ApiCallback apiCallback)
            throws ApiException {
        String queryString = buildQueryString(smsQueryStringScheduledMessages);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(UPDATE_SCHEDULED_SMS_MESSAGES_STATUS_ENDPOINT, queryString,
                HttpMethodType.PUT, httpHeaders, smsUpdateStatus, apiCallback);
    }
}
