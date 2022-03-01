
package com.infobip.client.channels.webrtc.model.token;

import static org.junit.Assert.assertEquals;
import com.infobip.client.common.ModelValidator;
import com.infobip.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class WebRtcTokenTest {
    @Test
    void testWebRtcTokenSerialization_withRequiredParameters() throws Exception {
        WebRtcToken webRtcToken = getWebRtcTokenWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(webRtcToken);
        // System.out.println(webRtcToken);
        // System.out.println(json + "\n");
    }

    @Test
    void testWebRtcTokenSerialization_withAllParameters() throws Exception {
        WebRtcToken webRtcToken = getWebRtcTokenWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(webRtcToken);
        // System.out.println(webRtcToken);
        // System.out.println(json + "\n");
    }

    @Test
    void validateWebRtcToken_withRequiredParameters() {
        Set<ConstraintViolation<WebRtcToken>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWebRtcTokenWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWebRtcToken_withAllParameters() {
        Set<ConstraintViolation<WebRtcToken>> constraintViolations =
                ModelValidator.INSTANCE.getValidator().validate(getWebRtcTokenWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static WebRtcToken getWebRtcTokenWithRequiredParameters() {
        return new WebRtcToken("Alice");
    }

    public static WebRtcToken getWebRtcTokenWithAllParameters() {
        return new WebRtcToken("Alice").applicationId("2277594c-76ea-4b8e-a299-e2b6db41b9dc")
                .displayName("Alice in Wonderland")
                .capabilities(new Capabilities(Recording.ALWAYS))
                .timeToLive(43200L);
    }
}
