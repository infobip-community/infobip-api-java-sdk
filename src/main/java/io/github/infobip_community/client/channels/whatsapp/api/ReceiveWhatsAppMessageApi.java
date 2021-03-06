
package io.github.infobip_community.client.channels.whatsapp.api;

import static io.github.infobip_community.client.common.RequestValidator.validatePathParameters;
import io.github.infobip_community.client.common.ApiCallback;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import io.github.infobip_community.client.common.ApiResponse;
import io.github.infobip_community.client.common.HttpHeader;
import io.github.infobip_community.client.common.HttpMethodType;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;

@SuppressWarnings("rawtypes")
public final class ReceiveWhatsAppMessageApi {
    private static final String DOWNLOAD_WHATSAPP_INBOUND_MEDIA_ENDPOINT =
            "/whatsapp/1/senders/{sender}/media/{mediaId}";
    private static final String GET_WHATSAPP_MEDIA_METADATA_ENDPOINT =
            "/whatsapp/1/senders/{sender}/media/{mediaId}";
    private static final String MARK_WHATSAPP_MESSAGE_AS_READ_ENDPOINT =
            "/whatsapp/1/senders/{sender}/message/{messageId}/read";
    private ApiClient apiClient;

    public ReceiveWhatsAppMessageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Download inbound media.<br>
     * Download WhatsApp media sent by end-users.
     * </p>
     *
     * @param sender Registered WhatsApp sender number. Must be in international
     *     format. (required)
     * @param mediaId ID of the media. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Download inbound media
     *     Documentation</a>
     */
    public ApiResponse<File> downloadWhatsAppInboundMedia(final String sender, final String mediaId)
            throws ApiException {
        validatePathParameters(Arrays.asList(sender, mediaId));
        Call call = downloadWhatsAppInboundMediaCall(sender, mediaId);
        return apiClient.execute(call, File.class);
    }

    /**
     * <p>
     * Download inbound media (asynchronously).<br>
     * Download WhatsApp media sent by end-users.
     * </p>
     *
     * @param sender Registered WhatsApp sender number. Must be in international
     *     format. (required)
     * @param mediaId ID of the media. (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Download inbound media
     *     Documentation</a>
     */
    public Call downloadWhatsAppInboundMediaAsync(final String sender, final String mediaId,
            final ApiCallback<File> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(sender, mediaId));
        Call call = downloadWhatsAppInboundMediaCall(sender, mediaId, apiCallback);
        apiClient.executeAsync(call, File.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Get media metadata.<br>
     * Get metadata of WhatsApp media sent by end-users.
     * </p>
     *
     * @param sender Registered WhatsApp sender number. Must be in international
     *     format. (required)
     * @param mediaId ID of the media. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Get media metadata
     *     Documentation</a>
     */
    public ApiResponse<String> getWhatsAppMediaMetadata(final String sender, final String mediaId)
            throws ApiException {
        validatePathParameters(Arrays.asList(sender, mediaId));
        Call call = getWhatsAppMediaMetadataCall(sender, mediaId);
        return apiClient.execute(call, String.class);
    }

    /**
     * <p>
     * Get media metadata (asynchronously).<br>
     * Get metadata of WhatsApp media sent by end-users.
     * </p>
     *
     * @param sender Registered WhatsApp sender number. Must be in international
     *     format. (required)
     * @param mediaId ID of the media. (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Get media metadata
     *     Documentation</a>
     */
    public Call getWhatsAppMediaMetadataAsync(final String sender, final String mediaId,
            final ApiCallback<String> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(sender, mediaId));
        Call call = getWhatsAppMediaMetadataCall(sender, mediaId, apiCallback);
        apiClient.executeAsync(call, String.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Mark as read.<br>
     * Mark WhatsApp messages sent by end-users as read.
     * </p>
     *
     * @param sender Registered WhatsApp sender number. Must be in international
     *     format. (required)
     * @param messageId ID of the message to be marked as read. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Mark as read
     *     Documentation</a>
     */
    public ApiResponse<Void> markWhatsAppMessageAsRead(final String sender, final String messageId)
            throws ApiException {
        validatePathParameters(Arrays.asList(sender, messageId));
        Call call = markWhatsAppMessageAsReadCall(sender, messageId);
        return apiClient.execute(call);
    }

    /**
     * <p>
     * Mark as read (asynchronously).<br>
     * Mark WhatsApp messages sent by end-users as read.
     * </p>
     *
     * @param sender Registered WhatsApp sender number. Must be in international
     *     format. (required)
     * @param messageId ID of the message to be marked as read. (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Mark as read
     *     Documentation</a>
     */
    public Call markWhatsAppMessageAsReadAsync(final String sender, final String messageId,
            final ApiCallback<Void> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(sender, messageId));
        Call call = markWhatsAppMessageAsReadCall(sender, messageId, apiCallback);
        apiClient.executeAsync(call, apiCallback);
        return call;
    }

    private Call downloadWhatsAppInboundMediaCall(String sender, String mediaId)
            throws ApiException {
        return downloadWhatsAppInboundMediaCall(sender, mediaId, null);
    }

    private Call downloadWhatsAppInboundMediaCall(final String sender, final String mediaId,
            final ApiCallback apiCallback) throws ApiException {
        String downloadWhatsAppInboundMediaEndpoint = DOWNLOAD_WHATSAPP_INBOUND_MEDIA_ENDPOINT
                .replaceAll("\\{" + "sender" + "\\}", apiClient.escapeString(sender.toString()))
                .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(downloadWhatsAppInboundMediaEndpoint, null, HttpMethodType.GET,
                httpHeaders, null, apiCallback);
    }

    private Call getWhatsAppMediaMetadataCall(String sender, String mediaId) throws ApiException {
        return getWhatsAppMediaMetadataCall(sender, mediaId, null);
    }

    private Call getWhatsAppMediaMetadataCall(final String sender, final String mediaId,
            final ApiCallback apiCallback) throws ApiException {
        String getWhatsAppMediaMetadataEndpoint = GET_WHATSAPP_MEDIA_METADATA_ENDPOINT
                .replaceAll("\\{" + "sender" + "\\}", apiClient.escapeString(sender.toString()))
                .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(getWhatsAppMediaMetadataEndpoint, null, HttpMethodType.HEAD,
                httpHeaders, null, apiCallback);
    }

    private Call markWhatsAppMessageAsReadCall(String sender, String messageId)
            throws ApiException {
        return markWhatsAppMessageAsReadCall(sender, messageId, null);
    }

    private Call markWhatsAppMessageAsReadCall(final String sender, final String messageId,
            final ApiCallback apiCallback) throws ApiException {
        String markWhatsAppMessageAsReadEndpoint = MARK_WHATSAPP_MESSAGE_AS_READ_ENDPOINT
                .replaceAll("\\{" + "sender" + "\\}", apiClient.escapeString(sender.toString()))
                .replaceAll("\\{" + "messageId" + "\\}",
                        apiClient.escapeString(messageId.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        return apiClient.buildCall(markWhatsAppMessageAsReadEndpoint, null, HttpMethodType.POST,
                httpHeaders, null, apiCallback);
    }
}
