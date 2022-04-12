
package io.github.infobip_community.client.channels.sms.model.message.scheduled;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.time.OffsetDateTime;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class SmsRescheduleMessageTest {
    @Test
    void testSmsRescheduleMessageSerialization_withRequiredParameters() throws Exception {
        SmsRescheduleMessage smsRescheduleMessage = getSmsRescheduleMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsRescheduleMessage);
    }

    @Test
    void testSmsRescheduleMessageSerialization_withAllParameters() throws Exception {
        SmsRescheduleMessage smsRescheduleMessage = getSmsRescheduleMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsRescheduleMessage);
    }

    @Test
    void validateSmsRescheduleMessage_withRequiredParameters() {
        Set<ConstraintViolation<SmsRescheduleMessage>> constraintViolations =
                getValidator().validate(getSmsRescheduleMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateSmsRescheduleMessage_withAllParameters() {
        Set<ConstraintViolation<SmsRescheduleMessage>> constraintViolations =
                getValidator().validate(getSmsRescheduleMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static SmsRescheduleMessage getSmsRescheduleMessageWithRequiredParameters() {
        return new SmsRescheduleMessage(OffsetDateTime.parse("2021-08-25T16:00:00.000+02:00"));
    }

    public static SmsRescheduleMessage getSmsRescheduleMessageWithAllParameters() {
        return new SmsRescheduleMessage(null);
    }
}
