
package io.github.infobip_community.client.channels.whatsapp.model.message;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * WhatsAppMessageResponse.
 * </p>
 */
@NoArgsConstructor
@Data
public final class WhatsAppMessageResponse {
    private String to;
    private Integer messageCount;
    private String messageId;
    private Status status;
}
