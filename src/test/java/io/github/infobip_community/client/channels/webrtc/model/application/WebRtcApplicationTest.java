
package io.github.infobip_community.client.channels.webrtc.model.application;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WebRtcApplicationTest {
    @Test
    void testWebRtcApplicationSerialization_withRequiredParameters() throws Exception {
        WebRtcApplication webRtcApplication = getWebRtcApplicationWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(webRtcApplication);
    }

    @Test
    void testWebRtcApplicationSerialization_withAllParameters() throws Exception {
        WebRtcApplication webRtcApplication = getWebRtcApplicationWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(webRtcApplication);
    }

    @Test
    void validateWebRtcApplication_withRequiredParameters() {
        Set<ConstraintViolation<WebRtcApplication>> constraintViolations =
                getValidator().validate(getWebRtcApplicationWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWebRtcApplication_withAllParameters() {
        Set<ConstraintViolation<WebRtcApplication>> constraintViolations =
                getValidator().validate(getWebRtcApplicationWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static WebRtcApplication getWebRtcApplicationWithRequiredParameters() {
        return new WebRtcApplication("Application Name");
    }

    public static WebRtcApplication getWebRtcApplicationWithAllParameters() {
        return new WebRtcApplication("").description("Application Description")
                .ios(new Ios("IOS_APNS_certificate.p", "APNS certificate content")
                        .apnsCertificatePassword("secret"))
                .android(new Android("AAAAtm7JlCY:APA91bEe02qZQbfcTtmnPO..."))
                .appToApp(true)
                .appToConversations(true)
                .appToPhone(true);
    }
}
