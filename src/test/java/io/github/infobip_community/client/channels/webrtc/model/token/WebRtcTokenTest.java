
package io.github.infobip_community.client.channels.webrtc.model.token;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WebRtcTokenTest {
    @Test
    void testWebRtcTokenSerialization_withRequiredParameters() throws Exception {
        WebRtcToken webRtcToken = getWebRtcTokenWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(webRtcToken);
    }

    @Test
    void testWebRtcTokenSerialization_withAllParameters() throws Exception {
        WebRtcToken webRtcToken = getWebRtcTokenWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(webRtcToken);
    }

    @Test
    void validateWebRtcToken_withRequiredParameters() {
        Set<ConstraintViolation<WebRtcToken>> constraintViolations =
                getValidator().validate(getWebRtcTokenWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWebRtcToken_withAllParameters() {
        Set<ConstraintViolation<WebRtcToken>> constraintViolations =
                getValidator().validate(getWebRtcTokenWithAllParameters());
        assertEquals(2, constraintViolations.size());
    }

    public static WebRtcToken getWebRtcTokenWithRequiredParameters() {
        return new WebRtcToken("Alice");
    }

    public static WebRtcToken getWebRtcTokenWithAllParameters() {
        return new WebRtcToken("").applicationId("2277594c-76ea-4b8e-a299-e2b6db41b9dc")
                .displayName("Alice in Wonderland")
                .capabilities(new Capabilities(Recording.ALWAYS))
                .timeToLive(43200L);
    }
}
