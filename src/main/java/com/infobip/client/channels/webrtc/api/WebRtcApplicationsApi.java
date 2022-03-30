
package com.infobip.client.channels.webrtc.api;

import static com.infobip.client.common.RequestValidator.validate;
import static com.infobip.client.common.RequestValidator.validateBody;
import static com.infobip.client.common.RequestValidator.validatePathParameters;
import com.infobip.client.channels.webrtc.model.application.WebRtcApplication;
import com.infobip.client.channels.webrtc.model.application.WebRtcApplicationResponse;
import com.infobip.client.channels.webrtc.model.application.WebRtcApplicationResponses;
import com.infobip.client.common.ApiCallback;
import com.infobip.client.common.ApiClient;
import com.infobip.client.common.ApiException;
import com.infobip.client.common.ApiResponse;
import com.infobip.client.common.HttpHeader;
import com.infobip.client.common.HttpMethodType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;

public final class WebRtcApplicationsApi {
    private static final String GET_WEBRTC_APPLICATIONS_ENDPOINT = "/webrtc/1/applications";
    private static final String SAVE_WEBRTC_APPLICATION_ENDPOINT = "/webrtc/1/applications";
    private static final String GET_WEBRTC_APPLICATION_ENDPOINT = "/webrtc/1/applications/{id}";
    private static final String UPDATE_WEBRTC_APPLICATION_ENDPOINT = "/webrtc/1/applications/{id}";
    private static final String DELETE_WEBRTC_APPLICATION_ENDPOINT = "/webrtc/1/applications/{id}";
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
     * @return ApiResponse&lt;List&lt;WebRtcApplicationResponse&gt;&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<WebRtcApplicationResponses> getWebRtcApplications() throws ApiException {
        Call call = getWebRtcApplicationsCall();
        return apiClient.execute(call, WebRtcApplicationResponses.class);
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
    public Call getWebRtcApplicationsAsync(
            final ApiCallback<WebRtcApplicationResponses> apiCallback) throws ApiException {
        Call call = getWebRtcApplicationsCall(apiCallback);
        apiClient.executeAsync(call, WebRtcApplicationResponses.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Save WebRTC application.<br>
     * Create and configure a new WebRTC application.
     * </p>
     *
     * @param webRtcApplication (optional)
     * @return ApiResponse&lt;WebRtcApplicationResponse&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<WebRtcApplicationResponse>
            saveWebRtcApplication(WebRtcApplication webRtcApplication) throws ApiException {
        validateBody(webRtcApplication);
        Call call = saveWebRtcApplicationCall(webRtcApplication);
        return apiClient.execute(call, WebRtcApplicationResponse.class);
    }

    /**
     * <p>
     * Save WebRTC application (asynchronously).<br>
     * Create and configure a new WebRTC application.
     * </p>
     *
     * @param webRtcApplication (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException in case of error(s)
     */
    public Call saveWebRtcApplicationAsync(final WebRtcApplication webRtcApplication,
            final ApiCallback<WebRtcApplicationResponse> apiCallback) throws ApiException {
        validateBody(webRtcApplication);
        Call call = saveWebRtcApplicationCall(webRtcApplication, apiCallback);
        apiClient.executeAsync(call, WebRtcApplicationResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Get WebRTC application.<br>
     * Get a single WebRTC application to see its configuration details.
     * </p>
     *
     * @param id Id of the application to get (required)
     * @return ApiResponse&lt;WebRtcApplicationResponse&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<WebRtcApplicationResponse> getWebRtcApplication(final String id)
            throws ApiException {
        validatePathParameters(Arrays.asList(id));
        Call call = getWebRtcApplicationCall(id);
        return apiClient.execute(call, WebRtcApplicationResponse.class);
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
    public Call getWebRtcApplicationAsync(final String id,
            final ApiCallback<WebRtcApplicationResponse> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(id));
        Call call = getWebRtcApplicationCall(id, apiCallback);
        apiClient.executeAsync(call, WebRtcApplicationResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Update WebRTC application.<br>
     * Change configuration details of your existing WebRTC application.
     * </p>
     *
     * @param id Id of the application to update (required)
     * @param webRtcApplication (optional)
     * @return ApiResponse&lt;WebRtcApplicationResponse&gt;
     * @throws ApiException in case of error(s)
     */
    public ApiResponse<WebRtcApplicationResponse> updateWebRtcApplication(final String id,
            final WebRtcApplication webRtcApplication) throws ApiException {
        validate(Arrays.asList(id), webRtcApplication);
        Call call = updateWebRtcApplicationCall(id, webRtcApplication);
        return apiClient.execute(call, WebRtcApplicationResponse.class);
    }

    /**
     * <p>
     * Update WebRTC application (asynchronously).<br>
     * Change configuration details of your existing WebRTC application.
     * </p>
     *
     * @param id Id of the application to update (required)
     * @param webRtcApplication (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException in case of error(s)
     */
    public Call updateWebRtcApplicationAsync(final String id,
            final WebRtcApplication webRtcApplication,
            final ApiCallback<WebRtcApplicationResponse> apiCallback) throws ApiException {
        validate(Arrays.asList(id), webRtcApplication);
        Call call = updateWebRtcApplicationCall(id, webRtcApplication, apiCallback);
        apiClient.executeAsync(call, WebRtcApplicationResponse.class, apiCallback);
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
    public ApiResponse<Void> deleteWebRtcApplication(final String id) throws ApiException {
        validatePathParameters(Arrays.asList(id));
        Call call = deleteWebRtcApplicationCall(id);
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
    public Call deleteWebRtcApplicationAsync(final String id, final ApiCallback<Void> apiCallback)
            throws ApiException {
        validatePathParameters(Arrays.asList(id));
        Call call = deleteWebRtcApplicationCall(id, apiCallback);
        apiClient.executeAsync(call, apiCallback);
        return call;
    }

    private Call getWebRtcApplicationsCall() throws ApiException {
        return getWebRtcApplicationsCall(null);
    }

    private Call getWebRtcApplicationsCall(final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_WEBRTC_APPLICATIONS_ENDPOINT, HttpMethodType.GET,
                httpHeaders, apiCallback);
    }

    private Call saveWebRtcApplicationCall(WebRtcApplication webRtcApplication)
            throws ApiException {
        return saveWebRtcApplicationCall(webRtcApplication, null);
    }

    private Call saveWebRtcApplicationCall(final WebRtcApplication webRtcApplication,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(SAVE_WEBRTC_APPLICATION_ENDPOINT, HttpMethodType.POST,
                httpHeaders, webRtcApplication, apiCallback);
    }

    private Call getWebRtcApplicationCall(String id) throws ApiException {
        return getWebRtcApplicationCall(id, null);
    }

    private Call getWebRtcApplicationCall(final String id, final ApiCallback apiCallback)
            throws ApiException {
        String getWebRtcApplicationEndpoint = GET_WEBRTC_APPLICATION_ENDPOINT
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(getWebRtcApplicationEndpoint, HttpMethodType.GET, httpHeaders,
                apiCallback);
    }

    private Call updateWebRtcApplicationCall(String id, WebRtcApplication webRtcApplication)
            throws ApiException {
        return updateWebRtcApplicationCall(id, webRtcApplication, null);
    }

    private Call updateWebRtcApplicationCall(final String id,
            final WebRtcApplication webRtcApplication, final ApiCallback apiCallback)
            throws ApiException {
        String updateWebRtcApplicationEndpoint = UPDATE_WEBRTC_APPLICATION_ENDPOINT
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(updateWebRtcApplicationEndpoint, HttpMethodType.PUT, httpHeaders,
                webRtcApplication, apiCallback);
    }

    private Call deleteWebRtcApplicationCall(String id) throws ApiException {
        return deleteWebRtcApplicationCall(id, null);
    }

    private Call deleteWebRtcApplicationCall(final String id, final ApiCallback apiCallback)
            throws ApiException {
        String deleteWebRtcApplicationEndpoint = DELETE_WEBRTC_APPLICATION_ENDPOINT
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(deleteWebRtcApplicationEndpoint, HttpMethodType.DELETE,
                httpHeaders, apiCallback);
    }
}
