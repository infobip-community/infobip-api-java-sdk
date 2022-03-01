
package com.infobip.client.channels.whatsapp.model.message.text;

import static org.junit.Assert.assertEquals;
import com.infobip.client.common.ModelValidator;
import com.infobip.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class WhatsAppTextMessageTest {
    @Test
    void testWhatsAppTextMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppTextMessage whatsAppMessage = getWhatsAppTextMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppTextMessageSerialization_withAllParameters() throws Exception {
        WhatsAppTextMessage whatsAppMessage = getWhatsAppTextMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void validateWhatsAppTextMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppTextMessage>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWhatsAppTextMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppTextMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppTextMessage>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWhatsAppTextMessageWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static WhatsAppTextMessage getWhatsAppTextMessageWithRequiredParameters() {
        return new WhatsAppTextMessage("441134960000", "441134960001", new Content("Some text"));
    }

    public static WhatsAppTextMessage getWhatsAppTextMessageWithAllParameters() {
        return new WhatsAppTextMessage("441134960000", "441134960001",
                new Content("Some text with url: http://example.com").previewUrl(true))
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp");
    }
}
