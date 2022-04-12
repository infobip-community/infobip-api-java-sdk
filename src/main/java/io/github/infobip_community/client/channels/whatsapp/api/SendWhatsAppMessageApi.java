
package io.github.infobip_community.client.channels.whatsapp.api;

import static io.github.infobip_community.client.common.RequestValidator.validateBody;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppBulkMessagesResponse;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessageResponse;
import io.github.infobip_community.client.channels.whatsapp.model.message.audio.WhatsAppAudioMessage;
import io.github.infobip_community.client.channels.whatsapp.model.message.contact.WhatsAppContactMessage;
import io.github.infobip_community.client.channels.whatsapp.model.message.document.WhatsAppDocumentMessage;
import io.github.infobip_community.client.channels.whatsapp.model.message.image.WhatsAppImageMessage;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.button.WhatsAppInteractiveButtonsMessage;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.list.WhatsAppInteractiveListMessage;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.multiproduct.WhatsAppInteractiveMultiProductMessage;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.product.WhatsAppInteractiveProductMessage;
import io.github.infobip_community.client.channels.whatsapp.model.message.location.WhatsAppLocationMessage;
import io.github.infobip_community.client.channels.whatsapp.model.message.sticker.WhatsAppStickerMessage;
import io.github.infobip_community.client.channels.whatsapp.model.message.template.WhatsAppTemplateMessage;
import io.github.infobip_community.client.channels.whatsapp.model.message.text.WhatsAppTextMessage;
import io.github.infobip_community.client.channels.whatsapp.model.message.video.WhatsAppVideoMessage;
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
public final class SendWhatsAppMessageApi {
    private static final String WHATSAPP_TEMPLATE_MESSAGE_ENDPOINT = "/whatsapp/1/message/template";
    private static final String WHATSAPP_TEXT_MESSAGE_ENDPOINT = "/whatsapp/1/message/text";
    private static final String WHATSAPP_DOCUMENT_MESSAGE_ENDPOINT = "/whatsapp/1/message/document";
    private static final String WHATSAPP_IMAGE_MESSAGE_ENDPOINT = "/whatsapp/1/message/image";
    private static final String WHATSAPP_AUDIO_MESSAGE_ENDPOINT = "/whatsapp/1/message/audio";
    private static final String WHATSAPP_VIDEO_MESSAGE_ENDPOINT = "/whatsapp/1/message/video";
    private static final String WHATSAPP_STICKER_MESSAGE_ENDPOINT = "/whatsapp/1/message/sticker";
    private static final String WHATSAPP_LOCATION_MESSAGE_ENDPOINT = "/whatsapp/1/message/location";
    private static final String WHATSAPP_CONTACT_MESSAGE_ENDPOINT = "/whatsapp/1/message/contact";
    private static final String WHATSAPP_INTERACTIVE_BUTTONS_MESSAGE_ENDPOINT =
            "/whatsapp/1/message/interactive/buttons";
    private static final String WHATSAPP_INTERACTIVE_LIST_MESSAGE_ENDPOINT =
            "/whatsapp/1/message/interactive/list";
    private static final String WHATSAPP_INTERACTIVE_PRODUCT_MESSAGE_ENDPOINT =
            "/whatsapp/1/message/interactive/product";
    private static final String WHATSAPP_INTERACTIVE_MULTI_PRODUCT_MESSAGE_ENDPOINT =
            "/whatsapp/1/message/interactive/multi-product";
    private ApiClient apiClient;

    public SendWhatsAppMessageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Send WhatsApp template message.<br>
     * Send a single or multiple template messages to a one or more recipients.
     * Template messages can be sent and delivered at anytime. Each template sent
     * needs to be registered and pre-approved by WhatsApp.
     * </p>
     *
     * @param whatsAppTemplateMessage (required)
     * @return ApiResponse&lt;WhatsAppBulkMessagesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp template
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppBulkMessagesResponse> sendWhatsAppTemplateMessage(
            final WhatsAppTemplateMessage whatsAppTemplateMessage) throws ApiException {
        validateBody(whatsAppTemplateMessage);
        Call call = sendWhatsAppTemplateMessageCall(whatsAppTemplateMessage);
        return apiClient.execute(call, WhatsAppBulkMessagesResponse.class);
    }

