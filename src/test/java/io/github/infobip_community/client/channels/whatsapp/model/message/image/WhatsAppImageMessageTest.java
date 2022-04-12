
package io.github.infobip_community.client.channels.whatsapp.model.message.image;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WhatsAppImageMessageTest {
    @Test
    void testWhatsAppImageMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppImageMessage whatsAppMessage = getWhatsAppImageMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void testWhatsAppImageMessageSerialization_withAllParameters() throws Exception {
        WhatsAppImageMessage whatsAppMessage = getWhatsAppImageMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void validateWhatsAppImageMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppImageMessage>> constraintViolations =
                getValidator().validate(getWhatsAppImageMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppImageMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppImageMessage>> constraintViolations =
                getValidator().validate(getWhatsAppImageMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static WhatsAppImageMessage getWhatsAppImageMessageWithRequiredParameters() {
        return new WhatsAppImageMessage("441134960000", "441134960001",
                new Content("http://example.com/image"));
    }

    public static WhatsAppImageMessage getWhatsAppImageMessageWithAllParameters() {
        return new WhatsAppImageMessage("441134960000", "441134960001",
                new Content("").caption("Some image caption"))
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp");
    }
}
