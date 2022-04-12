
package io.github.infobip_community.client.channels.sms.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.infobip_community.client.channels.sms.model.message.scheduled.SmsQueryStringScheduledMessagesTest;
import io.github.infobip_community.client.channels.sms.model.message.scheduled.SmsRescheduleMessageTest;
import io.github.infobip_community.client.channels.sms.model.message.scheduled.SmsUpdateStatusTest;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ScheduledSmsApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static ScheduledSmsApi api = new ScheduledSmsApi(apiClient);

    @Test
    void testGetScheduledSmsMessages() {
        assertThrows(ApiException.class,
                () -> api.getScheduledSmsMessages(SmsQueryStringScheduledMessagesTest
                        .getSmsQueryStringScheduledMessagesWithAllParameters()));
    }

    @Test
    void testRescheduleSmsMessages() {
        assertThrows(ApiException.class,
                () -> api.rescheduleSmsMessages(
                        SmsQueryStringScheduledMessagesTest
                                .getSmsQueryStringScheduledMessagesWithRequiredParameters(),
                        SmsRescheduleMessageTest.getSmsRescheduleMessageWithAllParameters()));
    }

    @Test
    void testGetScheduledSmsMessagesStatus() {
        assertThrows(ApiException.class,
                () -> api.getScheduledSmsMessagesStatus(SmsQueryStringScheduledMessagesTest
                        .getSmsQueryStringScheduledMessagesWithAllParameters()));
    }

    @Test
    void testUpdateScheduledSmsMessagesStatus() {
        assertThrows(ApiException.class,
                () -> api.updateScheduledSmsMessagesStatus(
                        SmsQueryStringScheduledMessagesTest
                                .getSmsQueryStringScheduledMessagesWithRequiredParameters(),
                        SmsUpdateStatusTest.getSmsUpdateStatusWithAllParameters()));
    }
}
