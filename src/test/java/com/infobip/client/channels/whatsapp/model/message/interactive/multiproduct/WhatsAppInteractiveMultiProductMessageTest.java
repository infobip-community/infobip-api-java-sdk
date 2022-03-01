
package com.infobip.client.channels.whatsapp.model.message.interactive.multiproduct;

import static org.junit.Assert.assertEquals;
import com.infobip.client.common.ModelValidator;
import com.infobip.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Arrays;
import java.util.Set;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class WhatsAppInteractiveMultiProductMessageTest {
    @Test
    void testWhatsAppInteractiveMultiProductMessageSerialization_withRequiredParameters()
            throws Exception {
        WhatsAppInteractiveMultiProductMessage whatsAppMessage =
                getWhatsAppInteractiveMultiProductMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppInteractiveMultiProductMessageSerialization_withAllParameters()
            throws Exception {
        WhatsAppInteractiveMultiProductMessage whatsAppMessage =
                getWhatsAppInteractiveMultiProductMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void validateWhatsAppInteractiveMultiProductMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppInteractiveMultiProductMessage>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(
                                getWhatsAppInteractiveMultiProductMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppInteractiveMultiProductMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppInteractiveMultiProductMessage>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWhatsAppInteractiveMultiProductMessageWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static WhatsAppInteractiveMultiProductMessage
            getWhatsAppInteractiveMultiProductMessageWithRequiredParameters() {
        return new WhatsAppInteractiveMultiProductMessage("441134960000", "441134960001",
                new Content(new TextHeader("Header"), new Body("Some text"),
                        new Action("1", Arrays.asList(new Section(Arrays.asList("1", "2", "3"))))));
    }

    public static WhatsAppInteractiveMultiProductMessage
            getWhatsAppInteractiveMultiProductMessageWithAllParameters() {
        return new WhatsAppInteractiveMultiProductMessage("441134960000", "441134960001",
                new Content(new TextHeader("Header"), new Body("Some text"), new Action("1",
                        Arrays.asList(new Section(Arrays.asList("1", "2", "3")).title("Title 1"),
                                new Section(Arrays.asList("4", "5", "6")).title("Title 2"))))
                                        .footer(new Footer("Footer")))
                                                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                                                .callbackData("Callback data")
                                                .notifyUrl("https://www.example.com/whatsapp");
    }
}
