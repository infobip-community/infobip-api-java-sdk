
package io.github.infobip_community.client.channels.whatsapp.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ReceiveWhatsAppMessageApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static ReceiveWhatsAppMessageApi api = new ReceiveWhatsAppMessageApi(apiClient);

    @Test
    void testDownloadWhatsAppInboundMedia() {
        assertThrows(ApiException.class, () -> api.downloadWhatsAppInboundMedia("", ""));
    }

    @Test
    void testGetWhatsAppMediaMetadata() {
        assertThrows(ApiException.class, () -> api.getWhatsAppMediaMetadata("", ""));
    }

    @Test
    void testMarkWhatsAppMessageAsRead() {
        assertThrows(ApiException.class, () -> api.markWhatsAppMessageAsRead("", ""));
    }
}
