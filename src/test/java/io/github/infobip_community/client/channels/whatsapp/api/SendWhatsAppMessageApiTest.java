
package io.github.infobip_community.client.channels.whatsapp.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.infobip_community.client.channels.whatsapp.model.message.audio.WhatsAppAudioMessageTest;
import io.github.infobip_community.client.channels.whatsapp.model.message.contact.WhatsAppContactMessageTest;
import io.github.infobip_community.client.channels.whatsapp.model.message.document.WhatsAppDocumentMessageTest;
import io.github.infobip_community.client.channels.whatsapp.model.message.image.WhatsAppImageMessageTest;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.button.WhatsAppInteractiveButtonsMessageTest;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.list.WhatsAppInteractiveListMessageTest;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.multiproduct.WhatsAppInteractiveMultiProductMessageTest;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.product.WhatsAppInteractiveProductMessageTest;
import io.github.infobip_community.client.channels.whatsapp.model.message.location.WhatsAppLocationMessageTest;
import io.github.infobip_community.client.channels.whatsapp.model.message.sticker.WhatsAppStickerMessageTest;
import io.github.infobip_community.client.channels.whatsapp.model.message.template.WhatsAppTemplateMessageTest;
import io.github.infobip_community.client.channels.whatsapp.model.message.text.WhatsAppTextMessageTest;
import io.github.infobip_community.client.channels.whatsapp.model.message.video.WhatsAppVideoMessageTest;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SendWhatsAppMessageApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static SendWhatsAppMessageApi api = new SendWhatsAppMessageApi(apiClient);

    @Test
    void testSendWhatsAppTemplateMessage() {
        assertThrows(ApiException.class, () -> api.sendWhatsAppTemplateMessage(
                WhatsAppTemplateMessageTest.getWhatsAppTemplateMessageWithAllParameters()));
    }

    @Test
    void testSendWhatsAppTextMessage() {
        assertThrows(ApiException.class, () -> api.sendWhatsAppTextMessage(
                WhatsAppTextMessageTest.getWhatsAppTextMessageWithAllParameters()));
    }

    @Test
    void testSendWhatsAppDocumentMessage() {
        assertThrows(ApiException.class, () -> api.sendWhatsAppDocumentMessage(
                WhatsAppDocumentMessageTest.getWhatsAppDocumentMessageWithAllParameters()));
    }

    @Test
    void testSendWhatsAppImageMessage() {
        assertThrows(ApiException.class, () -> api.sendWhatsAppImageMessage(
                WhatsAppImageMessageTest.getWhatsAppImageMessageWithAllParameters()));
    }

    @Test
    void testSendWhatsAppAudioMessage() {
        assertThrows(ApiException.class, () -> api.sendWhatsAppAudioMessage(
                WhatsAppAudioMessageTest.getWhatsAppAudioMessageWithAllParameters()));
    }

    @Test
    void testSendWhatsAppVideoMessage() {
        assertThrows(ApiException.class, () -> api.sendWhatsAppVideoMessage(
                WhatsAppVideoMessageTest.getWhatsAppVideoMessageWithAllParameters()));
    }

    @Test
    void testSendWhatsAppStickerMessage() {
        assertThrows(ApiException.class, () -> api.sendWhatsAppStickerMessage(
                WhatsAppStickerMessageTest.getWhatsAppStickerMessageWithAllParameters()));
    }

    @Test
    void testSendWhatsAppLocationMessage() {
        assertThrows(ApiException.class, () -> api.sendWhatsAppLocationMessage(
                WhatsAppLocationMessageTest.getWhatsAppLocationMessageWithAllParameters()));
    }

    @Test
    void testSendWhatsAppContactMessage() {
        assertThrows(ApiException.class, () -> api.sendWhatsAppContactMessage(
                WhatsAppContactMessageTest.getWhatsAppContactMessageWithAllParameters()));
    }

    @Test
    void testSendWhatsAppInteractiveButtonsMessage() {
        assertThrows(ApiException.class,
                () -> api
                        .sendWhatsAppInteractiveButtonsMessage(WhatsAppInteractiveButtonsMessageTest
                                .getWhatsAppInteractiveButtonsMessageWithAllParameters()));
    }

    @Test
    void testSendWhatsAppInteractiveListMessage() {
        assertThrows(ApiException.class,
                () -> api.sendWhatsAppInteractiveListMessage(WhatsAppInteractiveListMessageTest
                        .getWhatsAppInteractiveListMessageWithAllParameters()));
    }

    @Test
    void testSendWhatsAppInteractiveProductMessage() {
        assertThrows(ApiException.class,
                () -> api
                        .sendWhatsAppInteractiveProductMessage(WhatsAppInteractiveProductMessageTest
                                .getWhatsAppInteractiveProductMessageWithAllParameters()));
    }

    @Test
    void testSendWhatsAppInteractiveMultiProductMessage() {
        assertThrows(ApiException.class,
                () -> api.sendWhatsAppInteractiveMultiProductMessage(
                        WhatsAppInteractiveMultiProductMessageTest
                                .getWhatsAppInteractiveMultiProductMessageWithAllParameters()));
    }
}
