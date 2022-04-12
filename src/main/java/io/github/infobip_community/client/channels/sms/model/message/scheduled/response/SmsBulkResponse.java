
package io.github.infobip_community.client.channels.sms.model.message.scheduled.response;

import java.time.OffsetDateTime;

public final class SmsBulkResponse {
    private String bulkId;
    private OffsetDateTime sendAt;

    public SmsBulkResponse() {}

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    public OffsetDateTime getSendAt() {
        return sendAt;
    }

    public void setSendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bulkId == null) ? 0 : bulkId.hashCode());
        result = prime * result + ((sendAt == null) ? 0 : sendAt.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsBulkResponse)) {
            return false;
        }
        SmsBulkResponse other = (SmsBulkResponse) obj;
        if (bulkId == null) {
            if (other.bulkId != null) {
                return false;
            }
        } else if (!bulkId.equals(other.bulkId)) {
            return false;
        }
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
        return "SmsBulkResponse [bulkId=" + bulkId + ", sendAt=" + sendAt + "]";
    }
}
