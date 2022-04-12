
package io.github.infobip_community.client.channels.whatsapp.model.message.document;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WhatsAppDocumentMessageTest {
    @Test
    void testWhatsAppDocumentMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppDocumentMessage whatsAppMessage =
                getWhatsAppDocumentMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void testWhatsAppDocumentMessageSerialization_withAllParameters() throws Exception {
        WhatsAppDocumentMessage whatsAppMessage = getWhatsAppDocumentMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void validateWhatsAppDocumentMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppDocumentMessage>> constraintViolations =
                getValidator().validate(getWhatsAppDocumentMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppDocumentMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppDocumentMessage>> constraintViolations =
                getValidator().validate(getWhatsAppDocumentMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static WhatsAppDocumentMessage getWhatsAppDocumentMessageWithRequiredParameters() {
        return new WhatsAppDocumentMessage("441134960000", "441134960001",
                new Content("http://example.com/document"));
    }

    public static WhatsAppDocumentMessage getWhatsAppDocumentMessageWithAllParameters() {
        return new WhatsAppDocumentMessage("441134960000", "441134960001",
                new Content("").caption("Some document caption").filename("filename.pdf"))
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp");
    }
}
