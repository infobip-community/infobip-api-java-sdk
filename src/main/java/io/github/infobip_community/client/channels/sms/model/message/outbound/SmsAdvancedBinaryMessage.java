
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

public final class SmsAdvancedBinaryMessage extends AdvancedMessage<SmsAdvancedBinaryMessage> {
    @Valid
    @NotEmpty
    private List<BinaryMessage> messages = new ArrayList<>();

    /**
     * <p>
     * SmsAdvancedBinaryMessage.
     * </p>
     *
     * @param messages An array of message objects of a single message or multiple
     *     messages sent under one bulk ID.
     */
    public SmsAdvancedBinaryMessage(List<BinaryMessage> messages) {
        this.messages = messages;
    }

    public List<BinaryMessage> getMessages() {
        return messages;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((messages == null) ? 0 : messages.hashCode());
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
        if (!(obj instanceof SmsAdvancedBinaryMessage)) {
            return false;
        }
        SmsAdvancedBinaryMessage other = (SmsAdvancedBinaryMessage) obj;
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
        return "SmsAdvancedBinaryMessage [messages=" + messages + ", bulkId=" + bulkId
                + ", sendingSpeedLimit=" + sendingSpeedLimit + "]";
    }
}
