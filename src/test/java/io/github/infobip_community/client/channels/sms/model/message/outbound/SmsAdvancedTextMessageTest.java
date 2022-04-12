
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.channels.common.Day;
import io.github.infobip_community.client.channels.common.DeliveryTimeWindow;
import io.github.infobip_community.client.channels.common.From;
import io.github.infobip_community.client.channels.common.NotifyContentType;
import io.github.infobip_community.client.channels.common.To;
import io.github.infobip_community.client.channels.sms.model.common.IndiaDlt;
import io.github.infobip_community.client.channels.sms.model.common.Regional;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class SmsAdvancedTextMessageTest {
    @Test
    void testSmsAdvancedTextMessageSerialization_withRequiredParameters() throws Exception {
        SmsAdvancedTextMessage smsAdvancedTextMessage =
                getSmsAdvancedTextMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsAdvancedTextMessage);
    }

    @Test
    void testSmsAdvancedTextMessageSerialization_withAllParameters() throws Exception {
        SmsAdvancedTextMessage smsAdvancedTextMessage =
                getSmsAdvancedTextMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsAdvancedTextMessage);
    }

    @Test
    void validateSmsAdvancedTextMessage_withRequiredParameters() {
        Set<ConstraintViolation<SmsAdvancedTextMessage>> constraintViolations =
                getValidator().validate(getSmsAdvancedTextMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateSmsAdvancedTextMessage_withAllParameters() {
        Set<ConstraintViolation<SmsAdvancedTextMessage>> constraintViolations =
                getValidator().validate(getSmsAdvancedTextMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static SmsAdvancedTextMessage getSmsAdvancedTextMessageWithRequiredParameters() {
        return new SmsAdvancedTextMessage(
                Arrays.asList(new TextMessage(Arrays.asList(new Destination("41793026727")))));
    }

    public static SmsAdvancedTextMessage getSmsAdvancedTextMessageWithAllParameters() {
        return new SmsAdvancedTextMessage(Arrays.asList(
                new TextMessage(Arrays.asList(new Destination(null))),
                new TextMessage(Arrays.asList(new Destination("41793026727").messageId("11"),
                        new Destination("41793026729").messageId("22")))
                                .callbackData("DLR callback data")
                                .deliveryTimeWindow(new DeliveryTimeWindow(
                                        Arrays.asList(Day.MONDAY, Day.TUESDAY)).from(new From(6, 0))
                                                .to(new To(23, 59)))
                                .flash(false)
                                .from("InfoSMS")
                                .intermediateReport(true)
                                .language(new Language().languageCode(LanguageCode.TR))
                                .notifyContentType(NotifyContentType.JSON)
                                .notifyUrl("https://www.example.com/sms/advanced")
                                .regional(new Regional()
                                        .indiaDlt(new IndiaDlt("11").contentTemplateId("22")))
                                .sendAt(OffsetDateTime.parse("2021-08-25T16:00:00.000+02:00"))
                                .text("A long time ago, in a galaxy far, far away...")
                                .transliteration(Transliteration.BALTIC)
                                .validityPeriod(720L)))
                                        .bulkId("BULK-ID-123-xyz")
                                        .sendingSpeedLimit(new SendingSpeedLimit(1)
                                                .timeUnit(SpeedLimitTimeUnit.DAY))
                                        .tracking(new Tracking()
                                                .baseUrl("https://www.example.com/sms/advanced")
                                                .processKey("key")
                                                .track(ConversionRateTrack.SMS)
                                                .type(ConversionType.ONE_TIME_PIN));
    }
}
