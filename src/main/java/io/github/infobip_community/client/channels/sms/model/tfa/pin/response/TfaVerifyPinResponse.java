
package io.github.infobip_community.client.channels.sms.model.tfa.pin.response;

public final class TfaVerifyPinResponse {
    private Integer attemptsRemaining;
    private String msisdn;
    private String pinError;
    private String pinId;
    private Boolean verified;

    public TfaVerifyPinResponse() {}

    public Integer getAttemptsRemaining() {
        return attemptsRemaining;
    }

    public void setAttemptsRemaining(Integer attemptsRemaining) {
        this.attemptsRemaining = attemptsRemaining;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getPinError() {
        return pinError;
    }

    public void setPinError(String pinError) {
        this.pinError = pinError;
    }

    public String getPinId() {
        return pinId;
    }

    public void setPinId(String pinId) {
        this.pinId = pinId;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((attemptsRemaining == null) ? 0 : attemptsRemaining.hashCode());
        result = prime * result + ((msisdn == null) ? 0 : msisdn.hashCode());
        result = prime * result + ((pinError == null) ? 0 : pinError.hashCode());
        result = prime * result + ((pinId == null) ? 0 : pinId.hashCode());
        result = prime * result + ((verified == null) ? 0 : verified.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TfaVerifyPinResponse)) {
            return false;
        }
        TfaVerifyPinResponse other = (TfaVerifyPinResponse) obj;
        if (attemptsRemaining == null) {
            if (other.attemptsRemaining != null) {
                return false;
            }
        } else if (!attemptsRemaining.equals(other.attemptsRemaining)) {
            return false;
        }
        if (msisdn == null) {
            if (other.msisdn != null) {
                return false;
            }
        } else if (!msisdn.equals(other.msisdn)) {
            return false;
        }
        if (pinError == null) {
            if (other.pinError != null) {
                return false;
            }
        } else if (!pinError.equals(other.pinError)) {
            return false;
        }
        if (pinId == null) {
            if (other.pinId != null) {
                return false;
            }
        } else if (!pinId.equals(other.pinId)) {
            return false;
        }
        if (verified == null) {
            if (other.verified != null) {
                return false;
            }
        } else if (!verified.equals(other.verified)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TfaVerifyPinResponse [attemptsRemaining=" + attemptsRemaining + ", msisdn=" + msisdn
                + ", pinError=" + pinError + ", pinId=" + pinId + ", verified=" + verified + "]";
    }
}
