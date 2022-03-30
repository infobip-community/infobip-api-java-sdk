
package com.infobip.client.channels.whatsapp.model.message.interactive.button;

import static com.infobip.client.common.RequestValidator.getValidator;
import static org.junit.Assert.assertEquals;
import com.infobip.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Arrays;
import java.util.Set;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class WhatsAppInteractiveButtonsMessageTest {
    @Test
    void testWhatsAppInteractiveButtonsMessageSerialization_withRequiredParameters()
            throws Exception {
        WhatsAppInteractiveButtonsMessage whatsAppMessage =
                getWhatsAppInteractiveButtonsMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppInteractiveButtonsMessageSerialization_withAllParameters() throws Exception {
        WhatsAppInteractiveButtonsMessage whatsAppMessage =
                getWhatsAppInteractiveButtonsMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
        // System.out.println(whatsAppMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void validateWhatsAppInteractiveButtonsMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppInteractiveButtonsMessage>> constraintViolations =
                getValidator()
                        .validate(getWhatsAppInteractiveButtonsMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppInteractiveButtonsMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppInteractiveButtonsMessage>> constraintViolations =
                getValidator().validate(getWhatsAppInteractiveButtonsMessageWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static WhatsAppInteractiveButtonsMessage
            getWhatsAppInteractiveButtonsMessageWithRequiredParameters() {
        return new WhatsAppInteractiveButtonsMessage("441134960000", "441134960001",
                new Content(new Body("Some text"),
                        new Action(Arrays.asList(new Button(ButtonType.REPLY, "1", "Yes")))));
    }

    public static WhatsAppInteractiveButtonsMessage
            getWhatsAppInteractiveButtonsMessageWithAllParameters() {
        return new WhatsAppInteractiveButtonsMessage("441134960000", "441134960001",
                new Content(new Body("Some text"),
                        new Action(Arrays.asList(new Button(ButtonType.REPLY, "1", "Yes"),
                                new Button(ButtonType.REPLY, "2", "No"))))
                                        .header(new DocumentHeader("https://example.com/document")
                                                .filename("document.pdf"))
                                        .footer(new Footer("Footer")))
                                                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                                                .callbackData("Callback data")
                                                .notifyUrl("https://www.example.com/whatsapp");
    }
}
