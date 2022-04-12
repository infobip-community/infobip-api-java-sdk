
package io.github.infobip_community.client.channels.email.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.infobip_community.client.channels.email.model.EmailValidateAddressTest;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class EmailValidationApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static EmailValidationApi api = new EmailValidationApi(apiClient);

    @Test
    void testValidateEmailAddresses() {
        assertThrows(ApiException.class, () -> api.validateEmailAddresses(
                EmailValidateAddressTest.getEmailValidateAddressWithAllParameters()));
    }
}
