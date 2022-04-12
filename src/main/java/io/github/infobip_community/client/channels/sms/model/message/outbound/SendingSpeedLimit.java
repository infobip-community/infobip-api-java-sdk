
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.constraints.NotNull;

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

    public Integer getAmount() {
        return amount;
    }

    public SpeedLimitTimeUnit getTimeUnit() {
        return timeUnit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        result = prime * result + ((timeUnit == null) ? 0 : timeUnit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendingSpeedLimit)) {
            return false;
        }
        SendingSpeedLimit other = (SendingSpeedLimit) obj;
        if (amount == null) {
            if (other.amount != null) {
                return false;
            }
        } else if (!amount.equals(other.amount)) {
            return false;
        }
        if (timeUnit != other.timeUnit) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SendingSpeedLimit [amount=" + amount + ", timeUnit=" + timeUnit + "]";
    }
}
