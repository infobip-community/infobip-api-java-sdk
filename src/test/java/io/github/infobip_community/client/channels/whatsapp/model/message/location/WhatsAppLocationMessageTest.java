
package io.github.infobip_community.client.channels.whatsapp.model.message.location;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WhatsAppLocationMessageTest {
    @Test
    void testWhatsAppLocationMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppLocationMessage whatsAppMessage =
                getWhatsAppLocationMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void testWhatsAppLocationMessageSerialization_withAllParameters() throws Exception {
        WhatsAppLocationMessage whatsAppMessage = getWhatsAppLocationMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void validateWhatsAppLocationMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppLocationMessage>> constraintViolations =
                getValidator().validate(getWhatsAppLocationMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppLocationMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppLocationMessage>> constraintViolations =
                getValidator().validate(getWhatsAppLocationMessageWithAllParameters());
        assertEquals(2, constraintViolations.size());
    }

    public static WhatsAppLocationMessage getWhatsAppLocationMessageWithRequiredParameters() {
        return new WhatsAppLocationMessage("441134960000", "441134960001",
                new Content(44.9526862, 13.8545217));
    }

    public static WhatsAppLocationMessage getWhatsAppLocationMessageWithAllParameters() {
        return new WhatsAppLocationMessage("441134960000", "441134960001",
                new Content(999, 999).name("Infobip").address("Vodnjan, Croatia"))
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp");
    }
}
