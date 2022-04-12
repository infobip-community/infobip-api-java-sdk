
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

public final class SmsAdvancedTextMessage extends AdvancedMessage<SmsAdvancedTextMessage> {
    @Valid
    @NotEmpty
    private List<TextMessage> messages = new ArrayList<>();
    @Valid
    private Tracking tracking;

    /**
     * <p>
     * SmsAdvancedTextMessage.
     * <p/>
     *
     * @param messages An array of message objects of a single message or multiple
     *     messages sent under one bulk ID.
     */
    public SmsAdvancedTextMessage(List<TextMessage> messages) {
        this.messages = messages;
    }

    /**
     * Sets up tracking parameters to track conversion metrics and type.
     */
    public SmsAdvancedTextMessage tracking(Tracking tracking) {
        this.tracking = tracking;
        return this;
    }

    public List<TextMessage> getMessages() {
        return messages;
    }

    public Tracking getTracking() {
        return tracking;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((messages == null) ? 0 : messages.hashCode());
        result = prime * result + ((tracking == null) ? 0 : tracking.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof SmsAdvancedTextMessage)) {
            return false;
        }
        SmsAdvancedTextMessage other = (SmsAdvancedTextMessage) obj;
        if (messages == null) {
            if (other.messages != null) {
                return false;
            }
        } else if (!messages.equals(other.messages)) {
            return false;
        }
        if (tracking == null) {
            if (other.tracking != null) {
                return false;
            }
        } else if (!tracking.equals(other.tracking)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SmsAdvancedTextMessage [messages=" + messages + ", tracking=" + tracking
                + ", bulkId=" + bulkId + ", sendingSpeedLimit=" + sendingSpeedLimit + "]";
    }
}
