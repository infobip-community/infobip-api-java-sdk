
package io.github.infobip_community.client.channels.rcs.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.infobip_community.client.channels.rcs.model.RcsBulkMessageTest;
import io.github.infobip_community.client.channels.rcs.model.RcsMessageTest;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SendRcsApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static SendRcsApi api = new SendRcsApi(apiClient);

    @Test
    void testSendRcsMessage() {
        assertThrows(ApiException.class,
                () -> api.sendRcsMessage(RcsMessageTest.getRcsMessageWithAllParameters()));
    }

    @Test
    void testSendRcsBulkMessage() {
        assertThrows(ApiException.class, () -> api
                .sendRcsBulkMessage(RcsBulkMessageTest.getRcsBulkMessageWithAllParameters()));
    }
}
