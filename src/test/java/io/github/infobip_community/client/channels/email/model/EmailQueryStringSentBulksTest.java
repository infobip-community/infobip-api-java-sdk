
package io.github.infobip_community.client.channels.email.model;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class EmailQueryStringSentBulksTest {
    @Test
    void testEmailQueryStringSentBulksSerialization_withRequiredParameters() throws Exception {
        EmailQueryStringSentBulks emailQueryStringSentBulks =
                getEmailQueryStringSentBulksWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailQueryStringSentBulks);
    }

    @Test
    void testEmailQueryStringSentBulksSerialization_withAllParameters() throws Exception {
        EmailQueryStringSentBulks emailQueryStringSentBulks =
                getEmailQueryStringSentBulksWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailQueryStringSentBulks);
    }

    @Test
    void validateEmailQueryStringSentBulks_withRequiredParameters() {
        Set<ConstraintViolation<EmailQueryStringSentBulks>> constraintViolations =
                getValidator().validate(getEmailQueryStringSentBulksWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateEmailQueryStringSentBulks_withAllParameters() {
        Set<ConstraintViolation<EmailQueryStringSentBulks>> constraintViolations =
                getValidator().validate(getEmailQueryStringSentBulksWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static EmailQueryStringSentBulks getEmailQueryStringSentBulksWithRequiredParameters() {
        return new EmailQueryStringSentBulks("bulk id");
    }

    public static EmailQueryStringSentBulks getEmailQueryStringSentBulksWithAllParameters() {
        return new EmailQueryStringSentBulks("");
    }
}
