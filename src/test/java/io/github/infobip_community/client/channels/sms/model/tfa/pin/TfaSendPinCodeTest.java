
package io.github.infobip_community.client.channels.sms.model.tfa.pin;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.HashMap;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class TfaSendPinCodeTest {
    @Test
    void testTfaSendPinCodeSerialization_withRequiredParameters() throws Exception {
        TfaSendPinCode tfaSendPinCode = getTfaSendPinCodeWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaSendPinCode);
    }

    @Test
    void testTfaSendPinCodeSerialization_withAllParameters() throws Exception {
        TfaSendPinCode tfaSendPinCode = getTfaSendPinCodeWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaSendPinCode);
    }

    @Test
    void validateTfaSendPinCode_withRequiredParameters() {
        Set<ConstraintViolation<TfaSendPinCode>> constraintViolations =
                getValidator().validate(getTfaSendPinCodeWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateTfaSendPinCode_withAllParameters() {
        Set<ConstraintViolation<TfaSendPinCode>> constraintViolations =
                getValidator().validate(getTfaSendPinCodeWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static TfaSendPinCode getTfaSendPinCodeWithRequiredParameters() {
        return new TfaSendPinCode("1234567", "7654321", "41793026727");
    }

    @SuppressWarnings("serial")
    public static TfaSendPinCode getTfaSendPinCodeWithAllParameters() {
        return new TfaSendPinCode("1234567", "7654321", "").from("Sender 1")
                .placeholders(new HashMap<String, String>() {
                    {
                        put("firstName", "John");
                        put("lastName", "Doe");
                    }
                });
    }
}
