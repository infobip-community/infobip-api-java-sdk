
package io.github.infobip_community.client.channels.email.model;

public final class EmailQueryStringDeliveryReports {
    private String bulkId;
    private String messageId;
    private Integer limit;

    /**
     * <p>
     * EmailQueryStringDeliveryReports.
     * </p>
     */
    public EmailQueryStringDeliveryReports() {}

    /**
     * Bulk ID for which report is requested.
     */
    public EmailQueryStringDeliveryReports bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * The ID that uniquely identifies the sent email.
     */
    public EmailQueryStringDeliveryReports messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Maximum number of reports.
     */
    public EmailQueryStringDeliveryReports limit(Integer limit) {
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
        if (!(obj instanceof EmailQueryStringDeliveryReports)) {
            return false;
        }
        EmailQueryStringDeliveryReports other = (EmailQueryStringDeliveryReports) obj;
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
        return "EmailQueryStringDeliveryReports [bulkId=" + bulkId + ", messageId=" + messageId
                + ", limit=" + limit + "]";
    }
}
