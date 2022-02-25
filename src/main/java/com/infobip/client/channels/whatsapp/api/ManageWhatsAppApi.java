
package com.infobip.client.channels.whatsapp.api;

import com.google.gson.reflect.TypeToken;
import com.infobip.client.channels.whatsapp.model.WhatsAppTemplateResponse;
import com.infobip.client.channels.whatsapp.model.WhatsAppTemplateRequest;
import com.infobip.client.channels.whatsapp.model.WhatsAppTemplatesResponse;
import com.infobip.client.channels.whatsapp.model.WhatsAppDeleteMediaRequest;
import com.infobip.client.common.ApiCallback;
import com.infobip.client.common.ApiClient;
import com.infobip.client.common.ApiException;
import com.infobip.client.common.ApiResponse;
import com.infobip.client.common.HttpHeader;
import com.infobip.client.common.HttpMethodType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;

public final class ManageWhatsAppApi {
    private static final String GET_WHATSAPP_TEMPLATES_ENDPOINT =
            "/whatsapp/1/senders/{sender}/templates";
    private static final String CREATE_WHATSAPP_TEMPLATE_ENDPOINT =
            "/whatsapp/1/senders/{sender}/templates";
    private static final String DELETE_WHATSAPP_MEDIA_ENDPOINT =
            "/whatsapp/1/senders/{sender}/media";
    private ApiClient apiClient;

