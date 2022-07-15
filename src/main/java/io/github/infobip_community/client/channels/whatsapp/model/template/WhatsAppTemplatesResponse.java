
package io.github.infobip_community.client.channels.whatsapp.model.template;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * WhatsAppTemplatesResponse.
 * </p>
 */
@NoArgsConstructor
@Data
public final class WhatsAppTemplatesResponse {
    private List<WhatsAppTemplateResponse> templates = new ArrayList<>();
}
