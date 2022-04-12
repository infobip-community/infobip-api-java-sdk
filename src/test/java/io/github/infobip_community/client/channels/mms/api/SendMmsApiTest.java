
package io.github.infobip_community.client.channels.mms.api;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.infobip_community.client.channels.mms.model.MmsQueryStringDeliveryReportsTest;
import io.github.infobip_community.client.channels.mms.model.MmsSingleMessageTest;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SendMmsApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static SendMmsApi api = new SendMmsApi(apiClient);

    @Test
    void testSendMmsSingleMessage() {
        assertThrows(ApiException.class, () -> api
                .sendMmsSingleMessage(MmsSingleMessageTest.getMmsSingleMessageWithAllParameters()));
    }

    @Test
    void testGetOutboundMmsMessageDeliveryReports() {
        assertDoesNotThrow(
                () -> api.getOutboundMmsMessageDeliveryReports(MmsQueryStringDeliveryReportsTest
                        .getMmsQueryStringDeliveryReportsWithAllParameters()));
    }
}
