
package io.github.infobip_community.client.channels.whatsapp.model.message;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * WhatsAppBulkMessagesResponse.
 * </p>
 */
public final class WhatsAppBulkMessagesResponse {
    private List<WhatsAppMessageResponse> messages = new ArrayList<>();
    private String bulkId;

    public WhatsAppBulkMessagesResponse() {}

    public List<WhatsAppMessageResponse> getMessages() {
        return messages;
    }

    public void setMessages(List<WhatsAppMessageResponse> messages) {
        this.messages = messages;
    }

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
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
        if (!(obj instanceof WhatsAppBulkMessagesResponse)) {
            return false;
        }
        WhatsAppBulkMessagesResponse other = (WhatsAppBulkMessagesResponse) obj;
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
        return "WhatsAppBulkMessagesResponse [messages=" + messages + ", bulkId=" + bulkId + "]";
    }
}
