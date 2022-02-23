
package com.infobip.client.channels.rcs.model;

public final class RcsResponseMessage {
    private String to;
    private int messageCount;
    private int messageId;
    private Status status;

    public RcsResponseMessage() {}

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + messageCount;
        result = prime * result + messageId;
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RcsResponseMessage)) {
            return false;
        }
        RcsResponseMessage other = (RcsResponseMessage) obj;
        if (messageCount != other.messageCount) {
            return false;
        }
        if (messageId != other.messageId) {
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
        return "RcsResponseMessage [to=" + to + ", messageCount=" + messageCount + ", messageId="
                + messageId + ", status=" + status + "]";
    }
}
