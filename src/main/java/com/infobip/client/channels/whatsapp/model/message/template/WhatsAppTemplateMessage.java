
package com.infobip.client.channels.whatsapp.model.message.template;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public final class WhatsAppTemplateMessage {
    @Valid
    @NotEmpty
    private List<TemplateMessage> messages = new ArrayList<>();
    @Size(min = 1, max = 100)
    private String bulkId;

    /**
     * <p>
     * WhatsAppTemplateMessage.
     * </p>
     *
     * @param messages An array of messages being sent.
     */
    public WhatsAppTemplateMessage(List<TemplateMessage> messages) {
        this.messages = messages;
    }

    /**
     * The ID that uniquely identifies the request. Bulk ID will be received only
     * when you send a message to more than one destination address.
     */
    public WhatsAppTemplateMessage bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    public List<TemplateMessage> getMessages() {
        return messages;
    }

    public String getBulkId() {
        return bulkId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bulkId == null) ? 0 : bulkId.hashCode());
        result = prime * result + ((messages == null) ? 0 : messages.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhatsAppTemplateMessage)) {
            return false;
        }
        WhatsAppTemplateMessage other = (WhatsAppTemplateMessage) obj;
        if (bulkId == null) {
            if (other.bulkId != null) {
                return false;
            }
        } else if (!bulkId.equals(other.bulkId)) {
            return false;
        }
        if (messages == null) {
            if (other.messages != null) {
                return false;
            }
        } else if (!messages.equals(other.messages)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WhatsAppTemplateMessage [messages=" + messages + ", bulkId=" + bulkId + "]";
    }
}
