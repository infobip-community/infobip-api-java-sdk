
package io.github.infobip_community.client.channels.webrtc.api;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.infobip_community.client.channels.webrtc.model.application.WebRtcApplicationTest;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WebRtcApplicationsApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static WebRtcApplicationsApi api = new WebRtcApplicationsApi(apiClient);

    @Test
    void testGetWebRtcApplications() {
        assertDoesNotThrow(() -> api.getWebRtcApplications());
    }

    @Test
    void testSaveWebRtcApplication() {
        assertThrows(ApiException.class, () -> api.saveWebRtcApplication(
                WebRtcApplicationTest.getWebRtcApplicationWithAllParameters()));
    }

    @Test
    void testUpdateWebRtcApplication() {
        assertThrows(ApiException.class, () -> api.updateWebRtcApplication("11",
                WebRtcApplicationTest.getWebRtcApplicationWithAllParameters()));
    }
}
