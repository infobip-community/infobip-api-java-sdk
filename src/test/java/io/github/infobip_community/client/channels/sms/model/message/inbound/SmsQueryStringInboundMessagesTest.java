
package io.github.infobip_community.client.channels.sms.model.message.inbound;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class SmsQueryStringInboundMessagesTest {
    @Test
    void testSmsQueryStringInboundMessagesSerialization_withRequiredParameters() throws Exception {
        SmsQueryStringInboundMessages smsQueryStringInboundMessages =
                getSmsQueryStringInboundMessagesWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsQueryStringInboundMessages);
    }

    @Test
    void testSmsQueryStringInboundMessagesSerialization_withAllParameters() throws Exception {
        SmsQueryStringInboundMessages smsQueryStringInboundMessages =
                getSmsQueryStringInboundMessagesWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsQueryStringInboundMessages);
    }

    @Test
    void validateSmsQueryStringInboundMessages_withRequiredParameters() {
        Set<ConstraintViolation<SmsQueryStringInboundMessages>> constraintViolations =
                getValidator().validate(getSmsQueryStringInboundMessagesWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateSmsQueryStringInboundMessages_withAllParameters() {
        Set<ConstraintViolation<SmsQueryStringInboundMessages>> constraintViolations =
                getValidator().validate(getSmsQueryStringInboundMessagesWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static SmsQueryStringInboundMessages
            getSmsQueryStringInboundMessagesWithRequiredParameters() {
        return new SmsQueryStringInboundMessages();
    }

    public static SmsQueryStringInboundMessages
            getSmsQueryStringInboundMessagesWithAllParameters() {
        return new SmsQueryStringInboundMessages().limit(2);
    }
}
