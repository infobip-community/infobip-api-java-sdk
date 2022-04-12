
package io.github.infobip_community.client.channels.sms.model.tfa.pin;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class TfaVerifyPhoneNumberTest {
    @Test
    void testTfaVerifyPhoneNumberSerialization_withRequiredParameters() throws Exception {
        TfaVerifyPhoneNumber tfaVerifyPhoneNumber = getTfaVerifyPhoneNumberWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaVerifyPhoneNumber);
    }

    @Test
    void testTfaVerifyPhoneNumberSerialization_withAllParameters() throws Exception {
        TfaVerifyPhoneNumber tfaVerifyPhoneNumber = getTfaVerifyPhoneNumberWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaVerifyPhoneNumber);
    }

    @Test
    void validateTfaVerifyPhoneNumber_withRequiredParameters() {
        Set<ConstraintViolation<TfaVerifyPhoneNumber>> constraintViolations =
                getValidator().validate(getTfaVerifyPhoneNumberWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateTfaVerifyPhoneNumber_withAllParameters() {
        Set<ConstraintViolation<TfaVerifyPhoneNumber>> constraintViolations =
                getValidator().validate(getTfaVerifyPhoneNumberWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static TfaVerifyPhoneNumber getTfaVerifyPhoneNumberWithRequiredParameters() {
        return new TfaVerifyPhoneNumber("1598");
    }

    public static TfaVerifyPhoneNumber getTfaVerifyPhoneNumberWithAllParameters() {
        return new TfaVerifyPhoneNumber("");
    }
}
