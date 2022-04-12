
package io.github.infobip_community.client.channels.whatsapp.model.message.text;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WhatsAppTextMessageTest {
    @Test
    void testWhatsAppTextMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppTextMessage whatsAppMessage = getWhatsAppTextMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void testWhatsAppTextMessageSerialization_withAllParameters() throws Exception {
        WhatsAppTextMessage whatsAppMessage = getWhatsAppTextMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void validateWhatsAppTextMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppTextMessage>> constraintViolations =
                getValidator().validate(getWhatsAppTextMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppTextMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppTextMessage>> constraintViolations =
                getValidator().validate(getWhatsAppTextMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static WhatsAppTextMessage getWhatsAppTextMessageWithRequiredParameters() {
        return new WhatsAppTextMessage("441134960000", "441134960001", new Content("Some text"));
    }

    public static WhatsAppTextMessage getWhatsAppTextMessageWithAllParameters() {
        return new WhatsAppTextMessage("441134960000", "441134960001",
                new Content("").previewUrl(true)).messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp");
    }
}
