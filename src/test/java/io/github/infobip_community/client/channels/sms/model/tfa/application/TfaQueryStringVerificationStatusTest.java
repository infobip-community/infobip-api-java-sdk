
package io.github.infobip_community.client.channels.sms.model.tfa.application;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class TfaQueryStringVerificationStatusTest {
    @Test
    void testTfaQueryStringVerificationStatusSerialization_withRequiredParameters()
            throws Exception {
        TfaQueryStringVerificationStatus tfaQueryStringVerificationStatus =
                getTfaQueryStringVerificationStatusWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaQueryStringVerificationStatus);
    }

    @Test
    void testTfaQueryStringVerificationStatusSerialization_withAllParameters() throws Exception {
        TfaQueryStringVerificationStatus tfaQueryStringVerificationStatus =
                getTfaQueryStringVerificationStatusWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(tfaQueryStringVerificationStatus);
    }

    @Test
    void validateTfaQueryStringVerificationStatus_withRequiredParameters() {
        Set<ConstraintViolation<TfaQueryStringVerificationStatus>> constraintViolations =
                getValidator()
                        .validate(getTfaQueryStringVerificationStatusWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateTfaQueryStringVerificationStatus_withAllParameters() {
        Set<ConstraintViolation<TfaQueryStringVerificationStatus>> constraintViolations =
                getValidator().validate(getTfaQueryStringVerificationStatusWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static TfaQueryStringVerificationStatus
            getTfaQueryStringVerificationStatusWithRequiredParameters() {
        return new TfaQueryStringVerificationStatus("385717284759547");
    }

    public static TfaQueryStringVerificationStatus
            getTfaQueryStringVerificationStatusWithAllParameters() {
        return new TfaQueryStringVerificationStatus("").verified(true).sent(true);
    }
}
