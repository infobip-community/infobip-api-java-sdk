
package io.github.infobip_community.client.channels.email.model;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class EmailQueryStringDeliveryReportsTest {
    @Test
    void testEmailQueryStringDeliveryReportsSerialization_withRequiredParameters()
            throws Exception {
        EmailQueryStringDeliveryReports emailQueryStringDeliveryReports =
                getEmailQueryStringDeliveryReportsWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailQueryStringDeliveryReports);
    }

    @Test
    void testEmailQueryStringDeliveryReportsSerialization_withAllParameters() throws Exception {
        EmailQueryStringDeliveryReports emailQueryStringDeliveryReports =
                getEmailQueryStringDeliveryReportsWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailQueryStringDeliveryReports);
    }

    @Test
    void validateEmailQueryStringDeliveryReports_withRequiredParameters() {
        Set<ConstraintViolation<EmailQueryStringDeliveryReports>> constraintViolations =
                getValidator().validate(getEmailQueryStringDeliveryReportsWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateEmailQueryStringDeliveryReports_withAllParameters() {
        Set<ConstraintViolation<EmailQueryStringDeliveryReports>> constraintViolations =
                getValidator().validate(getEmailQueryStringDeliveryReportsWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static EmailQueryStringDeliveryReports
            getEmailQueryStringDeliveryReportsWithRequiredParameters() {
        return new EmailQueryStringDeliveryReports();
    }

    public static EmailQueryStringDeliveryReports
            getEmailQueryStringDeliveryReportsWithAllParameters() {
        return new EmailQueryStringDeliveryReports().bulkId("bulkId")
                .messageId("messageId")
                .limit(2);
    }
}
