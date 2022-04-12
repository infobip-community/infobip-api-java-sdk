
package io.github.infobip_community.client.channels.email.model;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.channels.common.Status;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class EmailScheduledStatusTest {
    @Test
    void testEmailScheduledStatusSerialization_withRequiredParameters() throws Exception {
        EmailScheduledStatus emailScheduledStatus = getEmailScheduledStatusWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailScheduledStatus);
    }

    @Test
    void testEmailScheduledStatusSerialization_withAllParameters() throws Exception {
        EmailScheduledStatus emailScheduledStatus = getEmailScheduledStatusWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailScheduledStatus);
    }

    @Test
    void validateEmailScheduledStatus_withRequiredParameters() {
        Set<ConstraintViolation<EmailScheduledStatus>> constraintViolations =
                getValidator().validate(getEmailScheduledStatusWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateEmailScheduledStatus_withAllParameters() {
        Set<ConstraintViolation<EmailScheduledStatus>> constraintViolations =
                getValidator().validate(getEmailScheduledStatusWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static EmailScheduledStatus getEmailScheduledStatusWithRequiredParameters() {
        return new EmailScheduledStatus(Status.FINISHED);
    }

    public static EmailScheduledStatus getEmailScheduledStatusWithAllParameters() {
        return new EmailScheduledStatus(null);
    }
}
