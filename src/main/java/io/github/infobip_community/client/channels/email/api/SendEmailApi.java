
package io.github.infobip_community.client.channels.email.api;

import static io.github.infobip_community.client.common.QueryStringBuilder.buildQueryString;
import static io.github.infobip_community.client.common.RequestValidator.validateBody;
import static io.github.infobip_community.client.common.RequestValidator.validateQueryString;
import io.github.infobip_community.client.channels.email.model.EmailFullyFeatured;
import io.github.infobip_community.client.channels.email.model.EmailQueryStringDeliveryReports;
import io.github.infobip_community.client.channels.email.model.EmailQueryStringLogs;
import io.github.infobip_community.client.channels.email.model.response.EmailLogResponse;
import io.github.infobip_community.client.channels.email.model.response.EmailReportResponse;
import io.github.infobip_community.client.channels.email.model.response.EmailSendResponse;
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
public final class SendEmailApi {
    private static final String GET_EMAIL_DELIVERY_REPORTS_ENDPOINT = "/email/1/reports";
    private static final String GET_EMAIL_LOGS_ENDPOINT = "/email/1/logs";
    private static final String SEND_EMAIL_ENDPOINT = "/email/2/send";
    private ApiClient apiClient;

    public SendEmailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Email delivery reports.<br>
     * Get one-time delivery reports for all sent emails.
     * </p>
     *
     * @param emailQueryStringDeliveryReports (optional)
     * @return ApiResponse&lt;EmailReportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     */
    public ApiResponse<EmailReportResponse> getEmailDeliveryReports(
            final EmailQueryStringDeliveryReports emailQueryStringDeliveryReports)
            throws ApiException {
        validateQueryString(emailQueryStringDeliveryReports);
        Call call = getEmailDeliveryReportsCall(emailQueryStringDeliveryReports);
        return apiClient.execute(call, EmailReportResponse.class);
    }

    /**
     * <p>
     * Email delivery reports (asynchronously).<br>
     * Get one-time delivery reports for all sent emails.
     * </p>
     *
     * @param emailQueryStringDeliveryReports (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     */
    public Call getEmailDeliveryReportsAsync(
            final EmailQueryStringDeliveryReports emailQueryStringDeliveryReports,
            final ApiCallback<EmailReportResponse> apiCallback) throws ApiException {
        validateQueryString(emailQueryStringDeliveryReports);
        Call call = getEmailDeliveryReportsCall(emailQueryStringDeliveryReports, apiCallback);
        apiClient.executeAsync(call, EmailReportResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Get email logs.<br>
     * This method allows you to get email logs of sent Email messagesId for
     * request. Email logs are available for the last 48 hours!
     * </p>
     *
     * @param emailQueryStringLogs (optional)
     * @return ApiResponse&lt;EmailLogResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     */
    public ApiResponse<EmailLogResponse>
            getEmailLogs(final EmailQueryStringLogs emailQueryStringLogs) throws ApiException {
        validateQueryString(emailQueryStringLogs);
        Call call = getEmailLogsCall(emailQueryStringLogs);
        return apiClient.execute(call, EmailLogResponse.class);
    }

    /**
     * <p>
     * Get email logs (asynchronously).<br>
     * This method allows you to get email logs of sent Email messagesId for
     * request. Email logs are available for the last 48 hours!
     * </p>
     *
     * @param emailQueryStringLogs (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     */
    public Call getEmailLogsAsync(final EmailQueryStringLogs emailQueryStringLogs,
            final ApiCallback<EmailLogResponse> apiCallback) throws ApiException {
        validateQueryString(emailQueryStringLogs);
        Call call = getEmailLogsCall(emailQueryStringLogs, apiCallback);
        apiClient.executeAsync(call, EmailLogResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send fully featured email.<br>
     * Send an email or multiple emails to a recipient or multiple recipients with
     * CC/BCC enabled.
     * </p>
     *
     * @param emailFullyFeatured (required)
     * @return ApiResponse&lt;EmailSendResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href="https://www.infobip.com/docs/email">Send fully featured email
     *     Documentation</a>
     */
    public ApiResponse<EmailSendResponse> sendEmail(final EmailFullyFeatured emailFullyFeatured)
            throws ApiException {
        validateBody(emailFullyFeatured);
        Call call = sendEmailCall(emailFullyFeatured);
        return apiClient.execute(call, EmailSendResponse.class);
    }

    /**
     * <p>
     * Send fully featured email (asynchronously).<br>
     * Send an email or multiple emails to a recipient or multiple recipients with
     * CC/BCC enabled.
     * </p>
     *
     * @param emailFullyFeatured (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href="https://www.infobip.com/docs/email">Send fully featured email
     *     Documentation</a>
     */
    public Call sendEmailAsync(final EmailFullyFeatured emailFullyFeatured,
            final ApiCallback<EmailSendResponse> apiCallback) throws ApiException {
        validateBody(emailFullyFeatured);
        Call call = sendEmailCall(emailFullyFeatured, apiCallback);
        apiClient.executeAsync(call, EmailSendResponse.class, apiCallback);
        return call;
    }

    private Call getEmailDeliveryReportsCall(
            final EmailQueryStringDeliveryReports emailQueryStringDeliveryReports)
            throws ApiException {
        return getEmailDeliveryReportsCall(emailQueryStringDeliveryReports, null);
    }

    private Call getEmailDeliveryReportsCall(
            final EmailQueryStringDeliveryReports emailQueryStringDeliveryReports,
            final ApiCallback apiCallback) throws ApiException {
        String queryString = buildQueryString(emailQueryStringDeliveryReports);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_EMAIL_DELIVERY_REPORTS_ENDPOINT, queryString,
                HttpMethodType.GET, httpHeaders, null, apiCallback);
    }

    private Call getEmailLogsCall(final EmailQueryStringLogs emailQueryStringLogs)
            throws ApiException {
        return getEmailLogsCall(emailQueryStringLogs, null);
    }

    private Call getEmailLogsCall(final EmailQueryStringLogs emailQueryStringLogs,
            final ApiCallback apiCallback) throws ApiException {
        String queryString = buildQueryString(emailQueryStringLogs);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_EMAIL_LOGS_ENDPOINT, queryString, HttpMethodType.GET,
                httpHeaders, null, apiCallback);
    }

    private Call sendEmailCall(final EmailFullyFeatured emailFullyFeatured) throws ApiException {
        return sendEmailCall(emailFullyFeatured, null);
    }

    private Call sendEmailCall(final EmailFullyFeatured emailFullyFeatured,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.MULTIPART_FORM_DATA);
        return apiClient.buildCall(SEND_EMAIL_ENDPOINT, null, HttpMethodType.GET, httpHeaders,
                emailFullyFeatured, apiCallback);
    }
}
