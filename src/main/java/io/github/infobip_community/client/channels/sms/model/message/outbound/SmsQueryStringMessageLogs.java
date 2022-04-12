
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import java.time.OffsetDateTime;

public final class SmsQueryStringMessageLogs {
    private String from;
    private String to;
    private String bulkId;
    private String messageId;
    private GeneralStatus generalStatus;
    private OffsetDateTime sentSince;
    private OffsetDateTime sentUntil;
    private Integer limit;
    private String mcc;
    private String mnc;

    /**
     * <p>
     * SmsQueryStringMessageLogs.
     * </p>
     */
    public SmsQueryStringMessageLogs() {}

    /**
     * The sender ID which can be alphanumeric or numeric.
     */
    public SmsQueryStringMessageLogs from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Message destination address.
     */
    public SmsQueryStringMessageLogs to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Unique ID assigned to the request if messaging multiple recipients or sending
     * multiple messages via a single API request.
     */
    public SmsQueryStringMessageLogs bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Unique message ID for which a log is requested.
     */
    public SmsQueryStringMessageLogs messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Sent message status. Possible values: ACCEPTED, PENDING, UNDELIVERABLE,
     * DELIVERED, REJECTED, EXPIRED.
     */
    public SmsQueryStringMessageLogs generalStatus(GeneralStatus generalStatus) {
        this.generalStatus = generalStatus;
        return this;
    }

    /**
     * The logs will only include messages sent after this date. Use it together
     * with sentUntil to return a time range or if you want to fetch more than 1000
     * logs allowed per call. Has the following format: yyyy-MM-dd'T'HH:mm:ss.SSSZ.
     */
    public SmsQueryStringMessageLogs sentSince(OffsetDateTime sentSince) {
        this.sentSince = sentSince;
        return this;
    }

    /**
     * The logs will only include messages sent before this date. Use it together
     * with sentBefore to return a time range or if you want to fetch more than 1000
     * logs allowed per call. Has the following format: yyyy-MM-dd'T'HH:mm:ss.SSSZ.
     */
    public SmsQueryStringMessageLogs sentUntil(OffsetDateTime sentUntil) {
        this.sentUntil = sentUntil;
        return this;
    }

    /**
     * Maximum number of messages to include in logs. If not set, the latest 50
     * records are returned. Maximum limit value is 1000 and you can only access
     * logs for the last 48h. If you want to fetch more than 1000 logs allowed per
     * call, use sentBefore and sentUntil to retrieve them in pages.
     */
    public SmsQueryStringMessageLogs limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Mobile Country Code.
     */
    public SmsQueryStringMessageLogs mcc(String mcc) {
        this.mcc = mcc;
        return this;
    }

    /**
     * Mobile Network Code.
     */
    public SmsQueryStringMessageLogs mnc(String mnc) {
        this.mnc = mnc;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getBulkId() {
        return bulkId;
    }

    public String getMessageId() {
        return messageId;
    }

    public GeneralStatus getGeneralStatus() {
        return generalStatus;
    }

    public OffsetDateTime getSentSince() {
        return sentSince;
    }

    public OffsetDateTime getSentUntil() {
        return sentUntil;
    }

    public Integer getLimit() {
        return limit;
    }

    public String getMcc() {
        return mcc;
    }

    public String getMnc() {
        return mnc;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bulkId == null) ? 0 : bulkId.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((generalStatus == null) ? 0 : generalStatus.hashCode());
        result = prime * result + ((limit == null) ? 0 : limit.hashCode());
        result = prime * result + ((mcc == null) ? 0 : mcc.hashCode());
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((mnc == null) ? 0 : mnc.hashCode());
        result = prime * result + ((sentSince == null) ? 0 : sentSince.hashCode());
        result = prime * result + ((sentUntil == null) ? 0 : sentUntil.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsQueryStringMessageLogs)) {
            return false;
        }
        SmsQueryStringMessageLogs other = (SmsQueryStringMessageLogs) obj;
        if (bulkId == null) {
            if (other.bulkId != null) {
                return false;
            }
        } else if (!bulkId.equals(other.bulkId)) {
            return false;
        }
        if (from == null) {
            if (other.from != null) {
                return false;
            }
        } else if (!from.equals(other.from)) {
            return false;
        }
        if (generalStatus != other.generalStatus) {
            return false;
        }
        if (limit == null) {
            if (other.limit != null) {
                return false;
            }
        } else if (!limit.equals(other.limit)) {
            return false;
        }
        if (mcc == null) {
            if (other.mcc != null) {
                return false;
            }
        } else if (!mcc.equals(other.mcc)) {
            return false;
        }
        if (messageId == null) {
            if (other.messageId != null) {
                return false;
            }
        } else if (!messageId.equals(other.messageId)) {
            return false;
        }
        if (mnc == null) {
            if (other.mnc != null) {
                return false;
            }
        } else if (!mnc.equals(other.mnc)) {
            return false;
        }
        if (sentSince == null) {
            if (other.sentSince != null) {
                return false;
            }
        } else if (!sentSince.equals(other.sentSince)) {
            return false;
        }
        if (sentUntil == null) {
            if (other.sentUntil != null) {
                return false;
            }
        } else if (!sentUntil.equals(other.sentUntil)) {
            return false;
        }
        if (to == null) {
            if (other.to != null) {
                return false;
            }
        } else if (!to.equals(other.to)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SmsQueryStringMessageLogs [from=" + from + ", to=" + to + ", bulkId=" + bulkId
                + ", messageId=" + messageId + ", generalStatus=" + generalStatus + ", sentSince="
                + sentSince + ", sentUntil=" + sentUntil + ", limit=" + limit + ", mcc=" + mcc
                + ", mnc=" + mnc + "]";
    }
}
