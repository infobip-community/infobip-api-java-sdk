
package io.github.infobip_community.client.channels.sms.model.tfa.pin;

public final class TfaQueryStringSendPinCode {
    private boolean ncNeeded = true;

    public TfaQueryStringSendPinCode() {}

    /**
     * Indicates if Number Lookup is needed before sending the 2FA message. If the
     * parameter value is true, Number Lookup will be requested before sending the
     * SMS. If the value is false, the SMS will be sent without requesting Number
     * Lookup. Field's default value is true.
     */
    public TfaQueryStringSendPinCode ncNeeded(boolean ncNeeded) {
        this.ncNeeded = ncNeeded;
        return this;
    }

    public boolean isNcNeeded() {
        return ncNeeded;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (ncNeeded ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TfaQueryStringSendPinCode)) {
            return false;
        }
        TfaQueryStringSendPinCode other = (TfaQueryStringSendPinCode) obj;
        if (ncNeeded != other.ncNeeded) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TfaQueryStringSendPinCode [ncNeeded=" + ncNeeded + "]";
    }
}
