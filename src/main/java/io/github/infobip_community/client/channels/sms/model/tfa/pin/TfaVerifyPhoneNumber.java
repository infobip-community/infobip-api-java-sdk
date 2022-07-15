
package io.github.infobip_community.client.channels.sms.model.tfa.pin;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class TfaVerifyPhoneNumber {
    @NotBlank
    private final String pin;

    /**
     * <p>
     * TfaVerifyPhoneNumber.
     * </p>
     *
     * @param pin The PIN code to verify.
     */
    public TfaVerifyPhoneNumber(String pin) {
        this.pin = pin;
    }
}
