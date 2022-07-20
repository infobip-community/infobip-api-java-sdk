
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.multiproduct;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.Body;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.Footer;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.TextHeader;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Arrays;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WhatsAppInteractiveMultiProductMessageTest {
    @Test
    void testWhatsAppInteractiveMultiProductMessageSerialization_withRequiredParameters()
            throws Exception {
        WhatsAppInteractiveMultiProductMessage whatsAppMessage =
                getWhatsAppInteractiveMultiProductMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void testWhatsAppInteractiveMultiProductMessageSerialization_withAllParameters()
            throws Exception {
        WhatsAppInteractiveMultiProductMessage whatsAppMessage =
                getWhatsAppInteractiveMultiProductMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void validateWhatsAppInteractiveMultiProductMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppInteractiveMultiProductMessage>> constraintViolations =
                getValidator().validate(
                        getWhatsAppInteractiveMultiProductMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppInteractiveMultiProductMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppInteractiveMultiProductMessage>> constraintViolations =
                getValidator()
                        .validate(getWhatsAppInteractiveMultiProductMessageWithAllParameters());
        assertEquals(2, constraintViolations.size());
    }

    public static WhatsAppInteractiveMultiProductMessage
            getWhatsAppInteractiveMultiProductMessageWithRequiredParameters() {
        return new WhatsAppInteractiveMultiProductMessage("441134960000", "441134960001",
                new MultiProductContent(new TextHeader("Header"), new Body("Some text"),
                        new MultiProductAction("1", Arrays.asList(new Section(Arrays.asList("1", "2", "3"))))));
    }

    public static WhatsAppInteractiveMultiProductMessage
            getWhatsAppInteractiveMultiProductMessageWithAllParameters() {
        return new WhatsAppInteractiveMultiProductMessage("", "441134960001",
                new MultiProductContent(new TextHeader("Header"), new Body("Some text"), new MultiProductAction("1",
                        Arrays.asList(new Section(Arrays.asList("1", "2", "3")).title("Title 1"),
                                new Section(Arrays.asList("4", "5", "6")).title("Title 2"))))
                                        .footer(new Footer("Footer")))
                                                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                                                .callbackData("Callback data")
                                                .notifyUrl("https://www.example.com/whatsapp");
    }
}
