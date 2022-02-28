
package com.infobip.client.channels.whatsapp.model.message.video;

import com.infobip.client.common.Serde;
import org.junit.jupiter.api.Test;

public class WhatsAppVideoMessageTest {
    @Test
    void testWhatsAppVideoMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppVideoMessage whatsAppMessage = getWhatsAppVideoMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppVideoMessageSerialization_withAllParameters() throws Exception {
        WhatsAppVideoMessage whatsAppMessage = getWhatsAppVideoMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    public static WhatsAppVideoMessage getWhatsAppVideoMessageWithRequiredParameters() {
        return new WhatsAppVideoMessage("441134960000", "441134960001",
                new Content("http://example.com/video"));
    }

    public static WhatsAppVideoMessage getWhatsAppVideoMessageWithAllParameters() {
        return new WhatsAppVideoMessage("441134960000", "441134960001",
                new Content("http://example.com/video").caption("Some video caption"))
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp");
    }
}
