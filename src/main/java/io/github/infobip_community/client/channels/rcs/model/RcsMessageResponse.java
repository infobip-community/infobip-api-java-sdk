
package io.github.infobip_community.client.channels.rcs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * RcsMessageResponse.
 * </p>
 */
public final class RcsMessageResponse {
    private List<ResponseMessage> messages = new ArrayList<>();

    public RcsMessageResponse() {}

    public List<ResponseMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ResponseMessage> messages) {
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
        if (!(obj instanceof RcsMessageResponse)) {
            return false;
        }
        RcsMessageResponse other = (RcsMessageResponse) obj;
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
        return "RcsMessageResponse [messages=" + messages + "]";
    }
}
