
package io.github.infobip_community.client.channels.sms.model.tfa.application;

import jakarta.validation.constraints.NotBlank;

public final class TfaQueryStringVerificationStatus {
    @NotBlank
    private final String msisdn;
    private boolean verified;
    private boolean sent;

    /**
     * <p>
     * TfaQueryStringVerificationStatus.
     * </p>
     *
     * @param msisdn Filter by msisdn (phone number) for which verification status
     *     is checked.
     */
    public TfaQueryStringVerificationStatus(String msisdn) {
        this.msisdn = msisdn;
    }

    /**
     * Filter by verified (true or false).
     */
    public TfaQueryStringVerificationStatus verified(boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * Filter by message sent status (true or false).
     */
    public TfaQueryStringVerificationStatus sent(boolean sent) {
        this.sent = sent;
        return this;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public boolean isVerified() {
        return verified;
    }

    public boolean isSent() {
        return sent;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((msisdn == null) ? 0 : msisdn.hashCode());
        result = prime * result + (sent ? 1231 : 1237);
        result = prime * result + (verified ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TfaQueryStringVerificationStatus)) {
            return false;
        }
        TfaQueryStringVerificationStatus other = (TfaQueryStringVerificationStatus) obj;
        if (msisdn == null) {
            if (other.msisdn != null) {
                return false;
            }
        } else if (!msisdn.equals(other.msisdn)) {
            return false;
        }
        if (sent != other.sent) {
            return false;
        }
        if (verified != other.verified) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TfaQueryStringVerificationStatus [msisdn=" + msisdn + ", verified=" + verified
                + ", sent=" + sent + "]";
    }
}
