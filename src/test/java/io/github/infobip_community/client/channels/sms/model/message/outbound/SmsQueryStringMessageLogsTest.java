
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.time.OffsetDateTime;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class SmsQueryStringMessageLogsTest {
    @Test
    void testSmsQueryStringMessageLogsSerialization_withRequiredParameters() throws Exception {
        SmsQueryStringMessageLogs smsQueryStringMessageLogs =
                getSmsQueryStringMessageLogsWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsQueryStringMessageLogs);
    }

    @Test
    void testSmsQueryStringMessageLogsSerialization_withAllParameters() throws Exception {
        SmsQueryStringMessageLogs smsQueryStringMessageLogs =
                getSmsQueryStringMessageLogsWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsQueryStringMessageLogs);
    }

    @Test
    void validateSmsQueryStringMessageLogs_withRequiredParameters() {
        Set<ConstraintViolation<SmsQueryStringMessageLogs>> constraintViolations =
                getValidator().validate(getSmsQueryStringMessageLogsWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateSmsQueryStringMessageLogs_withAllParameters() {
        Set<ConstraintViolation<SmsQueryStringMessageLogs>> constraintViolations =
                getValidator().validate(getSmsQueryStringMessageLogsWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static SmsQueryStringMessageLogs getSmsQueryStringMessageLogsWithRequiredParameters() {
        return new SmsQueryStringMessageLogs();
    }

    public static SmsQueryStringMessageLogs getSmsQueryStringMessageLogsWithAllParameters() {
        return new SmsQueryStringMessageLogs().from("from")
                .to("to")
                .bulkId("BULK-ID-123-xyz")
                .messageId("ID")
                .generalStatus(GeneralStatus.ACCEPTED)
                .sentSince(OffsetDateTime.parse("2021-08-25T16:00:00.000+02:00"))
                .sentUntil(OffsetDateTime.parse("2021-08-26T16:00:00.000+02:00"))
                .limit(10)
                .mcc("219")
                .mnc("01");
    }
}
