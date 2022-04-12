
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Arrays;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WhatsAppContactMessageTest {
    @Test
    void testWhatsAppContactMessageSerialization_withRequiredParameters() throws Exception {
        WhatsAppContactMessage whatsAppMessage = getWhatsAppContactMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void testWhatsAppContactMessageSerialization_withAllParameters() throws Exception {
        WhatsAppContactMessage whatsAppMessage = getWhatsAppContactMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppMessage);
    }

    @Test
    void validateWhatsAppContactMessage_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppContactMessage>> constraintViolations =
                getValidator().validate(getWhatsAppContactMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppContactMessage_withAllParameters() {
        Set<ConstraintViolation<WhatsAppContactMessage>> constraintViolations =
                getValidator().validate(getWhatsAppContactMessageWithAllParameters());
        assertEquals(2, constraintViolations.size());
    }

    public static WhatsAppContactMessage getWhatsAppContactMessageWithRequiredParameters() {
        return new WhatsAppContactMessage("441134960000", "441134960001",
                new Content(Arrays.asList(new Contact(new Name("John", "Mr. John Smith")))));
    }

    public static WhatsAppContactMessage getWhatsAppContactMessageWithAllParameters() {
        return new WhatsAppContactMessage("", "441134960001",
                new Content(Arrays.asList(
                        new Contact(new Name("John", "Mr. John Smith").lastName("Smith")
                                .middleName("B")
                                .nameSuffix("doc.")
                                .namePrefix("Mr."))
                                        .addresses(Arrays.asList(
                                                new Address().street("Istarska")
                                                        .city("Vodnjan")
                                                        .state("HR")
                                                        .zip("52215")
                                                        .country("Croatia")
                                                        .countryCode("HR")
                                                        .type(AddressType.WORK),
                                                new Address().street("Istarska")
                                                        .city("Vodnjan")
                                                        .state("HR")
                                                        .zip("52215")
                                                        .country("Croatia")
                                                        .countryCode("HR")
                                                        .type(AddressType.HOME)))
                                        .birthday("2010-01-01")
                                        .emails(Arrays.asList(
                                                new Email().email("John.Smith@example.com")
                                                        .type(EmailType.WORK),
                                                new Email().email("John.Smith.priv@example.com")
                                                        .type(EmailType.HOME)))
                                        .org(new Org().company("Company Name")
                                                .department("Department")
                                                .title("Director"))
                                        .phones(Arrays.asList(
                                                new Phone().phone("+441134960019")
                                                        .type(PhoneType.HOME)
                                                        .waId("441134960019"),
                                                new Phone().phone("+441134960000")
                                                        .type(PhoneType.WORK)
                                                        .waId("441134960000")))
                                        .urls(Arrays.asList(
                                                new Url().url("http://example.com/John.Smith")
                                                        .type(UrlType.WORK),
                                                new Url().url("http://example.com/home/John.Smith")
                                                        .type(UrlType.HOME))),
                        new Contact(new Name("Alexander", "Mr. Alexander Abraham")))))
                                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                                .callbackData("Callback data")
                                .notifyUrl("https://www.example.com/whatsapp");
    }
}
