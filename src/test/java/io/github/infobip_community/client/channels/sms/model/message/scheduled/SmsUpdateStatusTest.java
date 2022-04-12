
package io.github.infobip_community.client.channels.sms.model.message.scheduled;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.channels.common.Status;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class SmsUpdateStatusTest {
    @Test
    void testSmsUpdateStatusSerialization_withRequiredParameters() throws Exception {
        SmsUpdateStatus smsUpdateStatus = getSmsUpdateStatusWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsUpdateStatus);
    }

    @Test
    void testSmsUpdateStatusSerialization_withAllParameters() throws Exception {
        SmsUpdateStatus smsUpdateStatus = getSmsUpdateStatusWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsUpdateStatus);
    }

    @Test
    void validateSmsUpdateStatus_withRequiredParameters() {
        Set<ConstraintViolation<SmsUpdateStatus>> constraintViolations =
                getValidator().validate(getSmsUpdateStatusWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateSmsUpdateStatus_withAllParameters() {
        Set<ConstraintViolation<SmsUpdateStatus>> constraintViolations =
                getValidator().validate(getSmsUpdateStatusWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static SmsUpdateStatus getSmsUpdateStatusWithRequiredParameters() {
        return new SmsUpdateStatus(Status.CANCELED);
    }

    public static SmsUpdateStatus getSmsUpdateStatusWithAllParameters() {
        return new SmsUpdateStatus(null);
    }
}
