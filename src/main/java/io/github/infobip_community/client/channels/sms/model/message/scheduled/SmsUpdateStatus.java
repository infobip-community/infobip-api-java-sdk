
package io.github.infobip_community.client.channels.sms.model.message.scheduled;

import io.github.infobip_community.client.channels.common.Status;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class SmsUpdateStatus {
    @NotNull
    private final Status status;

    /**
     * <p>
     * SmsUpdateStatus.
     * </p>
     *
     * @param status The status of the message(s).
     */
    public SmsUpdateStatus(Status status) {
        this.status = status;
    }
}
