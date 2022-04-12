
package io.github.infobip_community.client.channels.mms.api;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import io.github.infobip_community.client.channels.mms.model.MmsQueryStringInboundMessagesTest;
import io.github.infobip_community.client.common.ApiClient;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ReceiveMmsApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static ReceiveMmsApi api = new ReceiveMmsApi(apiClient);

    @Test
    void testGetInboundMmsMessages() {
        assertDoesNotThrow(() -> api.getInboundMmsMessages(MmsQueryStringInboundMessagesTest
                .getMmsQueryStringInboundMessagesWithAllParameters()));
    }
}
