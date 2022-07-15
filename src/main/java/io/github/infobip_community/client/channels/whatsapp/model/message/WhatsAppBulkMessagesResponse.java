
package io.github.infobip_community.client.channels.whatsapp.model.message;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * WhatsAppBulkMessagesResponse.
 * </p>
 */
@NoArgsConstructor
@Data
public final class WhatsAppBulkMessagesResponse {
    private List<WhatsAppMessageResponse> messages = new ArrayList<>();
    private String bulkId;
}
