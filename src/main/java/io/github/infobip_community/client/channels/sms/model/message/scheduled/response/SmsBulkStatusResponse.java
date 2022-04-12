
package io.github.infobip_community.client.channels.sms.model.message.scheduled.response;

import io.github.infobip_community.client.channels.common.Status;

public final class SmsBulkStatusResponse {
    private String bulkId;
    private Status status;

    public SmsBulkStatusResponse() {}

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bulkId == null) ? 0 : bulkId.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsBulkStatusResponse)) {
            return false;
        }
        SmsBulkStatusResponse other = (SmsBulkStatusResponse) obj;
        if (bulkId == null) {
            if (other.bulkId != null) {
                return false;
            }
        } else if (!bulkId.equals(other.bulkId)) {
            return false;
        }
        if (status != other.status) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SmsBulkStatusResponse [bulkId=" + bulkId + ", status=" + status + "]";
    }
}
