
package io.github.infobip_community.client.channels.sms.model.tfa.pin;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class TfaQueryStringSendPinCodeTest {
    @Test
    void testTfaQueryStringSendPinCodeSerialization_withRequiredParameters() throws Exception {
        TfaQueryStringSendPinCode tfaQueryStringSendPinCode =
                getTfaQueryStringSendPinCodeWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaQueryStringSendPinCode);
    }

    @Test
    void testTfaQueryStringSendPinCodeSerialization_withAllParameters() throws Exception {
        TfaQueryStringSendPinCode tfaQueryStringSendPinCode =
                getTfaQueryStringSendPinCodeWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaQueryStringSendPinCode);
    }

    @Test
    void validateTfaQueryStringSendPinCode_withRequiredParameters() {
        Set<ConstraintViolation<TfaQueryStringSendPinCode>> constraintViolations =
                getValidator().validate(getTfaQueryStringSendPinCodeWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateTfaQueryStringSendPinCode_withAllParameters() {
        Set<ConstraintViolation<TfaQueryStringSendPinCode>> constraintViolations =
                getValidator().validate(getTfaQueryStringSendPinCodeWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static TfaQueryStringSendPinCode getTfaQueryStringSendPinCodeWithRequiredParameters() {
        return new TfaQueryStringSendPinCode();
    }

    public static TfaQueryStringSendPinCode getTfaQueryStringSendPinCodeWithAllParameters() {
        return new TfaQueryStringSendPinCode().ncNeeded(false);
    }
}