    /**
     * <p>
     * Send WhatsApp template message (asynchronously).<br>
     * Send a single or multiple template messages to a one or more recipients.
     * Template messages can be sent and delivered at anytime. Each template sent
     * needs to be registered and pre-approved by WhatsApp.
     * </p>
     *
     * @param whatsAppTemplateMessage (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp template
     *     message Documentation</a>
     */
    public Call sendWhatsAppTemplateMessageAsync(
            final WhatsAppTemplateMessage whatsAppTemplateMessage,
            final ApiCallback<WhatsAppBulkMessagesResponse> apiCallback) throws ApiException {
        validateBody(whatsAppTemplateMessage);
        Call call = sendWhatsAppTemplateMessageCall(whatsAppTemplateMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppBulkMessagesResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send WhatsApp text message.<br>
     * Send a text message to a single recipient. Text messages can only be
     * successfully delivered, if the recipient has contacted the business within
     * the last 24 hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppTextMessage (required)
     * @return ApiResponse&lt;WhatsAppMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp text
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppMessageResponse> sendWhatsAppTextMessage(
            final WhatsAppTextMessage whatsAppTextMessage) throws ApiException {
        validateBody(whatsAppTextMessage);
        Call call = sendWhatsAppTextMessageCall(whatsAppTextMessage);
        return apiClient.execute(call, WhatsAppMessageResponse.class);
    }

    /**
     * <p>
     * Send WhatsApp text message (asynchronously).<br>
     * Send a text message to a single recipient. Text messages can only be
     * successfully delivered, if the recipient has contacted the business within
     * the last 24 hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppTextMessage (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp text
     *     message Documentation</a>
     */
    public Call sendWhatsAppTextMessageAsync(final WhatsAppTextMessage whatsAppTextMessage,
            final ApiCallback<WhatsAppMessageResponse> apiCallback) throws ApiException {
        validateBody(whatsAppTextMessage);
        Call call = sendWhatsAppTextMessageCall(whatsAppTextMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppMessageResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send WhatsApp document message.<br>
     * Send a document to a single recipient. Document messages can only be
     * successfully delivered, if the recipient has contacted the business within
     * the last 24 hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppDocumentMessage (required)
     * @return ApiResponse&lt;WhatsAppMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp document
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppMessageResponse> sendWhatsAppDocumentMessage(
            final WhatsAppDocumentMessage whatsAppDocumentMessage) throws ApiException {
        validateBody(whatsAppDocumentMessage);
        Call call = sendWhatsAppDocumentMessageCall(whatsAppDocumentMessage);
        return apiClient.execute(call, WhatsAppMessageResponse.class);
    }

    /**
     * <p>
     * Send WhatsApp document message (asynchronously).<br>
     * Send a document to a single recipient. Document messages can only be
     * successfully delivered, if the recipient has contacted the business within
     * the last 24 hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppDocumentMessage (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp document
     *     message Documentation</a>
     */
    public Call sendWhatsAppDocumentMessageAsync(
            final WhatsAppDocumentMessage whatsAppDocumentMessage,
            final ApiCallback<WhatsAppMessageResponse> apiCallback) throws ApiException {
        validateBody(whatsAppDocumentMessage);
        Call call = sendWhatsAppDocumentMessageCall(whatsAppDocumentMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppMessageResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send WhatsApp image message.<br>
     * Send an image to a single recipient. Image messages can only be successfully
     * delivered, if the recipient has contacted the business within the last 24
     * hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppImageMessage (required)
     * @return ApiResponse&lt;WhatsAppMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp image
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppMessageResponse> sendWhatsAppImageMessage(
            final WhatsAppImageMessage whatsAppImageMessage) throws ApiException {
        validateBody(whatsAppImageMessage);
        Call call = sendWhatsAppImageMessageCall(whatsAppImageMessage);
        return apiClient.execute(call, WhatsAppMessageResponse.class);
    }

    /**
     * <p>
     * Send WhatsApp image message (asynchronously).<br>
     * Send an image to a single recipient. Image messages can only be successfully
     * delivered, if the recipient has contacted the business within the last 24
     * hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppImageMessage (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp image
     *     message Documentation</a>
     */
    public Call sendWhatsAppImageMessageAsync(final WhatsAppImageMessage whatsAppImageMessage,
            final ApiCallback<WhatsAppMessageResponse> apiCallback) throws ApiException {
        validateBody(whatsAppImageMessage);
        Call call = sendWhatsAppImageMessageCall(whatsAppImageMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppMessageResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send WhatsApp audio message.<br>
     * Send an audio to a single recipient. Audio messages can only be successfully
     * delivered, if the recipient has contacted the business within the last 24
     * hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppAudioMessage (required)
     * @return ApiResponse&lt;WhatsAppMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp audio
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppMessageResponse> sendWhatsAppAudioMessage(
            final WhatsAppAudioMessage whatsAppAudioMessage) throws ApiException {
        validateBody(whatsAppAudioMessage);
        Call call = sendWhatsAppAudioMessageCall(whatsAppAudioMessage);
        return apiClient.execute(call, WhatsAppMessageResponse.class);
    }

    /**
     * <p>
     * Send WhatsApp audio message (asynchronously).<br>
     * Send an audio to a single recipient. Audio messages can only be successfully
     * delivered, if the recipient has contacted the business within the last 24
     * hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppAudioMessage (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp audio
     *     message Documentation</a>
     */
    public Call sendWhatsAppAudioMessageAsync(final WhatsAppAudioMessage whatsAppAudioMessage,
            final ApiCallback<WhatsAppMessageResponse> apiCallback) throws ApiException {
        validateBody(whatsAppAudioMessage);
        Call call = sendWhatsAppAudioMessageCall(whatsAppAudioMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppMessageResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send WhatsApp video message.<br>
     * Send a video to a single recipient. Video messages can only be successfully
     * delivered, if the recipient has contacted the business within the last 24
     * hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppVideoMessage (required)
     * @return ApiResponse&lt;WhatsAppMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp video
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppMessageResponse> sendWhatsAppVideoMessage(
            final WhatsAppVideoMessage whatsAppVideoMessage) throws ApiException {
        validateBody(whatsAppVideoMessage);
        Call call = sendWhatsAppVideoMessageCall(whatsAppVideoMessage);
        return apiClient.execute(call, WhatsAppMessageResponse.class);
    }

    /**
     * <p>
     * Send WhatsApp video message (asynchronously).<br>
     * Send a video to a single recipient. Video messages can only be successfully
     * delivered, if the recipient has contacted the business within the last 24
     * hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppVideoMessage (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp video
     *     message Documentation</a>
     */
    public Call sendWhatsAppVideoMessageAsync(final WhatsAppVideoMessage whatsAppVideoMessage,
            final ApiCallback<WhatsAppMessageResponse> apiCallback) throws ApiException {
        validateBody(whatsAppVideoMessage);
        Call call = sendWhatsAppVideoMessageCall(whatsAppVideoMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppMessageResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send WhatsApp sticker message.<br>
     * Send a sticker to a single recipient. Sticker messages can only be
     * successfully delivered, if the recipient has contacted the business within
     * the last 24 hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppStickerMessage (required)
     * @return ApiResponse&lt;WhatsAppMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp sticker
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppMessageResponse> sendWhatsAppStickerMessage(
            final WhatsAppStickerMessage whatsAppStickerMessage) throws ApiException {
        validateBody(whatsAppStickerMessage);
        Call call = sendWhatsAppStickerMessageCall(whatsAppStickerMessage);
        return apiClient.execute(call, WhatsAppMessageResponse.class);
    }

    /**
     * <p>
     * Send WhatsApp sticker message (asynchronously).<br>
     * Send a sticker to a single recipient. Sticker messages can only be
     * successfully delivered, if the recipient has contacted the business within
     * the last 24 hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppStickerMessage (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *     Learn more about WhatsApp channel and use cases
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp sticker
     *     message Documentation</a>
     */
    public Call sendWhatsAppStickerMessageAsync(final WhatsAppStickerMessage whatsAppStickerMessage,
            final ApiCallback<WhatsAppMessageResponse> apiCallback) throws ApiException {
        validateBody(whatsAppStickerMessage);
        Call call = sendWhatsAppStickerMessageCall(whatsAppStickerMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppMessageResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send WhatsApp location message.<br>
     * Send a location to a single recipient. Location messages can only be
     * successfully delivered, if the recipient has contacted the business within
     * the last 24 hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppLocationMessage (required)
     * @return ApiResponse&lt;WhatsAppMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp location
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppMessageResponse> sendWhatsAppLocationMessage(
            final WhatsAppLocationMessage whatsAppLocationMessage) throws ApiException {
        validateBody(whatsAppLocationMessage);
        Call call = sendWhatsAppLocationMessageCall(whatsAppLocationMessage);
        return apiClient.execute(call, WhatsAppMessageResponse.class);
    }

    /**
     * <p>
     * Send WhatsApp location message (asynchronously).<br>
     * Send a location to a single recipient. Location messages can only be
     * successfully delivered, if the recipient has contacted the business within
     * the last 24 hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppLocationMessage (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp location
     *     message Documentation</a>
     */
    public Call sendWhatsAppLocationMessageAsync(
            final WhatsAppLocationMessage whatsAppLocationMessage,
            final ApiCallback<WhatsAppMessageResponse> apiCallback) throws ApiException {
        validateBody(whatsAppLocationMessage);
        Call call = sendWhatsAppLocationMessageCall(whatsAppLocationMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppMessageResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send WhatsApp contact message.<br>
     * Send a contact to a single recipient. Contact messages can only be
     * successfully delivered, if the recipient has contacted the business within
     * the last 24 hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppContactMessage (required)
     * @return ApiResponse&lt;WhatsAppMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp contact
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppMessageResponse> sendWhatsAppContactMessage(
            final WhatsAppContactMessage whatsAppContactMessage) throws ApiException {
        validateBody(whatsAppContactMessage);
        Call call = sendWhatsAppContactMessageCall(whatsAppContactMessage);
        return apiClient.execute(call, WhatsAppMessageResponse.class);
    }

    /**
     * <p>
     * Send WhatsApp contact message (asynchronously).<br>
     * Send a contact to a single recipient. Contact messages can only be
     * successfully delivered, if the recipient has contacted the business within
     * the last 24 hours, otherwise template message should be used.
     * </p>
     *
     * @param whatsAppContactMessage (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp contact
     *     message Documentation</a>
     */
    public Call sendWhatsAppContactMessageAsync(final WhatsAppContactMessage whatsAppContactMessage,
            final ApiCallback<WhatsAppMessageResponse> apiCallback) throws ApiException {
        validateBody(whatsAppContactMessage);
        Call call = sendWhatsAppContactMessageCall(whatsAppContactMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppMessageResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send WhatsApp interactive buttons message.<br>
     * Send an interactive buttons message to a single recipient. Interactive
     * buttons messages can only be successfully delivered, if the recipient has
     * contacted the business within the last 24 hours, otherwise template message
     * should be used.
     * </p>
     *
     * @param whatsAppInteractiveButtonsMessage
     *     (required)
     * @return ApiResponse&lt;WhatsAppMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp
     *     interactive buttons message Documentation</a>
     */
    public ApiResponse<WhatsAppMessageResponse> sendWhatsAppInteractiveButtonsMessage(
            final WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage)
            throws ApiException {
        validateBody(whatsAppInteractiveButtonsMessage);
        Call call = sendWhatsAppInteractiveButtonsMessageCall(whatsAppInteractiveButtonsMessage);
        return apiClient.execute(call, WhatsAppMessageResponse.class);
    }

    /**
     * <p>
     * Send WhatsApp interactive buttons message (asynchronously).<br>
     * Send an interactive buttons message to a single recipient. Interactive
     * buttons messages can only be successfully delivered, if the recipient has
     * contacted the business within the last 24 hours, otherwise template message
     * should be used.
     * </p>
     *
     * @param whatsAppInteractiveButtonsMessage
     *     (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp
     *     interactive buttons message Documentation</a>
     */
    public Call sendWhatsAppInteractiveButtonsMessageAsync(
            final WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage,
            final ApiCallback<WhatsAppMessageResponse> apiCallback) throws ApiException {
        validateBody(whatsAppInteractiveButtonsMessage);
        Call call = sendWhatsAppInteractiveButtonsMessageCall(whatsAppInteractiveButtonsMessage,
                apiCallback);
        apiClient.executeAsync(call, WhatsAppMessageResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send WhatsApp interactive list message.<br>
     * Send an interactive list message to a single recipient. Interactive list
     * messages can only be successfully delivered, if the recipient has contacted
     * the business within the last 24 hours, otherwise template message should be
     * used.
     * </p>
     *
     * @param whatsAppInteractiveListMessage
     *     (required)
     * @return ApiResponse&lt;WhatsAppMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp
     *     interactive list message Documentation</a>
     */
    public ApiResponse<WhatsAppMessageResponse> sendWhatsAppInteractiveListMessage(
            final WhatsAppInteractiveListMessage whatsAppInteractiveListMessage)
            throws ApiException {
        validateBody(whatsAppInteractiveListMessage);
        Call call = sendWhatsAppInteractiveListMessageCall(whatsAppInteractiveListMessage);
        return apiClient.execute(call, WhatsAppMessageResponse.class);
    }

    /**
     * <p>
     * Send WhatsApp interactive list message (asynchronously).<br>
     * Send an interactive list message to a single recipient. Interactive list
     * messages can only be successfully delivered, if the recipient has contacted
     * the business within the last 24 hours, otherwise template message should be
     * used.
     * </p>
     *
     * @param whatsAppInteractiveListMessage
     *     (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp
     *     interactive list message Documentation</a>
     */
    public Call sendWhatsAppInteractiveListMessageAsync(
            final WhatsAppInteractiveListMessage whatsAppInteractiveListMessage,
            final ApiCallback<WhatsAppMessageResponse> apiCallback) throws ApiException {
        validateBody(whatsAppInteractiveListMessage);
        Call call =
                sendWhatsAppInteractiveListMessageCall(whatsAppInteractiveListMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppMessageResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send WhatsApp interactive product message.<br>
     * Send an interactive product message to a single recipient. Interactive
     * product messages can only be successfully delivered, if the recipient has
     * contacted the business within the last 24 hours, otherwise template message
     * should be used.
     * </p>
     *
     * @param whatsAppInteractiveProductMessage
     *     (required)
     * @return ApiResponse&lt;WhatsAppMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp
     *     interactive product message Documentation</a>
     */
    public ApiResponse<WhatsAppMessageResponse> sendWhatsAppInteractiveProductMessage(
            final WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage)
            throws ApiException {
        validateBody(whatsAppInteractiveProductMessage);
        Call call = sendWhatsAppInteractiveProductMessageCall(whatsAppInteractiveProductMessage);
        return apiClient.execute(call, WhatsAppMessageResponse.class);
    }

    /**
     * <p>
     * Send WhatsApp interactive product message (asynchronously).<br>
     * Send an interactive product message to a single recipient. Interactive
     * product messages can only be successfully delivered, if the recipient has
     * contacted the business within the last 24 hours, otherwise template message
     * should be used.
     * </p>
     *
     * @param whatsAppInteractiveProductMessage
     *     (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp
     *     interactive product message Documentation</a>
     */
    public Call sendWhatsAppInteractiveProductMessageAsync(
            final WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage,
            final ApiCallback<WhatsAppMessageResponse> apiCallback) throws ApiException {
        validateBody(whatsAppInteractiveProductMessage);
        Call call = sendWhatsAppInteractiveProductMessageCall(whatsAppInteractiveProductMessage,
                apiCallback);
        apiClient.executeAsync(call, WhatsAppMessageResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send WhatsApp interactive multi-product message.<br>
     * Send an interactive multi-product message to a single recipient. Interactive
     * multi-product messages can only be successfully delivered, if the recipient
     * has contacted the business within the last 24 hours, otherwise template
     * message should be used.
     * </p>
     *
     * @param whatsAppInteractiveMultiProductMessage
     *     (required)
     * @return ApiResponse&lt;WhatsAppMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp
     *     interactive multi-product message Documentation</a>
     */
    public ApiResponse<WhatsAppMessageResponse> sendWhatsAppInteractiveMultiProductMessage(
            final WhatsAppInteractiveMultiProductMessage whatsAppInteractiveMultiProductMessage)
            throws ApiException {
        validateBody(whatsAppInteractiveMultiProductMessage);
        Call call = sendWhatsAppInteractiveMultiProductMessageCall(
                whatsAppInteractiveMultiProductMessage);
        return apiClient.execute(call, WhatsAppMessageResponse.class);
    }

    /**
     * <p>
     * Send WhatsApp interactive multi-product message (asynchronously).<<br>
     * Send an interactive multi-product message to a single recipient. Interactive
     * multi-product messages can only be successfully delivered, if the recipient
     * has contacted the business within the last 24 hours, otherwise template
     * message should be used.
     * </p>
     *
     * @param whatsAppInteractiveMultiProductMessage
     *     (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     *     Learn more about WhatsApp channel and use cases
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp
     *     interactive multi-product message Documentation</a>
     */
    public Call sendWhatsAppInteractiveMultiProductMessageAsync(
            final WhatsAppInteractiveMultiProductMessage whatsAppInteractiveMultiProductMessage,
            final ApiCallback<WhatsAppMessageResponse> apiCallback) throws ApiException {
        validateBody(whatsAppInteractiveMultiProductMessage);
        Call call = sendWhatsAppInteractiveMultiProductMessageCall(
                whatsAppInteractiveMultiProductMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppMessageResponse.class, apiCallback);
        return call;
    }

    private Call sendWhatsAppTemplateMessageCall(WhatsAppTemplateMessage whatsAppTemplateMessage)
            throws ApiException {
        return sendWhatsAppTemplateMessageCall(whatsAppTemplateMessage, null);
    }

    private Call sendWhatsAppTemplateMessageCall(
            final WhatsAppTemplateMessage whatsAppTemplateMessage, final ApiCallback apiCallback)
            throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_TEMPLATE_MESSAGE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, whatsAppTemplateMessage, apiCallback);
    }

    private Call sendWhatsAppTextMessageCall(WhatsAppTextMessage whatsAppTextMessage)
            throws ApiException {
        return sendWhatsAppTextMessageCall(whatsAppTextMessage, null);
    }

    private Call sendWhatsAppTextMessageCall(final WhatsAppTextMessage whatsAppTextMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_TEXT_MESSAGE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, whatsAppTextMessage, apiCallback);
    }

    private Call sendWhatsAppDocumentMessageCall(WhatsAppDocumentMessage whatsAppDocumentMessage)
            throws ApiException {
        return sendWhatsAppDocumentMessageCall(whatsAppDocumentMessage, null);
    }

    private Call sendWhatsAppDocumentMessageCall(
            final WhatsAppDocumentMessage whatsAppDocumentMessage, final ApiCallback apiCallback)
            throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_DOCUMENT_MESSAGE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, whatsAppDocumentMessage, apiCallback);
    }

    private Call sendWhatsAppImageMessageCall(WhatsAppImageMessage whatsAppImageMessage)
            throws ApiException {
        return sendWhatsAppImageMessageCall(whatsAppImageMessage, null);
    }

    private Call sendWhatsAppImageMessageCall(final WhatsAppImageMessage whatsAppImageMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_IMAGE_MESSAGE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, whatsAppImageMessage, apiCallback);
    }

    private Call sendWhatsAppAudioMessageCall(WhatsAppAudioMessage whatsAppAudioMessage)
            throws ApiException {
        return sendWhatsAppAudioMessageCall(whatsAppAudioMessage, null);
    }

    private Call sendWhatsAppAudioMessageCall(final WhatsAppAudioMessage whatsAppAudioMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_AUDIO_MESSAGE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, whatsAppAudioMessage, apiCallback);
    }

    private Call sendWhatsAppVideoMessageCall(WhatsAppVideoMessage whatsAppVideoMessage)
            throws ApiException {
        return sendWhatsAppVideoMessageCall(whatsAppVideoMessage, null);
    }

    private Call sendWhatsAppVideoMessageCall(final WhatsAppVideoMessage whatsAppVideoMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_VIDEO_MESSAGE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, whatsAppVideoMessage, apiCallback);
    }

    private Call sendWhatsAppStickerMessageCall(WhatsAppStickerMessage whatsAppStickerMessage)
            throws ApiException {
        return sendWhatsAppStickerMessageCall(whatsAppStickerMessage, null);
    }

    private Call sendWhatsAppStickerMessageCall(final WhatsAppStickerMessage whatsAppStickerMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_STICKER_MESSAGE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, whatsAppStickerMessage, apiCallback);
    }

    private Call sendWhatsAppLocationMessageCall(WhatsAppLocationMessage whatsAppLocationMessage)
            throws ApiException {
        return sendWhatsAppLocationMessageCall(whatsAppLocationMessage, null);
    }

    private Call sendWhatsAppLocationMessageCall(
            final WhatsAppLocationMessage whatsAppLocationMessage, final ApiCallback apiCallback)
            throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_LOCATION_MESSAGE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, whatsAppLocationMessage, apiCallback);
    }

    private Call sendWhatsAppContactMessageCall(WhatsAppContactMessage whatsAppContactMessage)
            throws ApiException {
        return sendWhatsAppContactMessageCall(whatsAppContactMessage, null);
    }

    private Call sendWhatsAppContactMessageCall(final WhatsAppContactMessage whatsAppContactMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_CONTACT_MESSAGE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, whatsAppContactMessage, apiCallback);
    }

    private Call sendWhatsAppInteractiveButtonsMessageCall(
            WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage)
            throws ApiException {
        return sendWhatsAppInteractiveButtonsMessageCall(whatsAppInteractiveButtonsMessage, null);
    }

    private Call sendWhatsAppInteractiveButtonsMessageCall(
            final WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_INTERACTIVE_BUTTONS_MESSAGE_ENDPOINT, null,
                HttpMethodType.POST, httpHeaders, whatsAppInteractiveButtonsMessage, apiCallback);
    }

    private Call sendWhatsAppInteractiveListMessageCall(
            WhatsAppInteractiveListMessage whatsAppInteractiveListMessage) throws ApiException {
        return sendWhatsAppInteractiveListMessageCall(whatsAppInteractiveListMessage, null);
    }

    private Call sendWhatsAppInteractiveListMessageCall(
            final WhatsAppInteractiveListMessage whatsAppInteractiveListMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_INTERACTIVE_LIST_MESSAGE_ENDPOINT, null,
                HttpMethodType.POST, httpHeaders, whatsAppInteractiveListMessage, apiCallback);
    }

    private Call sendWhatsAppInteractiveProductMessageCall(
            WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage)
            throws ApiException {
        return sendWhatsAppInteractiveProductMessageCall(whatsAppInteractiveProductMessage, null);
    }

    private Call sendWhatsAppInteractiveProductMessageCall(
            final WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_INTERACTIVE_PRODUCT_MESSAGE_ENDPOINT, null,
                HttpMethodType.POST, httpHeaders, whatsAppInteractiveProductMessage, apiCallback);
    }

    private Call sendWhatsAppInteractiveMultiProductMessageCall(
            WhatsAppInteractiveMultiProductMessage whatsAppInteractiveMultiProductMessage)
            throws ApiException {
        return sendWhatsAppInteractiveMultiProductMessageCall(
                whatsAppInteractiveMultiProductMessage, null);
    }

    private Call sendWhatsAppInteractiveMultiProductMessageCall(
            final WhatsAppInteractiveMultiProductMessage whatsAppInteractiveMultiProductMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_INTERACTIVE_MULTI_PRODUCT_MESSAGE_ENDPOINT, null,
                HttpMethodType.POST, httpHeaders, whatsAppInteractiveMultiProductMessage,
                apiCallback);
    }
}
