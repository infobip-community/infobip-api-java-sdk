
package com.infobip.client.channels.whatsapp.model.message.image;

import com.infobip.client.common.Serde;
import org.junit.jupiter.api.Test;

public class WhatsAppImageMessageTest {
    @Test
    void testWhatsAppImageMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppImageMessage whatsAppMessage = getWhatsAppImageMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppImageMessageSerialization_withAllParameters() throws Exception {
        WhatsAppImageMessage whatsAppMessage = getWhatsAppImageMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    public static WhatsAppImageMessage getWhatsAppImageMessageWithRequiredParameters() {
        return new WhatsAppImageMessage("441134960000", "441134960001",
                new Content("http://example.com/image"));
    }

    public static WhatsAppImageMessage getWhatsAppImageMessageWithAllParameters() {
        return new WhatsAppImageMessage("441134960000", "441134960001",
                new Content("http://example.com/image").caption("Some image caption"))
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp");
    }
}
