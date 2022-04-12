
package io.github.infobip_community.client.channels.sms.model.tfa.pin;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.HashMap;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class TfaResendPinCodeTest {
    @Test
    void testTfaResendPinCodeSerialization_withRequiredParameters() throws Exception {
        TfaResendPinCode tfaResendPinCode = getTfaResendPinCodeWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaResendPinCode);
    }

    @Test
    void testTfaResendPinCodeSerialization_withAllParameters() throws Exception {
        TfaResendPinCode tfaResendPinCode = getTfaResendPinCodeWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaResendPinCode);
    }

    @Test
    void validateTfaResendPinCode_withRequiredParameters() {
        Set<ConstraintViolation<TfaResendPinCode>> constraintViolations =
                getValidator().validate(getTfaResendPinCodeWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateTfaResendPinCode_withAllParameters() {
        Set<ConstraintViolation<TfaResendPinCode>> constraintViolations =
                getValidator().validate(getTfaResendPinCodeWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static TfaResendPinCode getTfaResendPinCodeWithRequiredParameters() {
        return new TfaResendPinCode();
    }

    @SuppressWarnings("serial")
    public static TfaResendPinCode getTfaResendPinCodeWithAllParameters() {
        return new TfaResendPinCode().placeholders(new HashMap<String, String>() {
            {
                put("firstName", "John");
                put("lastName", "Doe");
            }
        });
    }
}
