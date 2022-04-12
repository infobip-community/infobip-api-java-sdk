
package io.github.infobip_community.client.channels.email.model;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class EmailQueryStringLogsTest {
    @Test
    void testEmailQueryStringLogsSerialization_withRequiredParameters() throws Exception {
        EmailQueryStringLogs emailQueryStringLogs = getEmailQueryStringLogsWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailQueryStringLogs);
    }

    @Test
    void testEmailQueryStringLogsSerialization_withAllParameters() throws Exception {
        EmailQueryStringLogs emailQueryStringLogs = getEmailQueryStringLogsWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailQueryStringLogs);
    }

    @Test
    void validateEmailQueryStringLogs_withRequiredParameters() {
        Set<ConstraintViolation<EmailQueryStringLogs>> constraintViolations =
                getValidator().validate(getEmailQueryStringLogsWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateEmailQueryStringLogs_withAllParameters() {
        Set<ConstraintViolation<EmailQueryStringLogs>> constraintViolations =
                getValidator().validate(getEmailQueryStringLogsWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static EmailQueryStringLogs getEmailQueryStringLogsWithRequiredParameters() {
        return new EmailQueryStringLogs();
    }

    public static EmailQueryStringLogs getEmailQueryStringLogsWithAllParameters() {
        return new EmailQueryStringLogs().messageId("messageId")
                .from("from@example.com")
                .to("to@example.com")
                .bulkId("bulkId")
                .generalStatus("status")
                .sentSince("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                .sentUntil("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                .limit(10);
    }
}
