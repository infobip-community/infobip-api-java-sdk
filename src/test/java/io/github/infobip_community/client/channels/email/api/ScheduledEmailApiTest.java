
package io.github.infobip_community.client.channels.email.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.infobip_community.client.channels.email.model.EmailBulksRescheduleTest;
import io.github.infobip_community.client.channels.email.model.EmailQueryStringSentBulksTest;
import io.github.infobip_community.client.channels.email.model.EmailScheduledStatusTest;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ScheduledEmailApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static ScheduledEmailApi api = new ScheduledEmailApi(apiClient);

    @Test
    void testGetScheduledEmails() {
        assertThrows(ApiException.class, () -> api.getScheduledEmails(
                EmailQueryStringSentBulksTest.getEmailQueryStringSentBulksWithAllParameters()));
    }

    @Test
    void testRescheduleEmails() {
        assertThrows(ApiException.class,
                () -> api.rescheduleEmails(
                        EmailQueryStringSentBulksTest
                                .getEmailQueryStringSentBulksWithRequiredParameters(),
                        EmailBulksRescheduleTest.getEmailBulksRescheduleWithAllParameters()));
    }

    @Test
    void testGetScheduledEmailStatuses() {
        assertThrows(ApiException.class, () -> api.getScheduledEmailStatuses(
                EmailQueryStringSentBulksTest.getEmailQueryStringSentBulksWithAllParameters()));
    }

    @Test
    void testUpdateScheduledEmailStatuses() {
        assertThrows(ApiException.class,
                () -> api.updateScheduledEmailStatuses(
                        EmailQueryStringSentBulksTest
                                .getEmailQueryStringSentBulksWithRequiredParameters(),
                        EmailScheduledStatusTest.getEmailScheduledStatusWithAllParameters()));
    }
}
