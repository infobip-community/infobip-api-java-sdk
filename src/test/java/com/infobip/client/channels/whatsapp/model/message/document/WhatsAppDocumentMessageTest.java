
package com.infobip.client.channels.whatsapp.model.message.document;

import com.infobip.client.common.Serde;
import org.junit.jupiter.api.Test;

public class WhatsAppDocumentMessageTest {
    @Test
    void testWhatsAppDocumentMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppDocumentMessage whatsAppMessage =
                getWhatsAppDocumentMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppDocumentMessageSerialization_withAllParameters() throws Exception {
        WhatsAppDocumentMessage whatsAppMessage = getWhatsAppDocumentMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    private WhatsAppDocumentMessage getWhatsAppDocumentMessageWithRequiredParameters() {
        return new WhatsAppDocumentMessage("441134960000", "441134960001",
                new Content("http://example.com/document"));
    }

    private WhatsAppDocumentMessage getWhatsAppDocumentMessageWithAllParameters() {
        return new WhatsAppDocumentMessage("441134960000", "441134960001",
                new Content("http://example.com/document").caption("Some document caption")
                        .filename("filename.pdf")).messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                                .callbackData("Callback data")
                                .notifyUrl("https://www.example.com/whatsapp");
    }
}
