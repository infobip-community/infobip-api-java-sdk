
package io.github.infobip_community.client.channels.webrtc.model.token;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class Capabilities {
    private final Recording recording;

    /**
     * <p>
     * Capabilities.
     * </p>
     *
     * @param recording Whether to allow recording calls during the session.
     *     Possible values are ALWAYS, ON_DEMAND and DISABLED. If want to set ALWAYS
     *     or ON_DEMAND, the capability must be enabled on account level (please
     *     contact your account manager for this).
     */
    public Capabilities(Recording recording) {
        this.recording = recording;
    }
}
