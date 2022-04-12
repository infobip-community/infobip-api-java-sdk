
package io.github.infobip_community.client.channels.email.model.response;

public final class BulkStatus {
    private String bulkId;
    private io.github.infobip_community.client.channels.common.Status status;

    public BulkStatus() {}

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    public io.github.infobip_community.client.channels.common.Status getStatus() {
        return status;
    }

    public void setStatus(io.github.infobip_community.client.channels.common.Status status) {
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
        if (!(obj instanceof BulkStatus)) {
            return false;
        }
        BulkStatus other = (BulkStatus) obj;
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
        return "BulkStatus [bulkId=" + bulkId + ", status=" + status + "]";
    }
}
