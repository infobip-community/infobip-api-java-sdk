
package io.github.infobip_community.client.channels.sms.model.message.outbound;

public final class SmsQueryStringMessageDeliveryReports {
    private String bulkId;
    private String messageId;
    private Integer limit;

    /**
     * <p>
     * SmsQueryStringMessageDeliveryReports.
     * </p>
     */
    public SmsQueryStringMessageDeliveryReports() {}

    /**
     * Unique ID assigned to the request if messaging multiple recipients or sending
     * multiple messages via a single API request.
     */
    public SmsQueryStringMessageDeliveryReports bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Unique message ID for which a report is requested.
     */
    public SmsQueryStringMessageDeliveryReports messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Maximum number of delivery reports to be returned. If not set, the latest 50
     * records are returned. Maximum limit value is 1000 and you can only access
     * reports for the last 48h.
     */
    public SmsQueryStringMessageDeliveryReports limit(Integer limit) {
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
        if (!(obj instanceof SmsQueryStringMessageDeliveryReports)) {
            return false;
        }
        SmsQueryStringMessageDeliveryReports other = (SmsQueryStringMessageDeliveryReports) obj;
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
        return "SmsQueryStringMessageDeliveryReports [bulkId=" + bulkId + ", messageId=" + messageId
                + ", limit=" + limit + "]";
    }
}
