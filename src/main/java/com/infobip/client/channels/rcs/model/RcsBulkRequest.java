
package com.infobip.client.channels.rcs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * RcsBulkRequest.
 * </p>
 */
public class RcsBulkRequest {
    private List<RcsRequest> messages = new ArrayList<>();

    public RcsBulkRequest() {}

    public RcsBulkRequest messages(List<RcsRequest> messages) {
        this.messages = messages;
        return this;
    }

    public List<RcsRequest> getMessages() {
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
        if (!(obj instanceof RcsBulkRequest)) {
            return false;
        }
        RcsBulkRequest other = (RcsBulkRequest) obj;
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
        return "RcsBulkRequest [messages=" + messages + "]";
    }
}
