
package io.github.infobip_community.client.channels.mms.api;

import static io.github.infobip_community.client.common.QueryStringBuilder.buildQueryString;
import static io.github.infobip_community.client.common.RequestValidator.validateBody;
import static io.github.infobip_community.client.common.RequestValidator.validateQueryString;
import io.github.infobip_community.client.channels.mms.model.MmsQueryStringDeliveryReports;
import io.github.infobip_community.client.channels.mms.model.MmsSingleMessage;
import io.github.infobip_community.client.channels.mms.model.response.MmsReportResponse;
import io.github.infobip_community.client.channels.mms.model.response.MmsSendResponse;
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
public final class SendMmsApi {
    private static final String SEND_MMS_SINGLE_MESSAGE_ENDPOINT = "/mms/1/single";
    private static final String GET_OUTBOUND_MMS_MESSAGE_DELIVERY_REPORTS_ENDPOINT =
            "/mms/1/reports";
    private ApiClient apiClient;

    public SendMmsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Send single MMS message.<br>
     * This method allows you to send single MMS message to one destination address.
     * </p>
     *
     * @param mmsSingleMessage (optional)
     * @return ApiResponse&lt;MmsSendResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     */
    public ApiResponse<MmsSendResponse>
            sendMmsSingleMessage(final MmsSingleMessage mmsSingleMessage) throws ApiException {
        validateBody(mmsSingleMessage);
        Call call = sendMmsSingleMessageCall(mmsSingleMessage);
        return apiClient.execute(call, MmsSendResponse.class);
    }

    /**
     * <p>
     * Send single MMS message (asynchronously).<br>
     * This method allows you to send single MMS message to one destination address.
     * </p>
     *
     * @param mmsSingleMessage (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     */
    public Call sendMmsSingleMessageAsync(final MmsSingleMessage mmsSingleMessage,
            final ApiCallback<MmsSendResponse> apiCallback) throws ApiException {
        validateBody(mmsSingleMessage);
        Call call = sendMmsSingleMessageCall(mmsSingleMessage, apiCallback);
        apiClient.executeAsync(call, MmsSendResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Get outbound MMS message delivery reports.<br>
     * If you are for any reason unable to receive real time delivery reports on
     * your endpoint, you can use this API method to learn if and when the message
     * has been delivered to the recipient. Each request will return a batch of
     * delivery reports - only once. The following API request will return only new
     * reports that arrived since the last API request.
     * </p>
     *
     * @param mmsQueryStringDeliveryReports (optional)
     * @return ApiResponse&lt;MmsReportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     */
    public ApiResponse<MmsReportResponse> getOutboundMmsMessageDeliveryReports(
            final MmsQueryStringDeliveryReports mmsQueryStringDeliveryReports) throws ApiException {
        validateQueryString(mmsQueryStringDeliveryReports);
        Call call = getOutboundMmsMessageDeliveryReportsCall(mmsQueryStringDeliveryReports);
        return apiClient.execute(call, MmsReportResponse.class);
    }

    /**
     * <p>
     * Get outbound MMS message delivery reports (asynchronously).<br>
     * If you are for any reason unable to receive real time delivery reports on
     * your endpoint, you can use this API method to learn if and when the message
     * has been delivered to the recipient. Each request will return a batch of
     * delivery reports - only once. The following API request will return only new
     * reports that arrived since the last API request.
     * </p>
     *
     * @param mmsQueryStringDeliveryReports (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     */
    public Call getOutboundMmsMessageDeliveryReportsAsync(
            final MmsQueryStringDeliveryReports mmsQueryStringDeliveryReports,
            final ApiCallback<MmsReportResponse> apiCallback) throws ApiException {
        validateQueryString(mmsQueryStringDeliveryReports);
        Call call = getOutboundMmsMessageDeliveryReportsCall(mmsQueryStringDeliveryReports,
                apiCallback);
        apiClient.executeAsync(call, MmsReportResponse.class, apiCallback);
        return call;
    }

    private Call sendMmsSingleMessageCall(final MmsSingleMessage mmsSingleMessage)
            throws ApiException {
        return sendMmsSingleMessageCall(mmsSingleMessage, null);
    }

    private Call sendMmsSingleMessageCall(final MmsSingleMessage mmsSingleMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.MULTIPART_FORM_DATA);
        return apiClient.buildCall(SEND_MMS_SINGLE_MESSAGE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, mmsSingleMessage, apiCallback);
    }

    private Call getOutboundMmsMessageDeliveryReportsCall(
            final MmsQueryStringDeliveryReports mmsQueryStringDeliveryReports) throws ApiException {
        return getOutboundMmsMessageDeliveryReportsCall(mmsQueryStringDeliveryReports, null);
    }

    private Call getOutboundMmsMessageDeliveryReportsCall(
            final MmsQueryStringDeliveryReports mmsQueryStringDeliveryReports,
            final ApiCallback apiCallback) throws ApiException {
        String queryString = buildQueryString(mmsQueryStringDeliveryReports);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_OUTBOUND_MMS_MESSAGE_DELIVERY_REPORTS_ENDPOINT, queryString,
                HttpMethodType.GET, httpHeaders, null, apiCallback);
    }
}
