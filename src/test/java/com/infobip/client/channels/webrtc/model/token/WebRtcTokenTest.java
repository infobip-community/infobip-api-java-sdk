
package com.infobip.client.channels.webrtc.model.token;

import com.infobip.client.common.Serde;
import org.junit.jupiter.api.Test;

public class WebRtcTokenTest {
    @Test
    void testWebrtcTokenSerialization_withRequiredParameters() throws Exception {
        WebRtcToken webRtcToken = getWebrtcTokenWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(webRtcToken);
        System.out.println(webRtcToken);
        System.out.println(json + "\n");
    }

    @Test
    void testWebrtcTokenSerialization_withAllParameters() throws Exception {
        WebRtcToken webRtcToken = getWebrtcTokenWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(webRtcToken);
        System.out.println(webRtcToken);
        System.out.println(json + "\n");
    }

    public static WebRtcToken getWebrtcTokenWithRequiredParameters() {
        return new WebRtcToken("Alice");
    }

    public static WebRtcToken getWebrtcTokenWithAllParameters() {
        return new WebRtcToken("Alice").applicationId("2277594c-76ea-4b8e-a299-e2b6db41b9dc")
                .displayName("Alice in Wonderland")
                .capabilities(new Capabilities(Recording.ALWAYS))
                .timeToLive(43200L);
    }
}
