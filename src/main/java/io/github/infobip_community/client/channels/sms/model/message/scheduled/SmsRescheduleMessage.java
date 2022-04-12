
package io.github.infobip_community.client.channels.sms.model.message.scheduled;

import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;

public final class SmsRescheduleMessage {
    @NotNull
    private final OffsetDateTime sendAt;

    /**
     * <p>
     * SmsRescheduleMessage.
     * </p>
     *
     * @param sendAt Date and time when the message is to be sent. Used for
     *     scheduled SMS (see Scheduled SMS endpoints for more details). Has the
     *     following format: yyyy-MM-dd'T'HH:mm:ss.SSSZ, and can only be scheduled
     *     for no later than 180 days in advance.
     */
    public SmsRescheduleMessage(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
    }

    public OffsetDateTime getSendAt() {
        return sendAt;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sendAt == null) ? 0 : sendAt.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsRescheduleMessage)) {
            return false;
        }
        SmsRescheduleMessage other = (SmsRescheduleMessage) obj;
        if (sendAt == null) {
            if (other.sendAt != null) {
                return false;
            }
        } else if (!sendAt.equals(other.sendAt)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SmsRescheduleMessage [sendAt=" + sendAt + "]";
    }
}
