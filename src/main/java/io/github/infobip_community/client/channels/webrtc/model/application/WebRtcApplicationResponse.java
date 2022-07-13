
package io.github.infobip_community.client.channels.webrtc.model.application;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * WebRtcApplicationResponse.
 * </p>
 */
@NoArgsConstructor
@Data
public final class WebRtcApplicationResponse {
    private String id;
    private String name;
    private String description;
    private Ios ios;
    private Android android;
    private Boolean appToApp;
    private Boolean appToConversations;
    private Boolean appToPhone;
}
