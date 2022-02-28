
package com.infobip.client.channels.whatsapp.api;

import com.infobip.client.channels.whatsapp.model.WhatsAppBulkMessageInfo;
import com.infobip.client.channels.whatsapp.model.WhatsAppSingleMessageInfo;
import com.infobip.client.channels.whatsapp.model.message.audio.WhatsAppAudioMessage;
import com.infobip.client.channels.whatsapp.model.message.contact.WhatsAppContactMessage;
import com.infobip.client.channels.whatsapp.model.message.document.WhatsAppDocumentMessage;
import com.infobip.client.channels.whatsapp.model.message.image.WhatsAppImageMessage;
import com.infobip.client.channels.whatsapp.model.message.interactive.button.WhatsAppInteractiveButtonsMessage;
import com.infobip.client.channels.whatsapp.model.message.interactive.list.WhatsAppInteractiveListMessage;
import com.infobip.client.channels.whatsapp.model.message.interactive.multiproduct.WhatsAppInteractiveMultiProductMessage;
import com.infobip.client.channels.whatsapp.model.message.interactive.product.WhatsAppInteractiveProductMessage;
import com.infobip.client.channels.whatsapp.model.message.location.WhatsAppLocationMessage;
import com.infobip.client.channels.whatsapp.model.message.sticker.WhatsAppStickerMessage;
import com.infobip.client.channels.whatsapp.model.message.template.WhatsAppTemplateMessage;
import com.infobip.client.channels.whatsapp.model.message.text.WhatsAppTextMessage;
import com.infobip.client.channels.whatsapp.model.message.video.WhatsAppVideoMessage;
import com.infobip.client.common.ApiCallback;
import com.infobip.client.common.ApiClient;
import com.infobip.client.common.ApiException;
import com.infobip.client.common.ApiResponse;
import com.infobip.client.common.HttpHeader;
import com.infobip.client.common.HttpMethodType;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;

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
     * @return ApiResponse&lt;WhatsAppBulkMessageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp template
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppBulkMessageInfo> sendWhatsAppTemplateMessage(
            final WhatsAppTemplateMessage whatsAppTemplateMessage)
            throws ApiException {
        Call call = sendWhatsAppTemplateMessageValidateBeforeCall(whatsAppTemplateMessage);
        return apiClient.execute(call, WhatsAppBulkMessageInfo.class);
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
            final ApiCallback<WhatsAppBulkMessageInfo> apiCallback) throws ApiException {
        Call call = sendWhatsAppTemplateMessageValidateBeforeCall(whatsAppTemplateMessage,
                apiCallback);
        apiClient.executeAsync(call, WhatsAppBulkMessageInfo.class, apiCallback);
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
     * @return ApiResponse&lt;WhatsAppSingleMessageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp text
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppSingleMessageInfo> sendWhatsAppTextMessage(
            final WhatsAppTextMessage whatsAppTextMessage) throws ApiException {
        Call call = sendWhatsAppTextMessageValidateBeforeCall(whatsAppTextMessage);
        return apiClient.execute(call, WhatsAppSingleMessageInfo.class);
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
            final ApiCallback<WhatsAppSingleMessageInfo> apiCallback) throws ApiException {
        Call call = sendWhatsAppTextMessageValidateBeforeCall(whatsAppTextMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppSingleMessageInfo.class, apiCallback);
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
     * @return ApiResponse&lt;WhatsAppSingleMessageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp document
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppSingleMessageInfo> sendWhatsAppDocumentMessage(
            final WhatsAppDocumentMessage whatsAppDocumentMessage) throws ApiException {
        Call call = sendWhatsAppDocumentMessageValidateBeforeCall(whatsAppDocumentMessage);
        return apiClient.execute(call, WhatsAppSingleMessageInfo.class);
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
            final ApiCallback<WhatsAppSingleMessageInfo> apiCallback) throws ApiException {
        Call call =
                sendWhatsAppDocumentMessageValidateBeforeCall(whatsAppDocumentMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppSingleMessageInfo.class, apiCallback);
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
     * @return ApiResponse&lt;WhatsAppSingleMessageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp image
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppSingleMessageInfo> sendWhatsAppImageMessage(
            final WhatsAppImageMessage whatsAppImageMessage) throws ApiException {
        Call call = sendWhatsAppImageMessageValidateBeforeCall(whatsAppImageMessage);
        return apiClient.execute(call, WhatsAppSingleMessageInfo.class);
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
            final ApiCallback<WhatsAppSingleMessageInfo> apiCallback) throws ApiException {
        Call call = sendWhatsAppImageMessageValidateBeforeCall(whatsAppImageMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppSingleMessageInfo.class, apiCallback);
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
     * @return ApiResponse&lt;WhatsAppSingleMessageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp audio
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppSingleMessageInfo> sendWhatsAppAudioMessage(
            final WhatsAppAudioMessage whatsAppAudioMessage) throws ApiException {
        Call call = sendWhatsAppAudioMessageValidateBeforeCall(whatsAppAudioMessage);
        return apiClient.execute(call, WhatsAppSingleMessageInfo.class);
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
            final ApiCallback<WhatsAppSingleMessageInfo> apiCallback) throws ApiException {
        Call call = sendWhatsAppAudioMessageValidateBeforeCall(whatsAppAudioMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppSingleMessageInfo.class, apiCallback);
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
     * @return ApiResponse&lt;WhatsAppSingleMessageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp video
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppSingleMessageInfo> sendWhatsAppVideoMessage(
            final WhatsAppVideoMessage whatsAppVideoMessage) throws ApiException {
        Call call = sendWhatsAppVideoMessageValidateBeforeCall(whatsAppVideoMessage);
        return apiClient.execute(call, WhatsAppSingleMessageInfo.class);
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
            final ApiCallback<WhatsAppSingleMessageInfo> apiCallback) throws ApiException {
        Call call = sendWhatsAppVideoMessageValidateBeforeCall(whatsAppVideoMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppSingleMessageInfo.class, apiCallback);
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
     * @return ApiResponse&lt;WhatsAppSingleMessageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp sticker
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppSingleMessageInfo> sendWhatsAppStickerMessage(
            final WhatsAppStickerMessage whatsAppStickerMessage) throws ApiException {
        Call call = sendWhatsAppStickerMessageValidateBeforeCall(whatsAppStickerMessage);
        return apiClient.execute(call, WhatsAppSingleMessageInfo.class);
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
            final ApiCallback<WhatsAppSingleMessageInfo> apiCallback) throws ApiException {
        Call call =
                sendWhatsAppStickerMessageValidateBeforeCall(whatsAppStickerMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppSingleMessageInfo.class, apiCallback);
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
     * @return ApiResponse&lt;WhatsAppSingleMessageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp location
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppSingleMessageInfo> sendWhatsAppLocationMessage(
            final WhatsAppLocationMessage whatsAppLocationMessage) throws ApiException {
        Call call = sendWhatsAppLocationMessageValidateBeforeCall(whatsAppLocationMessage);
        return apiClient.execute(call, WhatsAppSingleMessageInfo.class);
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
            final ApiCallback<WhatsAppSingleMessageInfo> apiCallback) throws ApiException {
        Call call =
                sendWhatsAppLocationMessageValidateBeforeCall(whatsAppLocationMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppSingleMessageInfo.class, apiCallback);
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
     * @return ApiResponse&lt;WhatsAppSingleMessageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp contact
     *     message Documentation</a>
     */
    public ApiResponse<WhatsAppSingleMessageInfo> sendWhatsAppContactMessage(
            final WhatsAppContactMessage whatsAppContactMessage) throws ApiException {
        Call call = sendWhatsAppContactMessageValidateBeforeCall(whatsAppContactMessage);
        return apiClient.execute(call, WhatsAppSingleMessageInfo.class);
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
    public Call sendWhatsAppContactMessageAsync(
            final WhatsAppContactMessage whatsAppContactMessage,
            final ApiCallback<WhatsAppSingleMessageInfo> apiCallback) throws ApiException {
        Call call =
                sendWhatsAppContactMessageValidateBeforeCall(whatsAppContactMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppSingleMessageInfo.class, apiCallback);
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
     * @return ApiResponse&lt;WhatsAppSingleMessageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp
     *     interactive buttons message Documentation</a>
     */
    public ApiResponse<WhatsAppSingleMessageInfo> sendWhatsAppInteractiveButtonsMessage(
            final WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage)
            throws ApiException {
        Call call = sendWhatsAppInteractiveButtonsMessageValidateBeforeCall(
                whatsAppInteractiveButtonsMessage);
        return apiClient.execute(call, WhatsAppSingleMessageInfo.class);
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
            final ApiCallback<WhatsAppSingleMessageInfo> apiCallback) throws ApiException {
        Call call = sendWhatsAppInteractiveButtonsMessageValidateBeforeCall(
                whatsAppInteractiveButtonsMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppSingleMessageInfo.class, apiCallback);
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
     * @return ApiResponse&lt;WhatsAppSingleMessageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp
     *     interactive list message Documentation</a>
     */
    public ApiResponse<WhatsAppSingleMessageInfo> sendWhatsAppInteractiveListMessage(
            final WhatsAppInteractiveListMessage whatsAppInteractiveListMessage)
            throws ApiException {
        Call call = sendWhatsAppInteractiveListMessageValidateBeforeCall(
                whatsAppInteractiveListMessage);
        return apiClient.execute(call, WhatsAppSingleMessageInfo.class);
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
            final ApiCallback<WhatsAppSingleMessageInfo> apiCallback) throws ApiException {
        Call call = sendWhatsAppInteractiveListMessageValidateBeforeCall(
                whatsAppInteractiveListMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppSingleMessageInfo.class, apiCallback);
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
     * @return ApiResponse&lt;WhatsAppSingleMessageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp
     *     interactive product message Documentation</a>
     */
    public ApiResponse<WhatsAppSingleMessageInfo> sendWhatsAppInteractiveProductMessage(
            final WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage)
            throws ApiException {
        Call call = sendWhatsAppInteractiveProductMessageValidateBeforeCall(
                whatsAppInteractiveProductMessage);
        return apiClient.execute(call, WhatsAppSingleMessageInfo.class);
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
            final ApiCallback<WhatsAppSingleMessageInfo> apiCallback) throws ApiException {
        Call call = sendWhatsAppInteractiveProductMessageValidateBeforeCall(
                whatsAppInteractiveProductMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppSingleMessageInfo.class, apiCallback);
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
     * @return ApiResponse&lt;WhatsAppSingleMessageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     *
     * @see <a href="https://www.infobip.com/docs/whatsapp">Send WhatsApp
     *     interactive multi-product message Documentation</a>
     */
    public ApiResponse<WhatsAppSingleMessageInfo> sendWhatsAppInteractiveMultiProductMessage(
            final WhatsAppInteractiveMultiProductMessage whatsAppInteractiveMultiProductMessage)
            throws ApiException {
        Call call = sendWhatsAppInteractiveMultiProductMessageValidateBeforeCall(
                whatsAppInteractiveMultiProductMessage);
        return apiClient.execute(call, WhatsAppSingleMessageInfo.class);
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
            final ApiCallback<WhatsAppSingleMessageInfo> apiCallback) throws ApiException {
        Call call = sendWhatsAppInteractiveMultiProductMessageValidateBeforeCall(
                whatsAppInteractiveMultiProductMessage, apiCallback);
        apiClient.executeAsync(call, WhatsAppSingleMessageInfo.class, apiCallback);
        return call;
    }

    private Call sendWhatsAppTemplateMessageValidateBeforeCall(
            final WhatsAppTemplateMessage whatsAppTemplateMessage)
            throws ApiException {
        return sendWhatsAppTemplateMessageValidateBeforeCall(whatsAppTemplateMessage, null);
    }

    private Call sendWhatsAppTemplateMessageValidateBeforeCall(
            final WhatsAppTemplateMessage whatsAppTemplateMessage,
            final ApiCallback apiCallback) throws ApiException {
        if (whatsAppTemplateMessage == null) {
            throw new ApiException("Missing the required parameter");
        }
        return sendWhatsAppTemplateMessageCall(whatsAppTemplateMessage, apiCallback);
    }

    private Call sendWhatsAppTextMessageValidateBeforeCall(
            final WhatsAppTextMessage whatsAppTextMessage) throws ApiException {
        return sendWhatsAppTextMessageValidateBeforeCall(whatsAppTextMessage, null);
    }

    private Call sendWhatsAppTextMessageValidateBeforeCall(
            final WhatsAppTextMessage whatsAppTextMessage, final ApiCallback apiCallback)
            throws ApiException {
        if (whatsAppTextMessage == null) {
            throw new ApiException("Missing the required parameter");
        }
        return sendWhatsAppTextMessageCall(whatsAppTextMessage, apiCallback);
    }

    private Call sendWhatsAppDocumentMessageValidateBeforeCall(
            final WhatsAppDocumentMessage whatsAppDocumentMessage) throws ApiException {
        return sendWhatsAppDocumentMessageValidateBeforeCall(whatsAppDocumentMessage, null);
    }

    private Call sendWhatsAppDocumentMessageValidateBeforeCall(
            final WhatsAppDocumentMessage whatsAppDocumentMessage, final ApiCallback apiCallback)
            throws ApiException {
        if (whatsAppDocumentMessage == null) {
            throw new ApiException("Missing the required parameter");
        }
        return sendWhatsAppDocumentMessageCall(whatsAppDocumentMessage, apiCallback);
    }

    private Call sendWhatsAppImageMessageValidateBeforeCall(
            final WhatsAppImageMessage whatsAppImageMessage) throws ApiException {
        return sendWhatsAppImageMessageValidateBeforeCall(whatsAppImageMessage, null);
    }

    private Call sendWhatsAppImageMessageValidateBeforeCall(
            final WhatsAppImageMessage whatsAppImageMessage, final ApiCallback apiCallback)
            throws ApiException {
        if (whatsAppImageMessage == null) {
            throw new ApiException("Missing the required parameter");
        }
        return sendWhatsAppImageMessageCall(whatsAppImageMessage, apiCallback);
    }

    private Call sendWhatsAppAudioMessageValidateBeforeCall(
            final WhatsAppAudioMessage whatsAppAudioMessage) throws ApiException {
        return sendWhatsAppAudioMessageValidateBeforeCall(whatsAppAudioMessage, null);
    }

    private Call sendWhatsAppAudioMessageValidateBeforeCall(
            final WhatsAppAudioMessage whatsAppAudioMessage, final ApiCallback apiCallback)
            throws ApiException {
        if (whatsAppAudioMessage == null) {
            throw new ApiException("Missing the required parameter");
        }
        return sendWhatsAppAudioMessageCall(whatsAppAudioMessage, apiCallback);
    }

    private Call sendWhatsAppVideoMessageValidateBeforeCall(
            final WhatsAppVideoMessage whatsAppVideoMessage) throws ApiException {
        return sendWhatsAppVideoMessageValidateBeforeCall(whatsAppVideoMessage, null);
    }

    private Call sendWhatsAppVideoMessageValidateBeforeCall(
            final WhatsAppVideoMessage whatsAppVideoMessage, final ApiCallback apiCallback)
            throws ApiException {
        if (whatsAppVideoMessage == null) {
            throw new ApiException("Missing the required parameter");
        }
        return sendWhatsAppVideoMessageCall(whatsAppVideoMessage, apiCallback);
    }

    private Call sendWhatsAppStickerMessageValidateBeforeCall(
            final WhatsAppStickerMessage whatsAppStickerMessage) throws ApiException {
        return sendWhatsAppStickerMessageValidateBeforeCall(whatsAppStickerMessage, null);
    }

    private Call sendWhatsAppStickerMessageValidateBeforeCall(
            final WhatsAppStickerMessage whatsAppStickerMessage, final ApiCallback apiCallback)
            throws ApiException {
        if (whatsAppStickerMessage == null) {
            throw new ApiException("Missing the required parameter");
        }
        return sendWhatsAppStickerMessageCall(whatsAppStickerMessage, apiCallback);
    }

    private Call sendWhatsAppLocationMessageValidateBeforeCall(
            final WhatsAppLocationMessage whatsAppLocationMessage) throws ApiException {
        return sendWhatsAppLocationMessageValidateBeforeCall(whatsAppLocationMessage, null);
    }

    private Call sendWhatsAppLocationMessageValidateBeforeCall(
            final WhatsAppLocationMessage whatsAppLocationMessage, final ApiCallback apiCallback)
            throws ApiException {
        if (whatsAppLocationMessage == null) {
            throw new ApiException("Missing the required parameter");
        }
        return sendWhatsAppLocationMessageCall(whatsAppLocationMessage, apiCallback);
    }

    private Call sendWhatsAppContactMessageValidateBeforeCall(
            final WhatsAppContactMessage whatsAppContactMessage) throws ApiException {
        return sendWhatsAppContactMessageValidateBeforeCall(whatsAppContactMessage, null);
    }

    private Call sendWhatsAppContactMessageValidateBeforeCall(
            final WhatsAppContactMessage whatsAppContactMessage, final ApiCallback apiCallback)
            throws ApiException {
        if (whatsAppContactMessage == null) {
            throw new ApiException("Missing the required parameter");
        }
        return sendWhatsAppContactMessageCall(whatsAppContactMessage, apiCallback);
    }

    private Call sendWhatsAppInteractiveButtonsMessageValidateBeforeCall(
            final WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage)
            throws ApiException {
        return sendWhatsAppInteractiveButtonsMessageValidateBeforeCall(
                whatsAppInteractiveButtonsMessage, null);
    }

    private Call sendWhatsAppInteractiveButtonsMessageValidateBeforeCall(
            final WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage,
            final ApiCallback apiCallback) throws ApiException {
        if (whatsAppInteractiveButtonsMessage == null) {
            throw new ApiException("Missing the required parameter");
        }
        return sendWhatsAppInteractiveButtonsMessageCall(whatsAppInteractiveButtonsMessage,
                apiCallback);
    }

    private Call sendWhatsAppInteractiveListMessageValidateBeforeCall(
            final WhatsAppInteractiveListMessage whatsAppInteractiveListMessage)
            throws ApiException {
        return sendWhatsAppInteractiveListMessageValidateBeforeCall(whatsAppInteractiveListMessage,
                null);
    }

    private Call sendWhatsAppInteractiveListMessageValidateBeforeCall(
            final WhatsAppInteractiveListMessage whatsAppInteractiveListMessage,
            final ApiCallback apiCallback) throws ApiException {
        if (whatsAppInteractiveListMessage == null) {
            throw new ApiException("Missing the required parameter");
        }
        return sendWhatsAppInteractiveListMessageCall(whatsAppInteractiveListMessage, apiCallback);
    }

    private Call sendWhatsAppInteractiveProductMessageValidateBeforeCall(
            final WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage)
            throws ApiException {
        return sendWhatsAppInteractiveProductMessageValidateBeforeCall(
                whatsAppInteractiveProductMessage, null);
    }

    private Call sendWhatsAppInteractiveProductMessageValidateBeforeCall(
            final WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage,
            final ApiCallback apiCallback) throws ApiException {
        if (whatsAppInteractiveProductMessage == null) {
            throw new ApiException("Missing the required parameter");
        }
        return sendWhatsAppInteractiveProductMessageCall(whatsAppInteractiveProductMessage,
                apiCallback);
    }

    private Call sendWhatsAppInteractiveMultiProductMessageValidateBeforeCall(
            final WhatsAppInteractiveMultiProductMessage whatsAppInteractiveMultiProductMessage)
            throws ApiException {
        return sendWhatsAppInteractiveMultiProductMessageValidateBeforeCall(
                whatsAppInteractiveMultiProductMessage, null);
    }

    private Call sendWhatsAppInteractiveMultiProductMessageValidateBeforeCall(
            final WhatsAppInteractiveMultiProductMessage whatsAppInteractiveMultiProductMessage,
            final ApiCallback apiCallback) throws ApiException {
        if (whatsAppInteractiveMultiProductMessage == null) {
            throw new ApiException("Missing the required parameter");
        }
        return sendWhatsAppInteractiveMultiProductMessageCall(
                whatsAppInteractiveMultiProductMessage, apiCallback);
    }

    private Call sendWhatsAppTemplateMessageCall(
            final WhatsAppTemplateMessage whatsAppTemplateMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_TEMPLATE_MESSAGE_ENDPOINT, HttpMethodType.POST,
                httpHeaders, whatsAppTemplateMessage, apiCallback);
    }

    private Call sendWhatsAppTextMessageCall(final WhatsAppTextMessage whatsAppTextMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_TEXT_MESSAGE_ENDPOINT, HttpMethodType.POST, httpHeaders,
                whatsAppTextMessage, apiCallback);
    }

    private Call sendWhatsAppDocumentMessageCall(
            final WhatsAppDocumentMessage whatsAppDocumentMessage, final ApiCallback apiCallback)
            throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_DOCUMENT_MESSAGE_ENDPOINT, HttpMethodType.POST,
                httpHeaders, whatsAppDocumentMessage, apiCallback);
    }

    private Call sendWhatsAppImageMessageCall(final WhatsAppImageMessage whatsAppImageMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_IMAGE_MESSAGE_ENDPOINT, HttpMethodType.POST,
                httpHeaders, whatsAppImageMessage, apiCallback);
    }

    private Call sendWhatsAppAudioMessageCall(final WhatsAppAudioMessage whatsAppAudioMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_AUDIO_MESSAGE_ENDPOINT, HttpMethodType.POST,
                httpHeaders, whatsAppAudioMessage, apiCallback);
    }

    private Call sendWhatsAppVideoMessageCall(final WhatsAppVideoMessage whatsAppVideoMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_VIDEO_MESSAGE_ENDPOINT, HttpMethodType.POST,
                httpHeaders, whatsAppVideoMessage, apiCallback);
    }

    private Call sendWhatsAppStickerMessageCall(final WhatsAppStickerMessage whatsAppStickerMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_STICKER_MESSAGE_ENDPOINT, HttpMethodType.POST,
                httpHeaders, whatsAppStickerMessage, apiCallback);
    }

    private Call sendWhatsAppLocationMessageCall(
            final WhatsAppLocationMessage whatsAppLocationMessage, final ApiCallback apiCallback)
            throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_LOCATION_MESSAGE_ENDPOINT, HttpMethodType.POST,
                httpHeaders, whatsAppLocationMessage, apiCallback);
    }

    private Call sendWhatsAppContactMessageCall(
            final WhatsAppContactMessage whatsAppContactMessage, final ApiCallback apiCallback)
            throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_CONTACT_MESSAGE_ENDPOINT, HttpMethodType.POST,
                httpHeaders, whatsAppContactMessage, apiCallback);
    }

    private Call sendWhatsAppInteractiveButtonsMessageCall(
            final WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_INTERACTIVE_BUTTONS_MESSAGE_ENDPOINT,
                HttpMethodType.POST, httpHeaders, whatsAppInteractiveButtonsMessage, apiCallback);
    }

    private Call sendWhatsAppInteractiveListMessageCall(
            final WhatsAppInteractiveListMessage whatsAppInteractiveListMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_INTERACTIVE_LIST_MESSAGE_ENDPOINT, HttpMethodType.POST,
                httpHeaders, whatsAppInteractiveListMessage, apiCallback);
    }

    private Call sendWhatsAppInteractiveProductMessageCall(
            final WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_INTERACTIVE_PRODUCT_MESSAGE_ENDPOINT,
                HttpMethodType.POST, httpHeaders, whatsAppInteractiveProductMessage, apiCallback);
    }

    private Call sendWhatsAppInteractiveMultiProductMessageCall(
            final WhatsAppInteractiveMultiProductMessage whatsAppInteractiveMultiProductMessage,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(WHATSAPP_INTERACTIVE_MULTI_PRODUCT_MESSAGE_ENDPOINT,
                HttpMethodType.POST, httpHeaders, whatsAppInteractiveMultiProductMessage,
                apiCallback);
    }
}
