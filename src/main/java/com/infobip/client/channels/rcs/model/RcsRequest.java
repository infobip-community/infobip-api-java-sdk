
package com.infobip.client.channels.rcs.model;

/**
 * <p>
 * RcsRequest.
 * </p>
 */
public final class RcsRequest {
    private String from;
    private final String to;
    private int validityPeriod;
    private ValidityPeriodTimeUnit validityPeriodTimeUnit;
    private final Content content;
    private SmsFailover smsFailover;
    private String notifyUrl;
    private String callbackData;
    private String messageId;

    /**
     * <p>
     * Create RcsRequest with required fields.
     * </p>
     *
     * @param to Message destination
     * @param content Rcs message contents
     */
    public RcsRequest(String to, Content content) {
        this.to = to;
        this.content = content;
    }

    /**
     * Message sender.
     */
    public RcsRequest from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Message validity period.
     */
    public RcsRequest validityPeriod(int validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Message validity period time unit.
     */
    public RcsRequest validityPeriodTimeUnit(ValidityPeriodTimeUnit validityPeriodTimeUnit) {
        this.validityPeriodTimeUnit = validityPeriodTimeUnit;
        return this;
    }

    /**
     * Sms failover message contents.
     */
    public RcsRequest smsFailover(SmsFailover smsFailover) {
        this.smsFailover = smsFailover;
        return this;
    }

    /**
     * The URL on your call back server on which the Delivery report will be sent.
     */
    public RcsRequest notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Custom client data that will be included in Delivery Report.
     */
    public RcsRequest callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * MessageId data that will be included in Delivery Report.
     */
    public RcsRequest messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getValidityPeriod() {
        return validityPeriod;
    }

    public ValidityPeriodTimeUnit getValidityPeriodTimeUnit() {
        return validityPeriodTimeUnit;
    }

    public Content getContent() {
        return content;
    }

    public SmsFailover getSmsFailover() {
        return smsFailover;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public String getMessageId() {
        return messageId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((callbackData == null) ? 0 : callbackData.hashCode());
        result = prime * result + ((content == null) ? 0 : content.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((notifyUrl == null) ? 0 : notifyUrl.hashCode());
        result = prime * result + ((smsFailover == null) ? 0 : smsFailover.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        result = prime * result + validityPeriod;
        result = prime * result
                + ((validityPeriodTimeUnit == null) ? 0 : validityPeriodTimeUnit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RcsRequest)) {
            return false;
        }
        RcsRequest other = (RcsRequest) obj;
        if (callbackData == null) {
            if (other.callbackData != null) {
                return false;
            }
        } else if (!callbackData.equals(other.callbackData)) {
            return false;
        }
        if (content == null) {
            if (other.content != null) {
                return false;
            }
        } else if (!content.equals(other.content)) {
            return false;
        }
        if (from == null) {
            if (other.from != null) {
                return false;
            }
        } else if (!from.equals(other.from)) {
            return false;
        }
        if (messageId == null) {
            if (other.messageId != null) {
                return false;
            }
        } else if (!messageId.equals(other.messageId)) {
            return false;
        }
        if (notifyUrl == null) {
            if (other.notifyUrl != null) {
                return false;
            }
        } else if (!notifyUrl.equals(other.notifyUrl)) {
            return false;
        }
        if (smsFailover == null) {
            if (other.smsFailover != null) {
                return false;
            }
        } else if (!smsFailover.equals(other.smsFailover)) {
            return false;
        }
        if (to == null) {
            if (other.to != null) {
                return false;
            }
        } else if (!to.equals(other.to)) {
            return false;
        }
        if (validityPeriod != other.validityPeriod) {
            return false;
        }
        if (validityPeriodTimeUnit != other.validityPeriodTimeUnit) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RcsRequest [from=" + from + ", to=" + to + ", validityPeriod=" + validityPeriod
                + ", validityPeriodTimeUnit=" + validityPeriodTimeUnit + ", content=" + content
                + ", smsFailover=" + smsFailover + ", notifyUrl=" + notifyUrl + ", callbackData="
                + callbackData + ", messageId=" + messageId + "]";
    }
}
