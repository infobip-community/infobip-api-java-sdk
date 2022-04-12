
package io.github.infobip_community.client.channels.whatsapp.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.infobip_community.client.channels.whatsapp.model.WhatsAppDeleteMediaTest;
import io.github.infobip_community.client.channels.whatsapp.model.template.WhatsAppTemplateTest;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ManageWhatsAppApiTest {
    private static ApiClient apiClient = Mockito.mock(ApiClient.class);
    private static ManageWhatsAppApi api = new ManageWhatsAppApi(apiClient);

    @Test
    void testGetWhatsAppTemplates() {
        assertThrows(ApiException.class, () -> api.getWhatsAppTemplates(""));
    }

    @Test
    void testCreateWhatsAppTemplate() {
        assertThrows(ApiException.class, () -> api.createWhatsAppTemplate("sender",
                WhatsAppTemplateTest.getWhatsAppTemplateWithAllParameters()));
    }

    @Test
    void testDeleteWhatsAppMedia() {
        assertThrows(ApiException.class, () -> api.deleteWhatsAppMedia("sender",
                WhatsAppDeleteMediaTest.getWhatsAppDeleteMediaWithRequiredParameters()));
    }
}
