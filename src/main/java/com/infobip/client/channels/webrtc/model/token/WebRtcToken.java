
package com.infobip.client.channels.webrtc.model.token;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public final class WebRtcToken {
    @NotBlank
    @Size(min = 3, max = 64)
    private final String identity;
    private String applicationId;
    @Size(min = 5, max = 50)
    private String displayName;
    private Capabilities capabilities;
    private Long timeToLive;

    /**
     * <p>
     * WebRtcToken.
     * </p>
     *
     * @param identity The identity used to present user on Infobip WebRTC platform.
     *     Must be unique. Must contain at least 3 and at most 64 unicode characters
     *     including -, _, ..
     */
    public WebRtcToken(String identity) {
        this.identity = identity;
    }

    /**
     * Application ID to be used for calls. Web and In-App application represents
     * one-stop place for all your configuration, including push notifications,
     * dynamic destination resolving and all other Web and In-App Calls features.
     */
    public WebRtcToken applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * A human-readable name for a given identity. Does not have to be unique. If
     * set, it will be presented to all other users communicating with the
     * identified user, along with identity. Must contain at least 5 and at most 50
     * characters.
     */
    public WebRtcToken displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * The object containing permission for certain actions during the session.
     */
    public WebRtcToken capabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * This field represents a number of seconds until the token expires. If not
     * set, the token will last 8 hours. The maximum value is 24 hours.
     */
    public WebRtcToken timeToLive(Long timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    public String getIdentity() {
        return identity;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Capabilities getCapabilities() {
        return capabilities;
    }

    public Long getTimeToLive() {
        return timeToLive;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((applicationId == null) ? 0 : applicationId.hashCode());
        result = prime * result + ((capabilities == null) ? 0 : capabilities.hashCode());
        result = prime * result + ((displayName == null) ? 0 : displayName.hashCode());
        result = prime * result + ((identity == null) ? 0 : identity.hashCode());
        result = prime * result + ((timeToLive == null) ? 0 : timeToLive.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebRtcToken)) {
            return false;
        }
        WebRtcToken other = (WebRtcToken) obj;
        if (applicationId == null) {
            if (other.applicationId != null) {
                return false;
            }
        } else if (!applicationId.equals(other.applicationId)) {
            return false;
        }
        if (capabilities == null) {
            if (other.capabilities != null) {
                return false;
            }
        } else if (!capabilities.equals(other.capabilities)) {
            return false;
        }
        if (displayName == null) {
            if (other.displayName != null) {
                return false;
            }
        } else if (!displayName.equals(other.displayName)) {
            return false;
        }
        if (identity == null) {
            if (other.identity != null) {
                return false;
            }
        } else if (!identity.equals(other.identity)) {
            return false;
        }
        if (timeToLive == null) {
            if (other.timeToLive != null) {
                return false;
            }
        } else if (!timeToLive.equals(other.timeToLive)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WebRtcToken [identity=" + identity + ", applicationId=" + applicationId
                + ", displayName=" + displayName + ", capabilities=" + capabilities
                + ", timeToLive=" + timeToLive + "]";
    }
}
