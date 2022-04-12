
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.channels.common.NotifyContentType;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.time.OffsetDateTime;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class SmsQueryStringMessageTest {
    @Test
    void testSmsQueryStringMessageSerialization_withRequiredParameters() throws Exception {
        SmsQueryStringMessage smsQueryStringMessage =
                getSmsQueryStringMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsQueryStringMessage);
    }

    @Test
    void testSmsQueryStringMessageSerialization_withAllParameters() throws Exception {
        SmsQueryStringMessage smsQueryStringMessage = getSmsQueryStringMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsQueryStringMessage);
    }

    @Test
    void validateSmsQueryStringMessage_withRequiredParameters() {
        Set<ConstraintViolation<SmsQueryStringMessage>> constraintViolations =
                getValidator().validate(getSmsQueryStringMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateSmsQueryStringMessage_withAllParameters() {
        Set<ConstraintViolation<SmsQueryStringMessage>> constraintViolations =
                getValidator().validate(getSmsQueryStringMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static SmsQueryStringMessage getSmsQueryStringMessageWithRequiredParameters() {
        return new SmsQueryStringMessage("username", "password", "41793026727");
    }

    public static SmsQueryStringMessage getSmsQueryStringMessageWithAllParameters() {
        return new SmsQueryStringMessage("username", "password", "41793026727").bulkId("ID")
                .from("InfoSMS")
                .text("Message text")
                .flash(true)
                .transliteration(Transliteration.TURKISH)
                .languageCode(LanguageCode.TR)
                .intermediateReport(true)
                .notifyUrl(" XXX ://www.example.com")
                .notifyContentType(NotifyContentType.JSON)
                .callbackData("callbackData")
                .validityPeriod(720)
                .sendAt(OffsetDateTime.parse("2021-08-25T16:00:00.000+02:00"))
                .track("URL")
                .processKey("key")
                .trackingType("Custom tracking type")
                .indiaDltContentTemplateId("ID")
                .indiaDltPrincipalEntityId("ID");
    }
}
