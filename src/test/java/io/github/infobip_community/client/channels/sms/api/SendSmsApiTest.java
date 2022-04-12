
package io.github.infobip_community.client.channels.sms.api;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.infobip_community.client.channels.sms.model.message.outbound.SmsAdvancedBinaryMessageTest;
import io.github.infobip_community.client.channels.sms.model.message.outbound.SmsAdvancedTextMessageTest;
import io.github.infobip_community.client.channels.sms.model.message.outbound.SmsPreviewMessageTest;
import io.github.infobip_community.client.channels.sms.model.message.outbound.SmsQueryStringMessageDeliveryReportsTest;
import io.github.infobip_community.client.channels.sms.model.message.outbound.SmsQueryStringMessageLogsTest;
import io.github.infobip_community.client.channels.sms.model.message.outbound.SmsQueryStringMessageTest;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SendSmsApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static SendSmsApi api = new SendSmsApi(apiClient);

    @Test
    void testSendSmsMessage() {
        assertThrows(ApiException.class, () -> api.sendSmsMessage(
                SmsAdvancedTextMessageTest.getSmsAdvancedTextMessageWithAllParameters()));
    }

    @Test
    void testSendBinarySmsMessage() {
        assertThrows(ApiException.class, () -> api.sendBinarySmsMessage(
                SmsAdvancedBinaryMessageTest.getSmsAdvancedBinaryMessageWithAllParameters()));
    }

    @Test
    void testSendSmsMessageOverQueryParameters() {
        assertThrows(ApiException.class, () -> api.sendSmsMessageOverQueryParameters(
                SmsQueryStringMessageTest.getSmsQueryStringMessageWithAllParameters()));
    }

    @Test
    void testPreviewSmsMessage() {
        assertThrows(ApiException.class, () -> api
                .previewSmsMessage(SmsPreviewMessageTest.getSmsPreviewMessageWithAllParameters()));
    }

    @Test
    void testGetOutboundSmsMessageDeliveryReports() {
        assertDoesNotThrow(() -> api
                .getOutboundSmsMessageDeliveryReports(SmsQueryStringMessageDeliveryReportsTest
                        .getSmsQueryStringMessageDeliveryReportsWithAllParameters()));
    }

    @Test
    void testGetOutboundSmsMessageLogs() {
        assertDoesNotThrow(() -> api.getOutboundSmsMessageLogs(
                SmsQueryStringMessageLogsTest.getSmsQueryStringMessageLogsWithAllParameters()));
    }
}
