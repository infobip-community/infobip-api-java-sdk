
package io.github.infobip_community.client.channels.sms.model.tfa.application;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class TfaApplicationTest {
    @Test
    void testTfaApplicationSerialization_withRequiredParameters() throws Exception {
        TfaApplication tfaApplication = getTfaApplicationWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaApplication);
    }

    @Test
    void testTfaApplicationSerialization_withAllParameters() throws Exception {
        TfaApplication tfaApplication = getTfaApplicationWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaApplication);
    }

    @Test
    void validateTfaApplication_withRequiredParameters() {
        Set<ConstraintViolation<TfaApplication>> constraintViolations =
                getValidator().validate(getTfaApplicationWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateTfaApplication_withAllParameters() {
        Set<ConstraintViolation<TfaApplication>> constraintViolations =
                getValidator().validate(getTfaApplicationWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static TfaApplication getTfaApplicationWithRequiredParameters() {
        return new TfaApplication("2fa application name");
    }

    public static TfaApplication getTfaApplicationWithAllParameters() {
        return new TfaApplication("")
                .configuration(new Configuration().allowMultiplePinVerifications(true)
                        .pinAttempts(10)
                        .pinTimeToLive("15m")
                        .sendPinPerApplicationLimit("10000/1d")
                        .sendPinPerPhoneNumberLimit("3/1d")
                        .verifyPinLimit("1/3s"))
                .enabled(true);
    }
}
