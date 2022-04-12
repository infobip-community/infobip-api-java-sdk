
package io.github.infobip_community.client.channels.sms.api;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import io.github.infobip_community.client.channels.sms.model.message.inbound.SmsQueryStringInboundMessagesTest;
import io.github.infobip_community.client.common.ApiClient;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ReceiveSmsApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static ReceiveSmsApi api = new ReceiveSmsApi(apiClient);

    @Test
    void testGetInboundSmsMessages() {
        assertDoesNotThrow(() -> api.getInboundSmsMessages(SmsQueryStringInboundMessagesTest
                .getSmsQueryStringInboundMessagesWithAllParameters()));
    }
}
