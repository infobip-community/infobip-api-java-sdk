
package com.infobip.client.channels.whatsapp.model.message.interactive.product;

import static org.junit.Assert.assertEquals;
import com.infobip.client.common.ModelValidator;
import com.infobip.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class WhatsAppInteractiveProductMessageTest {
    @Test
    void testWhatsAppInteractiveProductMessageSerialization_withRequiredParameters()
            throws Exception {
        WhatsAppInteractiveProductMessage whatsAppMessage =
                getWhatsAppInteractiveProductMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppInteractiveProductMessageSerialization_withAllParameters() throws Exception {
        WhatsAppInteractiveProductMessage whatsAppMessage =
                getWhatsAppInteractiveProductMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void validateWhatsAppInteractiveProductMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppInteractiveProductMessage>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWhatsAppInteractiveProductMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppInteractiveProductMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppInteractiveProductMessage>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWhatsAppInteractiveProductMessageWithAllParameters());
        assertEquals(0, constraintViolations.size());
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
