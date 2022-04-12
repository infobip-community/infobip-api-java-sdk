
package io.github.infobip_community.client.channels.sms.model.message.scheduled;

import io.github.infobip_community.client.channels.common.Status;
import jakarta.validation.constraints.NotNull;

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

    public Status getStatus() {
        return status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsUpdateStatus)) {
            return false;
        }
        SmsUpdateStatus other = (SmsUpdateStatus) obj;
        if (status != other.status) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SmsUpdateStatus [status=" + status + "]";
    }
}
