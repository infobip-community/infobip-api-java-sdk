
package com.infobip.client.channels.whatsapp.model.message.interactive.product;

import com.infobip.client.common.Serde;
import org.junit.jupiter.api.Test;

public class WhatsAppInteractiveProductMessageTest {
    @Test
    void testWhatsAppInteractiveProductMessageSerialization_withRequiredParameters()
            throws Exception {
        WhatsAppInteractiveProductMessage whatsAppMessage =
                getWhatsAppInteractiveProductMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppInteractiveProductMessageSerialization_withAllParameters() throws Exception {
        WhatsAppInteractiveProductMessage whatsAppMessage =
                getWhatsAppInteractiveProductMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    public static WhatsAppInteractiveProductMessage
            getWhatsAppInteractiveProductMessageWithRequiredParameters() {
        return new WhatsAppInteractiveProductMessage("441134960000", "441134960001",
                new Content(new Action("1", "2")));
    }

    public static WhatsAppInteractiveProductMessage
            getWhatsAppInteractiveProductMessageWithAllParameters() {
        return new WhatsAppInteractiveProductMessage("441134960000", "441134960001",
                new Content(new Action("1", "2")).body(new Body("Some text"))
                        .footer(new Footer("Footer")))
                                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                                .callbackData("Callback data")
                                .notifyUrl("https://www.example.com/whatsapp");
    }
}
