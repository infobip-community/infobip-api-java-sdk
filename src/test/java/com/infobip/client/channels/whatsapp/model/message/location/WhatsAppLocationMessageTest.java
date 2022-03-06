
package com.infobip.client.channels.whatsapp.model.message.location;

import static com.infobip.client.common.RequestValidator.getValidator;
import static org.junit.Assert.assertEquals;
import com.infobip.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class WhatsAppLocationMessageTest {
    @Test
    void testWhatsAppLocationMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppLocationMessage whatsAppMessage =
                getWhatsAppLocationMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppLocationMessageSerialization_withAllParameters() throws Exception {
        WhatsAppLocationMessage whatsAppMessage = getWhatsAppLocationMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
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
        assertEquals(0, constraintViolations.size());
    }

    public static WhatsAppLocationMessage getWhatsAppLocationMessageWithRequiredParameters() {
        return new WhatsAppLocationMessage("441134960000", "441134960001",
                new Content(44.9526862, 13.8545217));
    }

    public static WhatsAppLocationMessage getWhatsAppLocationMessageWithAllParameters() {
        return new WhatsAppLocationMessage("441134960000", "441134960001",
                new Content(44.9526862, 13.8545217).name("Infobip").address("Vodnjan, Croatia"))
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp");
    }
}
