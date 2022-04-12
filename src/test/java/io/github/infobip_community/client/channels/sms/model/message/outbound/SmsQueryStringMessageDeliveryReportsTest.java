
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class SmsQueryStringMessageDeliveryReportsTest {
    @Test
    void testSmsQueryStringMessageDeliveryReportsSerialization_withRequiredParameters()
            throws Exception {
        SmsQueryStringMessageDeliveryReports smsQueryStringMessageDeliveryReports =
                getSmsQueryStringMessageDeliveryReportsWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsQueryStringMessageDeliveryReports);
    }

    @Test
    void testSmsQueryStringMessageDeliveryReportsSerialization_withAllParameters()
            throws Exception {
        SmsQueryStringMessageDeliveryReports smsQueryStringMessageDeliveryReports =
                getSmsQueryStringMessageDeliveryReportsWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsQueryStringMessageDeliveryReports);
    }

    @Test
    void validateSmsQueryStringMessageDeliveryReports_withRequiredParameters() {
        Set<ConstraintViolation<SmsQueryStringMessageDeliveryReports>> constraintViolations =
                getValidator()
                        .validate(getSmsQueryStringMessageDeliveryReportsWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateSmsQueryStringMessageDeliveryReports_withAllParameters() {
        Set<ConstraintViolation<SmsQueryStringMessageDeliveryReports>> constraintViolations =
                getValidator().validate(getSmsQueryStringMessageDeliveryReportsWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static SmsQueryStringMessageDeliveryReports
            getSmsQueryStringMessageDeliveryReportsWithRequiredParameters() {
        return new SmsQueryStringMessageDeliveryReports();
    }

    public static SmsQueryStringMessageDeliveryReports
            getSmsQueryStringMessageDeliveryReportsWithAllParameters() {
        return new SmsQueryStringMessageDeliveryReports().bulkId("ID")
                .messageId("MESSAGE-ID-123-xyz")
                .limit(2);
    }
}
