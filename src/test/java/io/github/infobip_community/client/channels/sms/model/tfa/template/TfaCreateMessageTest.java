
package io.github.infobip_community.client.channels.sms.model.tfa.template;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.channels.sms.model.common.IndiaDlt;
import io.github.infobip_community.client.channels.sms.model.common.Regional;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class TfaCreateMessageTest {
    @Test
    void testTfaCreateMessageSerialization_withRequiredParameters() throws Exception {
        TfaCreateMessage tfaCreateMessage = getTfaCreateMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaCreateMessage);
    }

    @Test
    void testTfaCreateMessageSerialization_withAllParameters() throws Exception {
        TfaCreateMessage tfaCreateMessage = getTfaCreateMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaCreateMessage);
    }

    @Test
    void validateTfaCreateMessage_withRequiredParameters() {
        Set<ConstraintViolation<TfaCreateMessage>> constraintViolations =
                getValidator().validate(getTfaCreateMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateTfaCreateMessage_withAllParameters() {
        Set<ConstraintViolation<TfaCreateMessage>> constraintViolations =
                getValidator().validate(getTfaCreateMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static TfaCreateMessage getTfaCreateMessageWithRequiredParameters() {
        return new TfaCreateMessage("Your pin is {{pin}}", PinType.ALPHANUMERIC);
    }

    public static TfaCreateMessage getTfaCreateMessageWithAllParameters() {
        return new TfaCreateMessage("Your pin is {{pin}}", PinType.ALPHANUMERIC)
                .language(Language.CA)
                .pinLength(4)
                .regional(new Regional().indiaDlt(new IndiaDlt("").contentTemplateId("ID")))
                .repeatDtmf("1#")
                .senderId("Infobip 2FA")
                .speechRate(1.0);
    }
}
