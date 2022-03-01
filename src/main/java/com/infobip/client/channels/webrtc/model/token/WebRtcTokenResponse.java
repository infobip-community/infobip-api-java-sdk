
package com.infobip.client.channels.webrtc.model.token;

/**
 * <p>
 * WebRtcTokenResponse.
 * </p>
 */
public class WebRtcTokenResponse {
    private String token;
    private String expirationTime;

    public WebRtcTokenResponse() {}

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((expirationTime == null) ? 0 : expirationTime.hashCode());
        result = prime * result + ((token == null) ? 0 : token.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebRtcTokenResponse)) {
            return false;
        }
        WebRtcTokenResponse other = (WebRtcTokenResponse) obj;
        if (expirationTime == null) {
            if (other.expirationTime != null) {
                return false;
            }
        } else if (!expirationTime.equals(other.expirationTime)) {
            return false;
        }
        if (token == null) {
            if (other.token != null) {
                return false;
            }
        } else if (!token.equals(other.token)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WebRtcTokenResponse [token=" + token + ", expirationTime=" + expirationTime + "]";
    }
}
