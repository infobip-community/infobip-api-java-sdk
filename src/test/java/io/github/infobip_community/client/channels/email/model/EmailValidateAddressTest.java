
package io.github.infobip_community.client.channels.email.model;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class EmailValidateAddressTest {
    @Test
    void testEmailValidateAddressSerialization_withRequiredParameters() throws Exception {
        EmailValidateAddress emailValidateAddress = getEmailValidateAddressWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailValidateAddress);
    }

    @Test
    void testEmailValidateAddressSerialization_withAllParameters() throws Exception {
        EmailValidateAddress emailValidateAddress = getEmailValidateAddressWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailValidateAddress);
    }

    @Test
    void validateEmailValidateAddress_withRequiredParameters() {
        Set<ConstraintViolation<EmailValidateAddress>> constraintViolations =
                getValidator().validate(getEmailValidateAddressWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateEmailValidateAddress_withAllParameters() {
        Set<ConstraintViolation<EmailValidateAddress>> constraintViolations =
                getValidator().validate(getEmailValidateAddressWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static EmailValidateAddress getEmailValidateAddressWithRequiredParameters() {
        return new EmailValidateAddress("to@example.com");
    }

    public static EmailValidateAddress getEmailValidateAddressWithAllParameters() {
        return new EmailValidateAddress("");
    }
}
