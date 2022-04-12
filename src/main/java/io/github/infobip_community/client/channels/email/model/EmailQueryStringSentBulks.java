
package io.github.infobip_community.client.channels.email.model;

import jakarta.validation.constraints.NotBlank;

public final class EmailQueryStringSentBulks {
    @NotBlank
    private final String bulkId;

    /**
     * <p>
     * EmailQueryStringSentBulks.
     * </p>
     *
     * @param bulkId bulkId
     */
    public EmailQueryStringSentBulks(String bulkId) {
        this.bulkId = bulkId;
    }

    public String getBulkId() {
        return bulkId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bulkId == null) ? 0 : bulkId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailQueryStringSentBulks)) {
            return false;
        }
        EmailQueryStringSentBulks other = (EmailQueryStringSentBulks) obj;
        if (bulkId == null) {
            if (other.bulkId != null) {
                return false;
            }
        } else if (!bulkId.equals(other.bulkId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmailQueryStringSentBulks [bulkId=" + bulkId + "]";
    }
}
