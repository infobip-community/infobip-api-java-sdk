
package io.github.infobip_community.client.channels.sms.model.common;

import jakarta.validation.Valid;

public final class Regional {
    @Valid
    private IndiaDlt indiaDlt;

    /**
     * <p>
     * Regional.
     * </p>
     */
    public Regional() {}

    /**
     * Distributed Ledger Technology (DLT) specific parameters required for sending
     * SMS to phone numbers registered in India.
     */
    public Regional indiaDlt(IndiaDlt indiaDlt) {
        this.indiaDlt = indiaDlt;
        return this;
    }

    public IndiaDlt getIndiaDlt() {
        return indiaDlt;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((indiaDlt == null) ? 0 : indiaDlt.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Regional)) {
            return false;
        }
        Regional other = (Regional) obj;
        if (indiaDlt == null) {
            if (other.indiaDlt != null) {
                return false;
            }
        } else if (!indiaDlt.equals(other.indiaDlt)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Regional [indiaDlt=" + indiaDlt + "]";
    }
}
