
package com.infobip.client.channels.whatsapp.model.message.location;

import com.infobip.client.common.Serde;
import org.junit.jupiter.api.Test;

public class WhatsAppLocationMessageTest {
    @Test
    void testWhatsAppLocationMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppLocationMessage whatsAppMessage =
                getWhatsAppLocationMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppLocationMessageSerialization_withAllParameters() throws Exception {
        WhatsAppLocationMessage whatsAppMessage = getWhatsAppLocationMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    public static WhatsAppLocationMessage getWhatsAppLocationMessageWithRequiredParameters() {
        return new WhatsAppLocationMessage("441134960000", "441134960001",
                new Content(44.9526862, 13.8545217));
    }

    public static WhatsAppLocationMessage getWhatsAppLocationMessageWithAllParameters() {
        return new WhatsAppLocationMessage("441134960000", "441134960001",
                new Content(44.9526862, 13.8545217).name("Infobip")
                        .address("Vodnjan, Croatia"))
                                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                                .callbackData("Callback data")
                                .notifyUrl("https://www.example.com/whatsapp");
    }
}
