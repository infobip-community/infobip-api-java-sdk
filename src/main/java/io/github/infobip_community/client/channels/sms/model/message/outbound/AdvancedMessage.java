
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.Valid;

@SuppressWarnings({"unchecked", "rawtypes"})
public abstract class AdvancedMessage<T extends AdvancedMessage<T>> {
    protected String bulkId;
    @Valid
    protected SendingSpeedLimit sendingSpeedLimit;

    /**
     * <p>
     * AdvancedMessage.
     * </p>
     */
    public AdvancedMessage() {}

    /**
     * Unique ID assigned to the request if messaging multiple recipients or sending
     * multiple messages via a single API request. If not provided, it will be
     * auto-generated and returned in the API response. Typically, used to fetch
     * delivery reports and message logs.
     */
    public T bulkId(String bulkId) {
        this.bulkId = bulkId;
        return (T) this;
    }

    /**
     * Limits the send speed when sending messages in bulk to deliver messages over
     * a longer period of time. You may wish to use this to allow your systems or
     * agents to handle large amounts of incoming traffic, e.g., if you are
     * expecting recipients to follow through with a call-to-action option from a
     * message you sent. Not setting a send speed limit can overwhelm your resources
     * with incoming traffic.
     */
    public T sendingSpeedLimit(SendingSpeedLimit sendingSpeedLimit) {
        this.sendingSpeedLimit = sendingSpeedLimit;
        return (T) this;
    }

    public String getBulkId() {
        return bulkId;
    }

    public SendingSpeedLimit getSendingSpeedLimit() {
        return sendingSpeedLimit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bulkId == null) ? 0 : bulkId.hashCode());
        result = prime * result + ((sendingSpeedLimit == null) ? 0 : sendingSpeedLimit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvancedMessage)) {
            return false;
        }
        AdvancedMessage other = (AdvancedMessage) obj;
        if (bulkId == null) {
            if (other.bulkId != null) {
                return false;
            }
        } else if (!bulkId.equals(other.bulkId)) {
            return false;
        }
        if (sendingSpeedLimit == null) {
            if (other.sendingSpeedLimit != null) {
                return false;
            }
        } else if (!sendingSpeedLimit.equals(other.sendingSpeedLimit)) {
            return false;
        }
        return true;
    }
}
