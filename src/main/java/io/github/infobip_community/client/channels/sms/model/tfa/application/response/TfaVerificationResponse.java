
package io.github.infobip_community.client.channels.sms.model.tfa.application.response;

import java.util.ArrayList;
import java.util.List;

public final class TfaVerificationResponse {
    private List<VerificationResponse> verifications = new ArrayList<>();

    public TfaVerificationResponse() {}

    public List<VerificationResponse> getVerifications() {
        return verifications;
    }

    public void setVerifications(List<VerificationResponse> verifications) {
        this.verifications = verifications;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((verifications == null) ? 0 : verifications.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TfaVerificationResponse)) {
            return false;
        }
        TfaVerificationResponse other = (TfaVerificationResponse) obj;
        if (verifications == null) {
            if (other.verifications != null) {
                return false;
            }
        } else if (!verifications.equals(other.verifications)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TfaVerificationResponse [verifications=" + verifications + "]";
    }
}
