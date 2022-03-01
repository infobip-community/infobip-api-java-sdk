
package com.infobip.client.channels.whatsapp.model.message.image;

import static org.junit.Assert.assertEquals;
import com.infobip.client.common.ModelValidator;
import com.infobip.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class WhatsAppImageMessageTest {
    @Test
    void testWhatsAppImageMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppImageMessage whatsAppMessage = getWhatsAppImageMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppImageMessageSerialization_withAllParameters() throws Exception {
        WhatsAppImageMessage whatsAppMessage = getWhatsAppImageMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void validateWhatsAppImageMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppImageMessage>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWhatsAppImageMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppImageMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppImageMessage>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWhatsAppImageMessageWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static WhatsAppImageMessage getWhatsAppImageMessageWithRequiredParameters() {
        return new WhatsAppImageMessage("441134960000", "441134960001",
                new Content("http://example.com/image"));
    }

    public static WhatsAppImageMessage getWhatsAppImageMessageWithAllParameters() {
        return new WhatsAppImageMessage("441134960000", "441134960001",
                new Content("http://example.com/image").caption("Some image caption"))
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp");
    }
}
