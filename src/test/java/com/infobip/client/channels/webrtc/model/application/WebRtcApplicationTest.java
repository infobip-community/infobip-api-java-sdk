
package com.infobip.client.channels.webrtc.model.application;

import com.infobip.client.common.Serde;
import org.junit.jupiter.api.Test;

public class WebRtcApplicationTest {
    @Test
    void testWebRtcApplicationSerialization_withRequiredParameters() throws Exception {
        WebRtcApplication webRtcApplication = getWebRtcApplicationWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(webRtcApplication);
        System.out.println(webRtcApplication);
        System.out.println(json + "\n");
    }

    @Test
    void testWebRtcApplicationSerialization_withAllParameters() throws Exception {
        WebRtcApplication webRtcApplication = getWebRtcApplicationWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(webRtcApplication);
        System.out.println(webRtcApplication);
        System.out.println(json + "\n");
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
