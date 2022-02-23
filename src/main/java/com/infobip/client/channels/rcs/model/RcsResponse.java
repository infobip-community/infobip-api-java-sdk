
package com.infobip.client.channels.rcs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * RcsResponse.
 * </p>
 */
public final class RcsResponse {
    private List<RcsResponseMessage> messages = new ArrayList<>();

    public RcsResponse() {}

    public List<RcsResponseMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<RcsResponseMessage> messages) {
        this.messages = messages;
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
        if (!(obj instanceof RcsResponse)) {
            return false;
        }
        RcsResponse other = (RcsResponse) obj;
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
        return "RcsResponse [messages=" + messages + "]";
    }
}
