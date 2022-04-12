
package io.github.infobip_community.client.channels.email.api;

import static io.github.infobip_community.client.common.QueryStringBuilder.buildQueryString;
import static io.github.infobip_community.client.common.RequestValidator.validateBody;
import static io.github.infobip_community.client.common.RequestValidator.validateQueryString;
import io.github.infobip_community.client.channels.email.model.EmailBulksReschedule;
import io.github.infobip_community.client.channels.email.model.EmailQueryStringSentBulks;
import io.github.infobip_community.client.channels.email.model.EmailScheduledStatus;
import io.github.infobip_community.client.channels.email.model.response.EmailBulkScheduleResponse;
import io.github.infobip_community.client.channels.email.model.response.EmailBulkStatusResponse;
import io.github.infobip_community.client.channels.email.model.response.EmailBulkUpdateStatusResponse;
import io.github.infobip_community.client.channels.email.model.response.EmailRescheduleResponse;
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
public final class ScheduledEmailApi {
    private static final String GET_SCHEDULED_EMAILS_ENDPOINT = "/email/1/bulks";
    private static final String RESCHEDULE_EMAILS_ENDPOINT = "/email/1/bulks";
    private static final String GET_SCHEDULED_EMAIL_STATUSES_ENDPOINT = "/email/1/bulks/status";
    private static final String UPDATE_SCHEDULED_EMAIL_STATUSES_ENDPOINT = "/email/1/bulks/status";
    private ApiClient apiClient;

    public ScheduledEmailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Get sent email bulks.<br>
     * See the scheduled time of your Email messages.
     * </p>
     *
     * @param emailQueryStringSentBulks (required)
     * @return ApiResponse&lt;EmailBulkScheduleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     */
    public ApiResponse<EmailBulkScheduleResponse> getScheduledEmails(
            final EmailQueryStringSentBulks emailQueryStringSentBulks) throws ApiException {
        validateQueryString(emailQueryStringSentBulks);
        Call call = getScheduledEmailsCall(emailQueryStringSentBulks);
        return apiClient.execute(call, EmailBulkScheduleResponse.class);
    }

