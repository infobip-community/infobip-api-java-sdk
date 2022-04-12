
package io.github.infobip_community.client.channels.email.model.response;

import java.util.ArrayList;
import java.util.List;

public final class EmailBulkScheduleResponse {
    private String externalBulkId;
    private List<Bulk> bulks = new ArrayList<>();

    public EmailBulkScheduleResponse() {}

    public String getExternalBulkId() {
        return externalBulkId;
    }

    public void setExternalBulkId(String externalBulkId) {
        this.externalBulkId = externalBulkId;
    }

    public List<Bulk> getBulks() {
        return bulks;
    }

    public void setBulks(List<Bulk> bulks) {
        this.bulks = bulks;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bulks == null) ? 0 : bulks.hashCode());
        result = prime * result + ((externalBulkId == null) ? 0 : externalBulkId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailBulkScheduleResponse)) {
            return false;
        }
        EmailBulkScheduleResponse other = (EmailBulkScheduleResponse) obj;
        if (bulks == null) {
            if (other.bulks != null) {
                return false;
            }
        } else if (!bulks.equals(other.bulks)) {
            return false;
        }
        if (externalBulkId == null) {
            if (other.externalBulkId != null) {
                return false;
            }
        } else if (!externalBulkId.equals(other.externalBulkId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmailBulkScheduleResponse [externalBulkId=" + externalBulkId + ", bulks=" + bulks
                + "]";
    }
}
