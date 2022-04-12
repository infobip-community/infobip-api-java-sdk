
package io.github.infobip_community.client.channels.whatsapp.model.message.video;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WhatsAppVideoMessageTest {
    @Test
    void testWhatsAppVideoMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppVideoMessage whatsAppMessage = getWhatsAppVideoMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void testWhatsAppVideoMessageSerialization_withAllParameters() throws Exception {
        WhatsAppVideoMessage whatsAppMessage = getWhatsAppVideoMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void validateWhatsAppVideoMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppVideoMessage>> constraintViolations =
                getValidator().validate(getWhatsAppVideoMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppVideoMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppVideoMessage>> constraintViolations =
                getValidator().validate(getWhatsAppVideoMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static WhatsAppVideoMessage getWhatsAppVideoMessageWithRequiredParameters() {
        return new WhatsAppVideoMessage("441134960000", "441134960001",
                new Content("http://example.com/video"));
    }

    public static WhatsAppVideoMessage getWhatsAppVideoMessageWithAllParameters() {
        return new WhatsAppVideoMessage("441134960000", "441134960001",
                new Content("").caption("Some video caption"))
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp");
    }
}