    /**
     * <p>
     * Get sent email bulks (asynchronously).<br>
     * See the scheduled time of your Email messages.
     * </p>
     *
     * @param emailQueryStringSentBulks (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     */
    public Call getScheduledEmailsAsync(final EmailQueryStringSentBulks emailQueryStringSentBulks,
            final ApiCallback<EmailBulkScheduleResponse> apiCallback) throws ApiException {
        validateQueryString(emailQueryStringSentBulks);
        Call call = getScheduledEmailsCall(emailQueryStringSentBulks, apiCallback);
        apiClient.executeAsync(call, EmailBulkScheduleResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Reschedule Email messages.<br>
     * Change the date and time for sending scheduled messages.
     * </p>
     *
     * @param emailQueryStringSentBulks (required)
     * @param emailBulksReschedule (required)
     * @return ApiResponse&lt;EmailRescheduleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     */
    public ApiResponse<EmailRescheduleResponse> rescheduleEmails(
            final EmailQueryStringSentBulks emailQueryStringSentBulks,
            final EmailBulksReschedule emailBulksReschedule) throws ApiException {
        validateQueryString(emailQueryStringSentBulks);
        validateBody(emailBulksReschedule);
        Call call = rescheduleEmailsCall(emailQueryStringSentBulks, emailBulksReschedule);
        return apiClient.execute(call, EmailRescheduleResponse.class);
    }

    /**
     * <p>
     * Reschedule Email messages (asynchronously).<br>
     * Change the date and time for sending scheduled messages.
     * </p>
     *
     * @param emailQueryStringSentBulks (required)
     * @param emailBulksReschedule (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     */
    public Call rescheduleEmailsAsync(final EmailQueryStringSentBulks emailQueryStringSentBulks,
            final EmailBulksReschedule emailBulksReschedule,
            final ApiCallback<EmailRescheduleResponse> apiCallback) throws ApiException {
        validateQueryString(emailQueryStringSentBulks);
        validateBody(emailBulksReschedule);
        Call call =
                rescheduleEmailsCall(emailQueryStringSentBulks, emailBulksReschedule, apiCallback);
        apiClient.executeAsync(call, EmailRescheduleResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Get sent email bulks status.<br>
     * See the status of scheduled email messages.
     * </p>
     *
     * @param emailQueryStringSentBulks (required)
     * @return ApiResponse&lt;EmailBulkStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     */
    public ApiResponse<EmailBulkStatusResponse> getScheduledEmailStatuses(
            final EmailQueryStringSentBulks emailQueryStringSentBulks) throws ApiException {
        validateQueryString(emailQueryStringSentBulks);
        Call call = getScheduledEmailStatusesCall(emailQueryStringSentBulks);
        return apiClient.execute(call, EmailBulkStatusResponse.class);
    }

    /**
     * <p>
     * Get sent email bulks status (asynchronously).<br>
     * See the status of scheduled email messages.
     * </p>
     *
     * @param emailQueryStringSentBulks (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     */
    public Call getScheduledEmailStatusesAsync(
            final EmailQueryStringSentBulks emailQueryStringSentBulks,
            final ApiCallback<EmailBulkStatusResponse> apiCallback) throws ApiException {
        validateQueryString(emailQueryStringSentBulks);
        Call call = getScheduledEmailStatusesCall(emailQueryStringSentBulks, apiCallback);
        apiClient.executeAsync(call, EmailBulkStatusResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Update scheduled Email messages status.<br>
     * Change status or completely cancel sending of scheduled messages.
     * </p>
     *
     * @param emailQueryStringSentBulks (required)
     * @param emailScheduledStatus (required)
     * @return ApiResponse&lt;EmailBulkUpdateStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     */
    public ApiResponse<EmailBulkUpdateStatusResponse> updateScheduledEmailStatuses(
            final EmailQueryStringSentBulks emailQueryStringSentBulks,
            final EmailScheduledStatus emailScheduledStatus) throws ApiException {
        validateQueryString(emailQueryStringSentBulks);
        validateBody(emailScheduledStatus);
        Call call =
                updateScheduledEmailStatusesCall(emailQueryStringSentBulks, emailScheduledStatus);
        return apiClient.execute(call, EmailBulkUpdateStatusResponse.class);
    }

    /**
     * <p>
     * Update scheduled Email messages status (asynchronously).<br>
     * Change status or completely cancel sending of scheduled messages.
     * </p>
     *
     * @param emailQueryStringSentBulks (required)
     * @param emailScheduledStatus (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     */
    public Call updateScheduledEmailStatusesAsync(
            final EmailQueryStringSentBulks emailQueryStringSentBulks,
            final EmailScheduledStatus emailScheduledStatus,
            final ApiCallback<EmailBulkUpdateStatusResponse> apiCallback) throws ApiException {
        validateQueryString(emailQueryStringSentBulks);
        validateBody(emailScheduledStatus);
        Call call = updateScheduledEmailStatusesCall(emailQueryStringSentBulks,
                emailScheduledStatus, apiCallback);
        apiClient.executeAsync(call, EmailBulkUpdateStatusResponse.class, apiCallback);
        return call;
    }

    private Call getScheduledEmailsCall(final EmailQueryStringSentBulks emailQueryStringSentBulks)
            throws ApiException {
        return getScheduledEmailsCall(emailQueryStringSentBulks, null);
    }

    private Call getScheduledEmailsCall(final EmailQueryStringSentBulks emailQueryStringSentBulks,
            final ApiCallback apiCallback) throws ApiException {
        String queryString = buildQueryString(emailQueryStringSentBulks);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_SCHEDULED_EMAILS_ENDPOINT, queryString, HttpMethodType.GET,
                httpHeaders, null, apiCallback);
    }

    private Call rescheduleEmailsCall(final EmailQueryStringSentBulks emailQueryStringSentBulks,
            final EmailBulksReschedule emailBulksReschedule) throws ApiException {
        return rescheduleEmailsCall(emailQueryStringSentBulks, emailBulksReschedule, null);
    }

    private Call rescheduleEmailsCall(final EmailQueryStringSentBulks emailQueryStringSentBulks,
            final EmailBulksReschedule emailBulksReschedule, final ApiCallback apiCallback)
            throws ApiException {
        String queryString = buildQueryString(emailQueryStringSentBulks);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(RESCHEDULE_EMAILS_ENDPOINT, queryString, HttpMethodType.PUT,
                httpHeaders, emailBulksReschedule, apiCallback);
    }

    private Call getScheduledEmailStatusesCall(
            final EmailQueryStringSentBulks emailQueryStringSentBulks) throws ApiException {
        return getScheduledEmailStatusesCall(emailQueryStringSentBulks, null);
    }

    private Call getScheduledEmailStatusesCall(
            final EmailQueryStringSentBulks emailQueryStringSentBulks,
            final ApiCallback apiCallback) throws ApiException {
        String queryString = buildQueryString(emailQueryStringSentBulks);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_SCHEDULED_EMAIL_STATUSES_ENDPOINT, queryString,
                HttpMethodType.GET, httpHeaders, null, apiCallback);
    }

    private Call updateScheduledEmailStatusesCall(
            final EmailQueryStringSentBulks emailQueryStringSentBulks,
            final EmailScheduledStatus emailScheduledStatus) throws ApiException {
        return updateScheduledEmailStatusesCall(emailQueryStringSentBulks, emailScheduledStatus,
                null);
    }

    private Call updateScheduledEmailStatusesCall(
            final EmailQueryStringSentBulks emailQueryStringSentBulks,
            final EmailScheduledStatus emailScheduledStatus, final ApiCallback apiCallback)
            throws ApiException {
        String queryString = buildQueryString(emailQueryStringSentBulks);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(UPDATE_SCHEDULED_EMAIL_STATUSES_ENDPOINT, queryString,
                HttpMethodType.PUT, httpHeaders, emailScheduledStatus, apiCallback);
    }
}
