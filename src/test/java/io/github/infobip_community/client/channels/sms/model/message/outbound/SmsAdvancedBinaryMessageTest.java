
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

public class SmsAdvancedBinaryMessageTest {
    @Test
    void testSmsAdvancedBinaryMessageSerialization_withRequiredParameters() throws Exception {
        SmsAdvancedBinaryMessage smsAdvancedBinaryMessage =
                getSmsAdvancedBinaryMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsAdvancedBinaryMessage);
    }

    @Test
    void testSmsAdvancedBinaryMessageSerialization_withAllParameters() throws Exception {
        SmsAdvancedBinaryMessage smsAdvancedBinaryMessage =
                getSmsAdvancedBinaryMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsAdvancedBinaryMessage);
    }

    @Test
    void validateSmsAdvancedBinaryMessage_withRequiredParameters() {
        Set<ConstraintViolation<SmsAdvancedBinaryMessage>> constraintViolations =
                getValidator().validate(getSmsAdvancedBinaryMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateSmsAdvancedBinaryMessage_withAllParameters() {
        Set<ConstraintViolation<SmsAdvancedBinaryMessage>> constraintViolations =
                getValidator().validate(getSmsAdvancedBinaryMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static SmsAdvancedBinaryMessage getSmsAdvancedBinaryMessageWithRequiredParameters() {
        return new SmsAdvancedBinaryMessage(
                Arrays.asList(new BinaryMessage(Arrays.asList(new Destination("41793026727")))));
    }

    public static SmsAdvancedBinaryMessage getSmsAdvancedBinaryMessageWithAllParameters() {
        return new SmsAdvancedBinaryMessage(Arrays
                .asList(new BinaryMessage(Arrays.asList(new Destination(null).messageId("22")))
                        .binary(new Binary("54 65 73 74 20 6d 65 73 73 61 67 65 2e").dataCoding(0)
                                .esmClass(0))
                        .callbackData("DLR callback data")
                        .deliveryTimeWindow(
                                new DeliveryTimeWindow(Arrays.asList(Day.MONDAY, Day.WEDNESDAY))
                                        .from(new From(12, 23))
                                        .to(new To(13, 33)))
                        .flash(false)
                        .from("41793026700")
                        .intermediateReport(false)
                        .notifyContentType(NotifyContentType.JSON)
                        .notifyUrl("https://www.example.com/sms/advanced")
                        .regional(new Regional()
                                .indiaDlt(new IndiaDlt("Some ID").contentTemplateId("Some ID")))
                        .sendAt(OffsetDateTime.parse("2021-08-25T16:00:00.000+02:00"))
                        .validityPeriod(720L))).bulkId("BULK-ID-123-xyz")
                                .sendingSpeedLimit(
                                        new SendingSpeedLimit(1).timeUnit(SpeedLimitTimeUnit.DAY));
    }
}
