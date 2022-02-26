
package com.infobip.client.channels.webrtc.api;

import com.infobip.client.channels.webrtc.model.WebrtcApplicationRequest;
import com.infobip.client.channels.webrtc.model.WebrtcApplicationResponse;
import com.infobip.client.channels.webrtc.model.WebrtcApplicationResponses;
import com.infobip.client.common.ApiCallback;
import com.infobip.client.common.ApiClient;
import com.infobip.client.common.ApiException;
import com.infobip.client.common.ApiResponse;
import com.infobip.client.common.HttpHeader;
import com.infobip.client.common.HttpMethodType;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;

public final class WebRtcApplicationsApi {
    private static final String WEBRTC_APPLICATIONS_ENDPOINT = "/webrtc/1/applications";
    private static final String GET_WEBRTC_APPLICATIONS_ENDPOINT = WEBRTC_APPLICATIONS_ENDPOINT;
    private static final String SAVE_WEBRTC_APPLICATION_ENDPOINT = WEBRTC_APPLICATIONS_ENDPOINT;
    private static final String GET_WEBRTC_APPLICATION_ENDPOINT =
            WEBRTC_APPLICATIONS_ENDPOINT + "/{id}";
    private static final String UPDATE_WEBRTC_APPLICATION_ENDPOINT =
            GET_WEBRTC_APPLICATION_ENDPOINT;
    private static final String DELETE_WEBRTC_APPLICATION_ENDPOINT =
            GET_WEBRTC_APPLICATION_ENDPOINT;
    private ApiClient apiClient;

    public WebRtcApplicationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Get WebRTC applications.<br>
     * List all applications for WebRTC channel.
     * </p>
     *
     * @return ApiResponse&lt;List&lt;WebrtcApplicationResponse&gt;&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<WebrtcApplicationResponses> getWebrtcApplications() throws ApiException {
        Call call = getWebrtcApplicationsValidateBeforeCall();
        return apiClient.execute(call, WebrtcApplicationResponses.class);
    }

