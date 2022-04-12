
package io.github.infobip_community.client.channels.email.model;

import io.github.infobip_community.client.channels.common.Status;
import jakarta.validation.constraints.NotNull;

public final class EmailScheduledStatus {
    @NotNull
    private final Status status;

    /**
     * <p>
     * EmailScheduledStatus.
     * </p>
     *
     * @param status status
     */
    public EmailScheduledStatus(Status status) {
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
        if (!(obj instanceof EmailScheduledStatus)) {
            return false;
        }
        EmailScheduledStatus other = (EmailScheduledStatus) obj;
        if (status != other.status) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmailScheduledStatus [status=" + status + "]";
    }
}
