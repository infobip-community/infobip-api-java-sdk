
package io.github.infobip_community.client.channels.sms.model.message.scheduled;

import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.OffsetDateTime;

@Getter
@EqualsAndHashCode
@ToString
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
}
