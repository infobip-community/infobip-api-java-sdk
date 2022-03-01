
package com.infobip.client.channels.rcs.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.URL;

public final class RcsMessage {
    private String from;
    @NotBlank
    private final String to;
    private Integer validityPeriod;
    private ValidityPeriodTimeUnit validityPeriodTimeUnit;
    @Valid
    @NotNull
    private final Content content;
    @Valid
    private SmsFailover smsFailover;
    @URL
    private String notifyUrl;
    private String callbackData;
    private String messageId;

    /**
     * <p>
     * RcsMessage.
     * </p>
     *
     * @param to Message destination
     * @param content Rcs message contents
     */
    public RcsMessage(String to, Content content) {
        this.to = to;
        this.content = content;
    }

    /**
     * Message sender.
     */
    public RcsMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Message validity period.
     */
    public RcsMessage validityPeriod(Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Message validity period time unit.
     */
    public RcsMessage validityPeriodTimeUnit(ValidityPeriodTimeUnit validityPeriodTimeUnit) {
        this.validityPeriodTimeUnit = validityPeriodTimeUnit;
        return this;
    }

    /**
     * Sms failover message contents.
     */
    public RcsMessage smsFailover(SmsFailover smsFailover) {
        this.smsFailover = smsFailover;
        return this;
    }

    /**
     * The URL on your call back server on which the Delivery report will be sent.
     */
    public RcsMessage notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Custom client data that will be included in Delivery Report.
     */
    public RcsMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * MessageId data that will be included in Delivery Report.
     */
    public RcsMessage messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Integer getValidityPeriod() {
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
        result = prime * result + ((validityPeriod == null) ? 0 : validityPeriod.hashCode());
        result = prime * result
                + ((validityPeriodTimeUnit == null) ? 0 : validityPeriodTimeUnit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RcsMessage)) {
            return false;
        }
        RcsMessage other = (RcsMessage) obj;
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
        if (validityPeriod == null) {
            if (other.validityPeriod != null) {
                return false;
            }
        } else if (!validityPeriod.equals(other.validityPeriod)) {
            return false;
        }
        if (validityPeriodTimeUnit != other.validityPeriodTimeUnit) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RcsMessage [from=" + from + ", to=" + to + ", validityPeriod=" + validityPeriod
                + ", validityPeriodTimeUnit=" + validityPeriodTimeUnit + ", content=" + content
                + ", smsFailover=" + smsFailover + ", notifyUrl=" + notifyUrl + ", callbackData="
                + callbackData + ", messageId=" + messageId + "]";
    }
}
