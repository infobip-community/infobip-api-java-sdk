
package io.github.infobip_community.client.channels.sms.model.tfa.pin.response;

public final class TfaStartAuthenticationResponse {
    private String callStatus;
    private String ncStatus;
    private String pinId;
    private String smsStatus;
    private String to;

    public TfaStartAuthenticationResponse() {}

    public String getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(String callStatus) {
        this.callStatus = callStatus;
    }

    public String getNcStatus() {
        return ncStatus;
    }

    public void setNcStatus(String ncStatus) {
        this.ncStatus = ncStatus;
    }

    public String getPinId() {
        return pinId;
    }

    public void setPinId(String pinId) {
        this.pinId = pinId;
    }

    public String getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(String smsStatus) {
        this.smsStatus = smsStatus;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((callStatus == null) ? 0 : callStatus.hashCode());
        result = prime * result + ((ncStatus == null) ? 0 : ncStatus.hashCode());
        result = prime * result + ((pinId == null) ? 0 : pinId.hashCode());
        result = prime * result + ((smsStatus == null) ? 0 : smsStatus.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TfaStartAuthenticationResponse)) {
            return false;
        }
        TfaStartAuthenticationResponse other = (TfaStartAuthenticationResponse) obj;
        if (callStatus == null) {
            if (other.callStatus != null) {
                return false;
            }
        } else if (!callStatus.equals(other.callStatus)) {
            return false;
        }
        if (ncStatus == null) {
            if (other.ncStatus != null) {
                return false;
            }
        } else if (!ncStatus.equals(other.ncStatus)) {
            return false;
        }
        if (pinId == null) {
            if (other.pinId != null) {
                return false;
            }
        } else if (!pinId.equals(other.pinId)) {
            return false;
        }
        if (smsStatus == null) {
            if (other.smsStatus != null) {
                return false;
            }
        } else if (!smsStatus.equals(other.smsStatus)) {
            return false;
        }
        if (to == null) {
            if (other.to != null) {
                return false;
            }
        } else if (!to.equals(other.to)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TfaStartAuthenticationResponse [callStatus=" + callStatus + ", ncStatus=" + ncStatus
                + ", pinId=" + pinId + ", smsStatus=" + smsStatus + ", to=" + to + "]";
    }
}
