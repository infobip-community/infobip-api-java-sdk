
package io.github.infobip_community.client.channels.sms.model.tfa.pin;

import jakarta.validation.constraints.NotBlank;

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

    public String getPin() {
        return pin;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pin == null) ? 0 : pin.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TfaVerifyPhoneNumber)) {
            return false;
        }
        TfaVerifyPhoneNumber other = (TfaVerifyPhoneNumber) obj;
        if (pin == null) {
            if (other.pin != null) {
                return false;
            }
        } else if (!pin.equals(other.pin)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TfaVerifyPhoneNumber [pin=" + pin + "]";
    }
}
