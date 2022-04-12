
package io.github.infobip_community.client.channels.sms.model.message.scheduled;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class SmsQueryStringScheduledMessagesTest {
    @Test
    void testSmsQueryStringScheduledMessagesSerialization_withRequiredParameters()
            throws Exception {
        SmsQueryStringScheduledMessages smsQueryStringScheduledMessages =
                getSmsQueryStringScheduledMessagesWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsQueryStringScheduledMessages);
    }

    @Test
    void testSmsQueryStringScheduledMessagesSerialization_withAllParameters() throws Exception {
        SmsQueryStringScheduledMessages smsQueryStringScheduledMessages =
                getSmsQueryStringScheduledMessagesWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsQueryStringScheduledMessages);
    }

    @Test
    void validateSmsQueryStringScheduledMessages_withRequiredParameters() {
        Set<ConstraintViolation<SmsQueryStringScheduledMessages>> constraintViolations =
                getValidator().validate(getSmsQueryStringScheduledMessagesWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateSmsQueryStringScheduledMessages_withAllParameters() {
        Set<ConstraintViolation<SmsQueryStringScheduledMessages>> constraintViolations =
                getValidator().validate(getSmsQueryStringScheduledMessagesWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static SmsQueryStringScheduledMessages
            getSmsQueryStringScheduledMessagesWithRequiredParameters() {
        return new SmsQueryStringScheduledMessages("BULK-ID-123-xyz");
    }

    public static SmsQueryStringScheduledMessages
            getSmsQueryStringScheduledMessagesWithAllParameters() {
        return new SmsQueryStringScheduledMessages("");
    }
}
