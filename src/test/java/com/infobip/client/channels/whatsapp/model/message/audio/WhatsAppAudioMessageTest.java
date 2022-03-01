
package com.infobip.client.channels.whatsapp.model.message.audio;

import static org.junit.Assert.assertEquals;
import com.infobip.client.common.ModelValidator;
import com.infobip.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class WhatsAppAudioMessageTest {
    @Test
    void testWhatsAppAudioMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppAudioMessage whatsAppMessage = getWhatsAppAudioMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppAudioMessageSerialization_withAllParameters() throws Exception {
        WhatsAppAudioMessage whatsAppMessage = getWhatsAppAudioMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void validateWhatsAppAudioMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppAudioMessage>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWhatsAppAudioMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppAudioMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppAudioMessage>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWhatsAppAudioMessageWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static WhatsAppAudioMessage getWhatsAppAudioMessageWithRequiredParameters() {
        return new WhatsAppAudioMessage("441134960000", "441134960001",
                new Content("http://example.com/audio"));
    }

    public static WhatsAppAudioMessage getWhatsAppAudioMessageWithAllParameters() {
        return new WhatsAppAudioMessage("441134960000", "441134960001",
                new Content("http://example.com/audio"))
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp");
    }
}
