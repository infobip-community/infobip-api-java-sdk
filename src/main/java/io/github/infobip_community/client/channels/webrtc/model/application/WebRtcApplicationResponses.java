
package io.github.infobip_community.client.channels.webrtc.model.application;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public final class WebRtcApplicationResponses {
    private List<WebRtcApplicationResponse> responses = new ArrayList<>();
}
