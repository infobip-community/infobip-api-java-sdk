
package com.infobip.client.channels.whatsapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * WhatsAppTemplateMessageRequest.
 * </p>
 */
public final class WhatsAppTemplateMessageRequest {
    private List<TemplateMessage> messages = new ArrayList<>();
    private String bulkId;

    public WhatsAppTemplateMessageRequest(List<TemplateMessage> messages) {
        this.messages = messages;
    }

    public WhatsAppTemplateMessageRequest bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }
}
