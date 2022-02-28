
package com.infobip.client.channels.whatsapp.model.message.sticker;

import com.infobip.client.common.Serde;
import org.junit.jupiter.api.Test;

public class WhatsAppStickerMessageTest {
    @Test
    void testWhatsAppStickerMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppStickerMessage whatsAppMessage = getWhatsAppStickerMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppStickerMessageSerialization_withAllParameters() throws Exception {
        WhatsAppStickerMessage whatsAppMessage = getWhatsAppStickerMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        System.out.println(whatsAppMessage);
        System.out.println(json + "\n");
    }

    public static WhatsAppStickerMessage getWhatsAppStickerMessageWithRequiredParameters() {
        return new WhatsAppStickerMessage("441134960000", "441134960001",
                new Content("http://example.com/sticker"));
    }

    public static WhatsAppStickerMessage getWhatsAppStickerMessageWithAllParameters() {
        return new WhatsAppStickerMessage("441134960000", "441134960001",
                new Content("http://example.com/sticker"))
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp");
    }
}