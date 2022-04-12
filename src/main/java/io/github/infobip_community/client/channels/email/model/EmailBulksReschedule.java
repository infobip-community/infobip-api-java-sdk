
package io.github.infobip_community.client.channels.email.model;

import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;

public final class EmailBulksReschedule {
    @NotNull
    private final OffsetDateTime sendAt;

    public EmailBulksReschedule(OffsetDateTime sendAt) {
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
        if (!(obj instanceof EmailBulksReschedule)) {
            return false;
        }
        EmailBulksReschedule other = (EmailBulksReschedule) obj;
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
        return "EmailBulksReschedule [sendAt=" + sendAt + "]";
    }
}
