
package io.github.infobip_community.client.channels.sms.api;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.infobip_community.client.channels.sms.model.tfa.application.TfaApplicationTest;
import io.github.infobip_community.client.channels.sms.model.tfa.application.TfaQueryStringVerificationStatusTest;
import io.github.infobip_community.client.channels.sms.model.tfa.pin.TfaQueryStringSendPinCodeTest;
import io.github.infobip_community.client.channels.sms.model.tfa.pin.TfaResendPinCodeTest;
import io.github.infobip_community.client.channels.sms.model.tfa.pin.TfaSendPinCodeTest;
import io.github.infobip_community.client.channels.sms.model.tfa.pin.TfaVerifyPhoneNumberTest;
import io.github.infobip_community.client.channels.sms.model.tfa.template.TfaCreateMessageTest;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TfaApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static TfaApi api = new TfaApi(apiClient);

    @Test
    void testGetTfaApplications() {
        assertDoesNotThrow(() -> api.getTfaApplications());
    }

    @Test
    void testCreateTfaApplication() {
        assertThrows(ApiException.class, () -> api
                .createTfaApplication(TfaApplicationTest.getTfaApplicationWithAllParameters()));
    }

    @Test
    void testUpdateTfaApplication() {
        assertThrows(ApiException.class, () -> api.updateTfaApplication("11",
                TfaApplicationTest.getTfaApplicationWithAllParameters()));
    }

    @Test
    void testCreateTfaMessageTemplate() {
        assertThrows(ApiException.class, () -> api.createTfaMessageTemplate("11",
                TfaCreateMessageTest.getTfaCreateMessageWithAllParameters()));
    }

    @Test
    void testUpdateTfaMessageTemplate() {
        assertThrows(ApiException.class, () -> api.updateTfaMessageTemplate("11", "22",
                TfaCreateMessageTest.getTfaCreateMessageWithAllParameters()));
    }

    @Test
    void testSendTfaPinCodeOverSms() {
        assertThrows(ApiException.class,
                () -> api.sendTfaPinCodeOverSms(
                        TfaQueryStringSendPinCodeTest
                                .getTfaQueryStringSendPinCodeWithAllParameters(),
                        TfaSendPinCodeTest.getTfaSendPinCodeWithAllParameters()));
    }

    @Test
    void testResendTfaPinCodeOverSms() {
        assertThrows(ApiException.class, () -> api.resendTfaPinCodeOverSms(null,
                TfaResendPinCodeTest.getTfaResendPinCodeWithAllParameters()));
    }

    @Test
    void testSendTfaPinCodeOverVoice() {
        assertThrows(ApiException.class, () -> api
                .sendTfaPinCodeOverVoice(TfaSendPinCodeTest.getTfaSendPinCodeWithAllParameters()));
    }

    @Test
    void testResendTfaPinCodeOverVoice() {
        assertThrows(ApiException.class, () -> api.resendTfaPinCodeOverVoice(null,
                TfaResendPinCodeTest.getTfaResendPinCodeWithAllParameters()));
    }

    @Test
    void testVerifyTfaPhoneNumber() {
        assertThrows(ApiException.class, () -> api.verifyTfaPhoneNumber("11",
                TfaVerifyPhoneNumberTest.getTfaVerifyPhoneNumberWithAllParameters()));
    }

    @Test
    void testGetTfaVerificationStatus() {
        assertThrows(ApiException.class,
                () -> api.getTfaVerificationStatus("11", TfaQueryStringVerificationStatusTest
                        .getTfaQueryStringVerificationStatusWithAllParameters()));
    }
}
