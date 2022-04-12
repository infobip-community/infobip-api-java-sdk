
package io.github.infobip_community.client.channels.sms.model.tfa.application.response;

public final class VerificationResponse {
    private String msisdn;
    private Long sentAt;
    private Boolean verified;
    private Long verifiedAt;

    public VerificationResponse() {}

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public Long getSentAt() {
        return sentAt;
    }

    public void setSentAt(Long sentAt) {
        this.sentAt = sentAt;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Long getVerifiedAt() {
        return verifiedAt;
    }

    public void setVerifiedAt(Long verifiedAt) {
        this.verifiedAt = verifiedAt;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((msisdn == null) ? 0 : msisdn.hashCode());
        result = prime * result + ((sentAt == null) ? 0 : sentAt.hashCode());
        result = prime * result + ((verified == null) ? 0 : verified.hashCode());
        result = prime * result + ((verifiedAt == null) ? 0 : verifiedAt.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationResponse)) {
            return false;
        }
        VerificationResponse other = (VerificationResponse) obj;
        if (msisdn == null) {
            if (other.msisdn != null) {
                return false;
            }
        } else if (!msisdn.equals(other.msisdn)) {
            return false;
        }
        if (sentAt == null) {
            if (other.sentAt != null) {
                return false;
            }
        } else if (!sentAt.equals(other.sentAt)) {
            return false;
        }
        if (verified == null) {
            if (other.verified != null) {
                return false;
            }
        } else if (!verified.equals(other.verified)) {
            return false;
        }
        if (verifiedAt == null) {
            if (other.verifiedAt != null) {
                return false;
            }
        } else if (!verifiedAt.equals(other.verifiedAt)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VerificationResponse [msisdn=" + msisdn + ", sentAt=" + sentAt + ", verified="
                + verified + ", verifiedAt=" + verifiedAt + "]";
    }
}
