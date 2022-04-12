
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;

public final class RcsBulkMessage {
    @Valid
    private List<RcsMessage> messages = new ArrayList<>();

    /**
     * <p>
     * RcsBulkMessage.
     * </p>
     */
    public RcsBulkMessage() {}

    /**
     * RcsMessage List.
     */
    public RcsBulkMessage messages(List<RcsMessage> messages) {
        this.messages = messages;
        return this;
    }

    public List<RcsMessage> getMessages() {
        return messages;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((messages == null) ? 0 : messages.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RcsBulkMessage)) {
            return false;
        }
        RcsBulkMessage other = (RcsBulkMessage) obj;
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
        return "RcsBulkMessage [messages=" + messages + "]";
    }
}
