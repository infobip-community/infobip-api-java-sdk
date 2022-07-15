
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@SuppressWarnings({"unchecked", "rawtypes"})
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public abstract class AdvancedMessage<T extends AdvancedMessage<T>> {
    protected String bulkId;
    @Valid
    protected SendingSpeedLimit sendingSpeedLimit;

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
}
