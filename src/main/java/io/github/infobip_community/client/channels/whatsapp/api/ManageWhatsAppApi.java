
package io.github.infobip_community.client.channels.whatsapp.api;

import static io.github.infobip_community.client.common.RequestValidator.validateBody;
import static io.github.infobip_community.client.common.RequestValidator.validatePathParameters;
import io.github.infobip_community.client.channels.whatsapp.model.WhatsAppDeleteMedia;
import io.github.infobip_community.client.channels.whatsapp.model.template.WhatsAppTemplate;
import io.github.infobip_community.client.channels.whatsapp.model.template.WhatsAppTemplateResponse;
import io.github.infobip_community.client.channels.whatsapp.model.template.WhatsAppTemplatesResponse;
import io.github.infobip_community.client.common.ApiCallback;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import io.github.infobip_community.client.common.ApiResponse;
import io.github.infobip_community.client.common.HttpHeader;
import io.github.infobip_community.client.common.HttpMethodType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;

@SuppressWarnings("rawtypes")
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
        validatePathParameters(Arrays.asList(sender));
        Call call = getWhatsAppTemplatesCall(sender);
        return apiClient.execute(call, WhatsAppTemplatesResponse.class);
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
        validatePathParameters(Arrays.asList(sender));
        Call call = getWhatsAppTemplatesCall(sender, apiCallback);
        apiClient.executeAsync(call, WhatsAppTemplatesResponse.class, apiCallback);
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
     * @param whatsAppTemplate (required)
     * @return ApiResponse&lt;WhatsAppTemplateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Create WhatsApp Template
     *     Documentation</a>
     */
    public ApiResponse<WhatsAppTemplateResponse> createWhatsAppTemplate(final String sender,
            final WhatsAppTemplate whatsAppTemplate) throws ApiException {
        validatePathParameters(Arrays.asList(sender));
        validateBody(whatsAppTemplate);
        Call call = createWhatsAppTemplateCall(sender, whatsAppTemplate);
        return apiClient.execute(call, WhatsAppTemplateResponse.class);
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
     * @param whatsAppTemplate
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
            final WhatsAppTemplate whatsAppTemplate,
            final ApiCallback<WhatsAppTemplateResponse> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(sender));
        validateBody(whatsAppTemplate);
        Call call = createWhatsAppTemplateCall(sender, whatsAppTemplate, apiCallback);
        apiClient.executeAsync(call, WhatsAppTemplateResponse.class, apiCallback);
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
     * @param whatsAppDeleteMedia (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Delete media
     *     Documentation</a>
     */
    public ApiResponse<String> deleteWhatsAppMedia(final String sender,
            final WhatsAppDeleteMedia whatsAppDeleteMedia) throws ApiException {
        validatePathParameters(Arrays.asList(sender));
        validateBody(whatsAppDeleteMedia);
        Call call = deleteWhatsAppMediaCall(sender, whatsAppDeleteMedia);
        return apiClient.execute(call, String.class);
    }

    /**
     * <p>
     * Delete media (asynchronously).<br>
     * Delete WhatsApp media. May be outbound or inbound media.
     * </p>
     *
     * @param sender Registered WhatsApp sender number. Must be in international
     *     format. (required)
     * @param whatsAppDeleteMedia (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Delete media
     *     Documentation</a>
     */
    public Call deleteWhatsAppMediaAsync(final String sender,
            final WhatsAppDeleteMedia whatsAppDeleteMedia, final ApiCallback<String> apiCallback)
            throws ApiException {
        validatePathParameters(Arrays.asList(sender));
        validateBody(whatsAppDeleteMedia);
        Call call = deleteWhatsAppMediaCall(sender, whatsAppDeleteMedia, apiCallback);
        apiClient.executeAsync(call, String.class, apiCallback);
        return call;
    }

    private Call getWhatsAppTemplatesCall(String sender) throws ApiException {
        return getWhatsAppTemplatesCall(sender, null);
    }

    private Call getWhatsAppTemplatesCall(final String sender, final ApiCallback apiCallback)
            throws ApiException {
        String getWhatsAppTemplatesEndpoint = GET_WHATSAPP_TEMPLATES_ENDPOINT
                .replaceAll("\\{" + "sender" + "\\}", apiClient.escapeString(sender.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(getWhatsAppTemplatesEndpoint, null, HttpMethodType.GET,
                httpHeaders, null, apiCallback);
    }

    private Call createWhatsAppTemplateCall(String sender, WhatsAppTemplate whatsAppTemplate)
            throws ApiException {
        return createWhatsAppTemplateCall(sender, whatsAppTemplate, null);
    }

    private Call createWhatsAppTemplateCall(final String sender,
            final WhatsAppTemplate whatsAppTemplate, final ApiCallback apiCallback)
            throws ApiException {
        String createWhatsAppTemplateEndpoint = CREATE_WHATSAPP_TEMPLATE_ENDPOINT
                .replaceAll("\\{" + "sender" + "\\}", apiClient.escapeString(sender.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(createWhatsAppTemplateEndpoint, null, HttpMethodType.POST,
                httpHeaders, whatsAppTemplate, apiCallback);
    }

    private Call deleteWhatsAppMediaCall(String sender, WhatsAppDeleteMedia whatsAppDeleteMedia)
            throws ApiException {
        return deleteWhatsAppMediaCall(sender, whatsAppDeleteMedia, null);
    }

    private Call deleteWhatsAppMediaCall(final String sender,
            final WhatsAppDeleteMedia whatsAppDeleteMedia, final ApiCallback apiCallback)
            throws ApiException {
        String deleteWhatsAppMediaEndpoint = DELETE_WHATSAPP_MEDIA_ENDPOINT
                .replaceAll("\\{" + "sender" + "\\}", apiClient.escapeString(sender.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(deleteWhatsAppMediaEndpoint, null, HttpMethodType.DELETE,
                httpHeaders, whatsAppDeleteMedia, apiCallback);
    }
}
