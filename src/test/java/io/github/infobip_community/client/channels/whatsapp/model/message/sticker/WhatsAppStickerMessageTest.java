
package io.github.infobip_community.client.channels.whatsapp.model.message.sticker;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WhatsAppStickerMessageTest {
    @Test
    void testWhatsAppStickerMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppStickerMessage whatsAppMessage = getWhatsAppStickerMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void testWhatsAppStickerMessageSerialization_withAllParameters() throws Exception {
        WhatsAppStickerMessage whatsAppMessage = getWhatsAppStickerMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void validateWhatsAppStickerMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppStickerMessage>> constraintViolations =
                getValidator().validate(getWhatsAppStickerMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppStickerMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppStickerMessage>> constraintViolations =
                getValidator().validate(getWhatsAppStickerMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static WhatsAppStickerMessage getWhatsAppStickerMessageWithRequiredParameters() {
        return new WhatsAppStickerMessage("441134960000", "441134960001",
                new Content("http://example.com/sticker"));
    }

    public static WhatsAppStickerMessage getWhatsAppStickerMessageWithAllParameters() {
        return new WhatsAppStickerMessage("441134960000", "441134960001", new Content(""))
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp");
    }
}
