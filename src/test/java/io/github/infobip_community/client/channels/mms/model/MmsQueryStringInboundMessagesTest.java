
package io.github.infobip_community.client.channels.mms.model;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class MmsQueryStringInboundMessagesTest {
    @Test
    void testMmsQueryStringInboundMessagesSerialization_withRequiredParameters() throws Exception {
        MmsQueryStringInboundMessages mmsQueryStringInboundMessages =
                getMmsQueryStringInboundMessagesWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(mmsQueryStringInboundMessages);
    }

    @Test
    void testMmsQueryStringInboundMessagesSerialization_withAllParameters() throws Exception {
        MmsQueryStringInboundMessages mmsQueryStringInboundMessages =
                getMmsQueryStringInboundMessagesWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(mmsQueryStringInboundMessages);
    }

    @Test
    void validateMmsQueryStringInboundMessages_withRequiredParameters() {
        Set<ConstraintViolation<MmsQueryStringInboundMessages>> constraintViolations =
                getValidator().validate(getMmsQueryStringInboundMessagesWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateMmsQueryStringInboundMessages_withAllParameters() {
        Set<ConstraintViolation<MmsQueryStringInboundMessages>> constraintViolations =
                getValidator().validate(getMmsQueryStringInboundMessagesWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static MmsQueryStringInboundMessages
            getMmsQueryStringInboundMessagesWithRequiredParameters() {
        return new MmsQueryStringInboundMessages();
    }

    public static MmsQueryStringInboundMessages
            getMmsQueryStringInboundMessagesWithAllParameters() {
        return new MmsQueryStringInboundMessages().limit(2);
    }
}
