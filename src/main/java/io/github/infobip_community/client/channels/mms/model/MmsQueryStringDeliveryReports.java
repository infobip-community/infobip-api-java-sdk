
package io.github.infobip_community.client.channels.mms.model;

public final class MmsQueryStringDeliveryReports {
    private String bulkId;
    private String messageId;
    private Integer limit;

    /**
     * <p>
     * MmsQueryStringDeliveryReports.
     * </p>
     */
    public MmsQueryStringDeliveryReports() {}

    /**
     * ID of bulk which delivery report is requested.
     */
    public MmsQueryStringDeliveryReports bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * ID of MMS which delivery report is requested.
     */
    public MmsQueryStringDeliveryReports messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Maximal number of delivery reports that will be returned.
     */
    public MmsQueryStringDeliveryReports limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public String getBulkId() {
        return bulkId;
    }

    public String getMessageId() {
        return messageId;
    }

    public Integer getLimit() {
        return limit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bulkId == null) ? 0 : bulkId.hashCode());
        result = prime * result + ((limit == null) ? 0 : limit.hashCode());
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MmsQueryStringDeliveryReports)) {
            return false;
        }
        MmsQueryStringDeliveryReports other = (MmsQueryStringDeliveryReports) obj;
        if (bulkId == null) {
            if (other.bulkId != null) {
                return false;
            }
        } else if (!bulkId.equals(other.bulkId)) {
            return false;
        }
        if (limit == null) {
            if (other.limit != null) {
                return false;
            }
        } else if (!limit.equals(other.limit)) {
            return false;
        }
        if (messageId == null) {
            if (other.messageId != null) {
                return false;
            }
        } else if (!messageId.equals(other.messageId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MmsQueryStringDeliveryReports [bulkId=" + bulkId + ", messageId=" + messageId
                + ", limit=" + limit + "]";
    }
}
