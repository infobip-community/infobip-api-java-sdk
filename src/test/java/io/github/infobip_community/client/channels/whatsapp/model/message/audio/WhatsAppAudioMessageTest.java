
package io.github.infobip_community.client.channels.whatsapp.model.message.audio;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WhatsAppAudioMessageTest {
    @Test
    void testWhatsAppAudioMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppAudioMessage whatsAppMessage = getWhatsAppAudioMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void testWhatsAppAudioMessageSerialization_withAllParameters() throws Exception {
        WhatsAppAudioMessage whatsAppMessage = getWhatsAppAudioMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void validateWhatsAppAudioMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppAudioMessage>> constraintViolations =
                getValidator().validate(getWhatsAppAudioMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppAudioMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppAudioMessage>> constraintViolations =
                getValidator().validate(getWhatsAppAudioMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static WhatsAppAudioMessage getWhatsAppAudioMessageWithRequiredParameters() {
        return new WhatsAppAudioMessage("441134960000", "441134960001",
                new Content("http://example.com/audio"));
    }

    public static WhatsAppAudioMessage getWhatsAppAudioMessageWithAllParameters() {
        return new WhatsAppAudioMessage("441134960000", "441134960001", new Content(""))
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp");
    }
}
