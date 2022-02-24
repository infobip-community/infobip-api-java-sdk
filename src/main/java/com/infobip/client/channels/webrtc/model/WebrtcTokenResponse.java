
package com.infobip.client.channels.webrtc.model;

/**
 * <p>
 * WebrtcTokenResponse.
 * </p>
 */
public class WebrtcTokenResponse {
    private String token;
    private String expirationTime;

    public WebrtcTokenResponse() {}

    public void setToken(String token) {
        this.token = token;
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
        if (!(obj instanceof WebrtcTokenResponse)) {
            return false;
        }
        WebrtcTokenResponse other = (WebrtcTokenResponse) obj;
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
        return "WebrtcTokenResponse [token=" + token + ", expirationTime=" + expirationTime + "]";
    }
}
