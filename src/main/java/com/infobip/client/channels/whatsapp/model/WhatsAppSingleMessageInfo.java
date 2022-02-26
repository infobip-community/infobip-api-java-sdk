
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppSingleMessageInfo.
 * </p>
 */
public class WhatsAppSingleMessageInfo {
    private String to;
    private Integer messageCount;
    private String messageId;
    private WhatsAppSingleMessageStatus status;

    public WhatsAppSingleMessageInfo() {}

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public WhatsAppSingleMessageStatus getStatus() {
        return status;
    }

    public void setStatus(WhatsAppSingleMessageStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((messageCount == null) ? 0 : messageCount.hashCode());
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhatsAppSingleMessageInfo)) {
            return false;
        }
        WhatsAppSingleMessageInfo other = (WhatsAppSingleMessageInfo) obj;
        if (messageCount == null) {
            if (other.messageCount != null) {
                return false;
            }
        } else if (!messageCount.equals(other.messageCount)) {
            return false;
        }
        if (messageId == null) {
            if (other.messageId != null) {
                return false;
            }
        } else if (!messageId.equals(other.messageId)) {
            return false;
        }
        if (status == null) {
            if (other.status != null) {
                return false;
            }
        } else if (!status.equals(other.status)) {
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
        return "WhatsAppSingleMessageInfo [to=" + to + ", messageCount=" + messageCount
                + ", messageId=" + messageId + ", status=" + status + "]";
    }
}