    public ManageWhatsAppApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Get WhatsApp Templates.<br>
     * Get all the templates and their statuses for a given sender.
     * </p>
     *
     * @param sender Registered WhatsApp sender number. Must be in international
     *     format. (required)
     * @return ApiResponse&lt;WhatsAppTemplatesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Get WhatsApp Templates
     *     Documentation</a>
     */
    public ApiResponse<WhatsAppTemplatesResponse> getWhatsAppTemplates(final String sender)
            throws ApiException {
        Call call = getWhatsAppTemplatesValidateBeforeCall(sender);
        Type returnType = new TypeToken<WhatsAppTemplatesResponse>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * <p>
     * Get WhatsApp Templates (asynchronously).<br>
     * Get all the templates and their statuses for a given sender.
     * </p>
     *
     * @param sender Registered WhatsApp sender number. Must be in international
     *     format. (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Get WhatsApp Templates
     *     Documentation</a>
     */
    public Call getWhatsAppTemplatesAsync(final String sender,
            final ApiCallback<WhatsAppTemplatesResponse> apiCallback) throws ApiException {
        Call call = getWhatsAppTemplatesValidateBeforeCall(sender, apiCallback);
        Type returnType = new TypeToken<WhatsAppTemplatesResponse>() {}.getType();
        apiClient.executeAsync(call, returnType, apiCallback);
        return call;
    }

    /**
     * <p>
     * Create WhatsApp Template.<br>
     * Create WhatsApp template. Created template will be submitted for
     * WhatsApp&#39;s review and approval. Once approved, template can be sent to
     * end-users. Refer to [template
     * guidelines](https://www.infobip.com/docs/whatsapp/message-types#guidelines-amp-best-practices)
     * for additional info.
     * </p>
     *
     * @param sender Registered WhatsApp sender number. Must be in international
     *     format. (required)
     * @param whatsAppTemplateRequest (required)
     * @return ApiResponse&lt;WhatsAppTemplateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Create WhatsApp Template
     *     Documentation</a>
     */
    public ApiResponse<WhatsAppTemplateResponse> createWhatsAppTemplate(final String sender,
            final WhatsAppTemplateRequest whatsAppTemplateRequest)
            throws ApiException {
        Call call =
                createWhatsAppTemplateValidateBeforeCall(sender, whatsAppTemplateRequest);
        Type returnType = new TypeToken<WhatsAppTemplateResponse>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * <p>
     * Create WhatsApp Template (asynchronously).<br>
     * Create WhatsApp template. Created template will be submitted for
     * WhatsApp&#39;s review and approval. Once approved, template can be sent to
     * end-users. Refer to [template
     * guidelines](https://www.infobip.com/docs/whatsapp/message-types#guidelines-amp-best-practices)
     * for additional info.
     * </p>
     *
     * @param sender Registered WhatsApp sender number. Must be in international
     *     format. (required)
     * @param whatsAppTemplateRequest
     *     (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Create WhatsApp Template
     *     Documentation</a>
     */
    public Call createWhatsAppTemplateAsync(final String sender,
            final WhatsAppTemplateRequest whatsAppTemplateRequest,
            final ApiCallback<WhatsAppTemplateResponse> apiCallback) throws ApiException {
        Call call = createWhatsAppTemplateValidateBeforeCall(sender,
                whatsAppTemplateRequest, apiCallback);
        Type returnType = new TypeToken<WhatsAppTemplateResponse>() {}.getType();
        apiClient.executeAsync(call, returnType, apiCallback);
        return call;
    }

    /**
     * <p>
     * Delete media.<br>
     * Delete WhatsApp media. May be outbound or inbound media.
     * </p>
     *
     * @param sender Registered WhatsApp sender number. Must be in international
     *     format. (required)
     * @param whatsAppDeleteMediaRequest (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Delete media
     *     Documentation</a>
     */
    public ApiResponse<String> deleteWhatsAppMedia(final String sender,
            final WhatsAppDeleteMediaRequest whatsAppDeleteMediaRequest) throws ApiException {
        Call call = deleteWhatsAppMediaValidateBeforeCall(sender, whatsAppDeleteMediaRequest);
        Type returnType = new TypeToken<String>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * <p>
     * Delete media (asynchronously).<br>
     * Delete WhatsApp media. May be outbound or inbound media.
     * </p>
     *
     * @param sender Registered WhatsApp sender number. Must be in international
     *     format. (required)
     * @param whatsAppDeleteMediaRequest (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Delete media
     *     Documentation</a>
     */
    public Call deleteWhatsAppMediaAsync(final String sender,
            final WhatsAppDeleteMediaRequest whatsAppDeleteMediaRequest,
            final ApiCallback<String> apiCallback) throws ApiException {
        Call call = deleteWhatsAppMediaValidateBeforeCall(sender, whatsAppDeleteMediaRequest,
                apiCallback);
        Type returnType = new TypeToken<String>() {}.getType();
        apiClient.executeAsync(call, returnType, apiCallback);
        return call;
    }

    private Call getWhatsAppTemplatesValidateBeforeCall(final String sender) throws ApiException {
        return getWhatsAppTemplatesValidateBeforeCall(sender, null);
    }

    private Call getWhatsAppTemplatesValidateBeforeCall(final String sender,
            final ApiCallback apiCallback) throws ApiException {
        if (sender == null) {
            throw new ApiException("Missing the required parameter");
        }
        return getWhatsAppTemplatesCall(sender, apiCallback);
    }

    private Call createWhatsAppTemplateValidateBeforeCall(final String sender,
            final WhatsAppTemplateRequest whatsAppTemplateRequest)
            throws ApiException {
        return createWhatsAppTemplateValidateBeforeCall(sender, whatsAppTemplateRequest,
                null);
    }

    private Call createWhatsAppTemplateValidateBeforeCall(final String sender,
            final WhatsAppTemplateRequest whatsAppTemplateRequest,
            final ApiCallback apiCallback) throws ApiException {
        if (sender == null) {
            throw new ApiException("Missing the required parameter");
        }
        if (whatsAppTemplateRequest == null) {
            throw new ApiException("Missing the required parameter");
        }
        return createWhatsAppTemplateCall(sender, whatsAppTemplateRequest, apiCallback);
    }

    private Call deleteWhatsAppMediaValidateBeforeCall(final String sender,
            final WhatsAppDeleteMediaRequest whatsAppDeleteMediaRequest) throws ApiException {
        return deleteWhatsAppMediaValidateBeforeCall(sender, whatsAppDeleteMediaRequest, null);
    }

    private Call deleteWhatsAppMediaValidateBeforeCall(final String sender,
            final WhatsAppDeleteMediaRequest whatsAppDeleteMediaRequest,
            final ApiCallback apiCallback) throws ApiException {
        if (sender == null) {
            throw new ApiException("Missing the required parameter");
        }
        if (whatsAppDeleteMediaRequest == null) {
            throw new ApiException("Missing the required parameter");
        }
        return deleteWhatsAppMediaCall(sender, whatsAppDeleteMediaRequest, apiCallback);
    }

    private Call getWhatsAppTemplatesCall(final String sender, final ApiCallback apiCallback)
            throws ApiException {
        String getWhatsAppTemplatesEndpoint = GET_WHATSAPP_TEMPLATES_ENDPOINT
                .replaceAll("\\{" + "sender" + "\\}", apiClient.escapeString(sender.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(getWhatsAppTemplatesEndpoint, HttpMethodType.GET, httpHeaders,
                apiCallback);
    }

    private Call createWhatsAppTemplateCall(final String sender,
            final WhatsAppTemplateRequest whatsAppTemplateRequest,
            final ApiCallback apiCallback) throws ApiException {
        String createWhatsAppTemplateEndpoint = CREATE_WHATSAPP_TEMPLATE_ENDPOINT
                .replaceAll("\\{" + "sender" + "\\}", apiClient.escapeString(sender.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(createWhatsAppTemplateEndpoint, HttpMethodType.POST, httpHeaders,
                whatsAppTemplateRequest, apiCallback);
    }

    private Call deleteWhatsAppMediaCall(final String sender,
            final WhatsAppDeleteMediaRequest whatsAppDeleteMediaRequest,
            final ApiCallback apiCallback) throws ApiException {
        // TODO: to string utils; remove toString()
        String deleteWhatsAppMediaEndpoint = DELETE_WHATSAPP_MEDIA_ENDPOINT
                .replaceAll("\\{" + "sender" + "\\}", apiClient.escapeString(sender.toString()));
        // TODO: re-check and cleanup ...
        // final String[] localVarAccepts = {"*/*"};
        // final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        // if (localVarAccept != null) {
        // localVarHeaderParams.put("Accept", localVarAccept);
        // }
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(deleteWhatsAppMediaEndpoint, HttpMethodType.DELETE, httpHeaders,
                whatsAppDeleteMediaRequest, apiCallback);
    }
}
