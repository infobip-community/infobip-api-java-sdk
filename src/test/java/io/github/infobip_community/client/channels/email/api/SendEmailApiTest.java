
package io.github.infobip_community.client.channels.email.api;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.infobip_community.client.channels.email.model.EmailFullyFeaturedTest;
import io.github.infobip_community.client.channels.email.model.EmailQueryStringDeliveryReportsTest;
import io.github.infobip_community.client.channels.email.model.EmailQueryStringLogsTest;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SendEmailApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static SendEmailApi api = new SendEmailApi(apiClient);

    @Test
    void testGetEmailDeliveryReports() {
        assertDoesNotThrow(() -> api.getEmailDeliveryReports(EmailQueryStringDeliveryReportsTest
                .getEmailQueryStringDeliveryReportsWithAllParameters()));
    }

    @Test
    void testGetEmailLogs() {
        assertDoesNotThrow(() -> api
                .getEmailLogs(EmailQueryStringLogsTest.getEmailQueryStringLogsWithAllParameters()));
    }

    @Test
    void testSendEmail() {
        assertThrows(ApiException.class, () -> api
                .sendEmail(EmailFullyFeaturedTest.getEmailFullyFeaturedWithAllParameters()));
    }
}
