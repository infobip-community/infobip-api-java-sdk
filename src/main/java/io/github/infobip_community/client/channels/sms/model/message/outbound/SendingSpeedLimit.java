
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class SendingSpeedLimit {
    @NotNull
    private final Integer amount;
    private SpeedLimitTimeUnit timeUnit;

    /**
     * <p>
     * Limits the send speed when sending messages in bulk to deliver messages over
     * a longer period of time. You may wish to use this to allow your systems or
     * agents to handle large amounts of incoming traffic, e.g., if you are
     * expecting recipients to follow through with a call-to-action option from a
     * message you sent. Not setting a send speed limit can overwhelm your resources
     * with incoming traffic.
     * </p>
     *
     * @param amount The number of messages to be sent per timeUnit. By default, the
     *     system sends messages as fast as the infrastructure allows. Use this
     *     parameter to adapt sending capacity to your needs. The system is only
     *     able to work against its maximum capacity for ambitious message batches.
     */
    public SendingSpeedLimit(Integer amount) {
        this.amount = amount;
    }

    /**
     * The time unit to define when setting a messaging speed limit. Defaults to
     * MINUTE.
     */
    public SendingSpeedLimit timeUnit(SpeedLimitTimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
}
