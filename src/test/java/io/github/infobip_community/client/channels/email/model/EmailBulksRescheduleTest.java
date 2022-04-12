
package io.github.infobip_community.client.channels.email.model;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.time.OffsetDateTime;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class EmailBulksRescheduleTest {
    @Test
    void testEmailBulksRescheduleSerialization_withRequiredParameters() throws Exception {
        EmailBulksReschedule emailBulksReschedule = getEmailBulksRescheduleWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailBulksReschedule);
    }

    @Test
    void testEmailBulksRescheduleSerialization_withAllParameters() throws Exception {
        EmailBulksReschedule emailBulksReschedule = getEmailBulksRescheduleWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailBulksReschedule);
    }

    @Test
    void validateEmailBulksReschedule_withRequiredParameters() {
        Set<ConstraintViolation<EmailBulksReschedule>> constraintViolations =
                getValidator().validate(getEmailBulksRescheduleWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateEmailBulksReschedule_withAllParameters() {
        Set<ConstraintViolation<EmailBulksReschedule>> constraintViolations =
                getValidator().validate(getEmailBulksRescheduleWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static EmailBulksReschedule getEmailBulksRescheduleWithRequiredParameters() {
        return new EmailBulksReschedule(OffsetDateTime.parse("2021-08-25T16:00:00.000+02:00"));
    }

    public static EmailBulksReschedule getEmailBulksRescheduleWithAllParameters() {
        return new EmailBulksReschedule(null);
    }
}