    /**
     * <p>
     * Get WebRTC applications (asynchronously).<br>
     * List all applications for WebRTC channel.
     * </p>
     *
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException in case of error(s)
     */
    public Call getWebrtcApplicationsAsync(
            final ApiCallback<WebrtcApplicationResponses> apiCallback) throws ApiException {
        Call call = getWebrtcApplicationsValidateBeforeCall(apiCallback);
        apiClient.executeAsync(call, WebrtcApplicationResponses.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Save WebRTC application.<br>
     * Create and configure a new WebRTC application.
     * </p>
     *
     * @param webrtcApplicationRequest (optional)
     * @return ApiResponse&lt;WebrtcApplicationResponse&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<WebrtcApplicationResponse> saveWebrtcApplication(
            WebrtcApplicationRequest webrtcApplicationRequest) throws ApiException {
        Call call = saveWebrtcApplicationValidateBeforeCall(webrtcApplicationRequest);
        return apiClient.execute(call, WebrtcApplicationResponse.class);
    }

    /**
     * <p>
     * Save WebRTC application (asynchronously).<br>
     * Create and configure a new WebRTC application.
     * </p>
     *
     * @param webrtcApplicationRequest (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException in case of error(s)
     */
    public Call saveWebrtcApplicationAsync(final WebrtcApplicationRequest webrtcApplicationRequest,
            final ApiCallback<WebrtcApplicationResponse> apiCallback) throws ApiException {
        Call call = saveWebrtcApplicationValidateBeforeCall(webrtcApplicationRequest, apiCallback);
        apiClient.executeAsync(call, WebrtcApplicationResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Get WebRTC application.<br>
     * Get a single WebRTC application to see its configuration details.
     * </p>
     *
     * @param id Id of the application to get (required)
     * @return ApiResponse&lt;WebrtcApplicationResponse&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<WebrtcApplicationResponse> getWebrtcApplication(final String id)
            throws ApiException {
        Call call = getWebrtcApplicationValidateBeforeCall(id);
        return apiClient.execute(call, WebrtcApplicationResponse.class);
    }

    /**
     * <p>
     * Get WebRTC application (asynchronously).<br>
     * Get a single WebRTC application to see its configuration details.
     * </p>
     *
     * @param id Id of the application to get (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException in case of error(s)
     */
    public Call getWebrtcApplicationAsync(final String id,
            final ApiCallback<WebrtcApplicationResponse> apiCallback) throws ApiException {
        Call call = getWebrtcApplicationValidateBeforeCall(id, apiCallback);
        apiClient.executeAsync(call, WebrtcApplicationResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Update WebRTC application.<br>
     * Change configuration details of your existing WebRTC application.
     * </p>
     *
     * @param id Id of the application to update (required)
     * @param webrtcApplicationRequest (optional)
     * @return ApiResponse&lt;WebrtcApplicationResponse&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<WebrtcApplicationResponse> updateWebrtcApplication(final String id,
            final WebrtcApplicationRequest webrtcApplicationRequest) throws ApiException {
        Call call = updateWebrtcApplicationValidateBeforeCall(id, webrtcApplicationRequest);
        return apiClient.execute(call, WebrtcApplicationResponse.class);
    }

    /**
     * <p>
     * Update WebRTC application (asynchronously).<br>
     * Change configuration details of your existing WebRTC application.
     * </p>
     *
     * @param id Id of the application to update (required)
     * @param webrtcApplicationRequest (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException in case of error(s)
     */
    public Call updateWebrtcApplicationAsync(final String id,
            final WebrtcApplicationRequest webrtcApplicationRequest,
            final ApiCallback<WebrtcApplicationResponse> apiCallback) throws ApiException {
        Call call = updateWebrtcApplicationValidateBeforeCall(id, webrtcApplicationRequest,
                apiCallback);
        apiClient.executeAsync(call, WebrtcApplicationResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Delete WebRTC application.<br>
     * Delete WebRTC application for a given id.
     * </p>
     *
     * @param id Id of the application to delete (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<Void> deleteWebrtcApplication(final String id) throws ApiException {
        Call call = deleteWebrtcApplicationValidateBeforeCall(id);
        return apiClient.execute(call);
    }

    /**
     * <p>
     * Delete WebRTC application (asynchronously).<br>
     * Delete WebRTC application for a given id.
     * </p>
     *
     * @param id Id of the application to delete (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException in case of error(s)
     */
    public Call deleteWebrtcApplicationAsync(final String id, final ApiCallback<Void> apiCallback)
            throws ApiException {
        Call call = deleteWebrtcApplicationValidateBeforeCall(id, apiCallback);
        apiClient.executeAsync(call, apiCallback);
        return call;
    }

    private Call getWebrtcApplicationsValidateBeforeCall() throws ApiException {
        return getWebrtcApplicationsValidateBeforeCall(null);
    }

    // TODO: Improve validation logic
    private Call getWebrtcApplicationsValidateBeforeCall(final ApiCallback apiCallback)
            throws ApiException {
        return getWebrtcApplicationsCall(apiCallback);
    }

    private Call saveWebrtcApplicationValidateBeforeCall(
            final WebrtcApplicationRequest webrtcApplicationRequest) throws ApiException {
        return saveWebrtcApplicationValidateBeforeCall(webrtcApplicationRequest, null);
    }

    // TODO: Improve validation logic
    private Call saveWebrtcApplicationValidateBeforeCall(
            final WebrtcApplicationRequest webrtcApplicationRequest, final ApiCallback apiCallback)
            throws ApiException {
        return saveWebrtcApplicationCall(webrtcApplicationRequest, apiCallback);
    }

    private Call getWebrtcApplicationValidateBeforeCall(final String id) throws ApiException {
        return getWebrtcApplicationValidateBeforeCall(id, null);
    }

    // TODO: Improve validation logic; remove string literal(s)
    private Call getWebrtcApplicationValidateBeforeCall(final String id,
            final ApiCallback apiCallback) throws ApiException {
        if (id == null) {
            throw new ApiException("Missing the required parameter");
        }
        return getWebrtcApplicationCall(id, apiCallback);
    }

    private Call updateWebrtcApplicationValidateBeforeCall(final String id,
            final WebrtcApplicationRequest webrtcApplicationRequest) throws ApiException {
        return updateWebrtcApplicationValidateBeforeCall(id, webrtcApplicationRequest, null);
    }

    // TODO: Improve validation logic; remove string literal(s)
    private Call updateWebrtcApplicationValidateBeforeCall(final String id,
            final WebrtcApplicationRequest webrtcApplicationRequest, final ApiCallback apiCallback)
            throws ApiException {
        if (id == null) {
            throw new ApiException("Missing the required parameter");
        }
        return updateWebrtcApplicationCall(id, webrtcApplicationRequest, apiCallback);
    }

    private Call deleteWebrtcApplicationValidateBeforeCall(final String id) throws ApiException {
        return deleteWebrtcApplicationValidateBeforeCall(id, null);
    }

    // TODO: Improve validation logic; remove string literal(s)
    private Call deleteWebrtcApplicationValidateBeforeCall(final String id,
            final ApiCallback apiCallback) throws ApiException {
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id'");
        }
        return deleteWebrtcApplicationCall(id, apiCallback);
    }

    private Call getWebrtcApplicationsCall(final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_WEBRTC_APPLICATIONS_ENDPOINT, HttpMethodType.GET,
                httpHeaders, apiCallback);
    }

    private Call saveWebrtcApplicationCall(final WebrtcApplicationRequest webrtcApplicationRequest,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(SAVE_WEBRTC_APPLICATION_ENDPOINT, HttpMethodType.POST,
                httpHeaders, webrtcApplicationRequest, apiCallback);
    }

    private Call getWebrtcApplicationCall(final String id, final ApiCallback apiCallback)
            throws ApiException {
        String getWebrtcApplicationEndpoint = GET_WEBRTC_APPLICATION_ENDPOINT
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(getWebrtcApplicationEndpoint, HttpMethodType.GET, httpHeaders,
                apiCallback);
    }

    private Call updateWebrtcApplicationCall(final String id,
            final WebrtcApplicationRequest webrtcApplicationRequest, final ApiCallback apiCallback)
            throws ApiException {
        String updateWebrtcApplicationEndpoint = UPDATE_WEBRTC_APPLICATION_ENDPOINT
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(updateWebrtcApplicationEndpoint, HttpMethodType.PUT, httpHeaders,
                webrtcApplicationRequest, apiCallback);
    }

    private Call deleteWebrtcApplicationCall(final String id, final ApiCallback apiCallback)
            throws ApiException {
        String deleteWebrtcApplicationEndpoint = DELETE_WEBRTC_APPLICATION_ENDPOINT
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(deleteWebrtcApplicationEndpoint, HttpMethodType.DELETE,
                httpHeaders, apiCallback);
    }
}
