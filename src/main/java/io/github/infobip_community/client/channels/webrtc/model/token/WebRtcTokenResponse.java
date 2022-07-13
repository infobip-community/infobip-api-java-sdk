
package io.github.infobip_community.client.channels.webrtc.model.token;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * WebRtcTokenResponse.
 * </p>
 */
@NoArgsConstructor
@Data
public final class WebRtcTokenResponse {
    private String token;
    private String expirationTime;
}
