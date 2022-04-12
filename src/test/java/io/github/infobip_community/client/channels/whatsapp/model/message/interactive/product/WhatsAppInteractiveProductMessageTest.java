
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.product;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WhatsAppInteractiveProductMessageTest {
    @Test
    void testWhatsAppInteractiveProductMessageSerialization_withRequiredParameters()
            throws Exception {
        WhatsAppInteractiveProductMessage whatsAppMessage =
                getWhatsAppInteractiveProductMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void testWhatsAppInteractiveProductMessageSerialization_withAllParameters() throws Exception {
        WhatsAppInteractiveProductMessage whatsAppMessage =
                getWhatsAppInteractiveProductMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void validateWhatsAppInteractiveProductMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppInteractiveProductMessage>> constraintViolations =
                getValidator()
                        .validate(getWhatsAppInteractiveProductMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppInteractiveProductMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppInteractiveProductMessage>> constraintViolations =
                getValidator().validate(getWhatsAppInteractiveProductMessageWithAllParameters());
        assertEquals(2, constraintViolations.size());
    }

    public static WhatsAppInteractiveProductMessage
            getWhatsAppInteractiveProductMessageWithRequiredParameters() {
        return new WhatsAppInteractiveProductMessage("441134960000", "441134960001",
                new Content(new Action("1", "2")));
    }

    public static WhatsAppInteractiveProductMessage
            getWhatsAppInteractiveProductMessageWithAllParameters() {
        return new WhatsAppInteractiveProductMessage("", "441134960001",
                new Content(new Action("1", "2")).body(new Body("Some text"))
                        .footer(new Footer("Footer")))
                                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                                .callbackData("Callback data")
                                .notifyUrl("https://www.example.com/whatsapp");
    }
}
