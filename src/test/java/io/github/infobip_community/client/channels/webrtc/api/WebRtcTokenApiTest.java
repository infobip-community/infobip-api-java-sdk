
package io.github.infobip_community.client.channels.webrtc.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.infobip_community.client.channels.webrtc.model.token.WebRtcTokenTest;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WebRtcTokenApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static WebRtcTokenApi api = new WebRtcTokenApi(apiClient);

    @Test
    void testGenerateWebRtcToken() {
        assertThrows(ApiException.class,
                () -> api.generateWebRtcToken(WebRtcTokenTest.getWebRtcTokenWithAllParameters()));
    }
}
