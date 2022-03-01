
package com.infobip.client.channels.webrtc.model.application;

import static org.junit.Assert.assertEquals;
import com.infobip.client.common.ModelValidator;
import com.infobip.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class WebRtcApplicationTest {
    @Test
    void testWebRtcApplicationSerialization_withRequiredParameters() throws Exception {
        WebRtcApplication webRtcApplication = getWebRtcApplicationWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(webRtcApplication);
        // System.out.println(webRtcApplication);
        // System.out.println(json + "\n");
    }

    @Test
    void testWebRtcApplicationSerialization_withAllParameters() throws Exception {
        WebRtcApplication webRtcApplication = getWebRtcApplicationWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(webRtcApplication);
        // System.out.println(webRtcApplication);
        // System.out.println(json + "\n");
    }

    @Test
    void validateWebRtcApplication_withRequiredParameters() {
        Set<ConstraintViolation<WebRtcApplication>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWebRtcApplicationWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWebRtcApplication_withAllParameters() {
        Set<ConstraintViolation<WebRtcApplication>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWebRtcApplicationWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static WebRtcApplication getWebRtcApplicationWithRequiredParameters() {
        return new WebRtcApplication("Application Name");
    }

    public static WebRtcApplication getWebRtcApplicationWithAllParameters() {
        return new WebRtcApplication("Application Name").description("Application Description")
                .ios(new Ios("IOS_APNS_certificate.p", "APNS certificate content")
                        .apnsCertificatePassword("secret"))
                .android(new Android("AAAAtm7JlCY:APA91bEe02qZQbfcTtmnPO..."))
                .appToApp(true)
                .appToConversations(true)
                .appToPhone(true);
    }
}
