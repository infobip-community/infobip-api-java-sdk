
package io.github.infobip_community.client.channels.webrtc.model.token;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
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
}
