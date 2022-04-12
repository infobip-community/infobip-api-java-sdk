
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public final class Destination {
    private String messageId;
    @NotNull
    @Size(min = 0, max = 50)
    private final String to;

    /**
     * <p>
     * Destination.
     * </p>
     *
     * @param to Message destination address. Addresses must be in international
     *     format (Example: 41793026727).
     */
    public Destination(String to) {
        this.to = to;
    }

    /**
     * The ID that uniquely identifies the message sent.
     */
    public Destination messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getTo() {
        return to;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Destination)) {
            return false;
        }
        Destination other = (Destination) obj;
        if (messageId == null) {
            if (other.messageId != null) {
                return false;
            }
        } else if (!messageId.equals(other.messageId)) {
            return false;
        }
        if (to == null) {
            if (other.to != null) {
                return false;
            }
        } else if (!to.equals(other.to)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Destination [messageId=" + messageId + ", to=" + to + "]";
    }
}
