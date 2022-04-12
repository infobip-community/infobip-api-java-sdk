
package io.github.infobip_community.client.channels.mms.model.response;

import io.github.infobip_community.client.channels.common.Price;
import java.time.OffsetDateTime;

public final class InboundReport {
    private String messageId;
    private String to;
    private String from;
    private String message;
    private OffsetDateTime receivedAt;
    private Integer mmsCount;
    private String callbackData;
    private Price price;

    public InboundReport() {}

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OffsetDateTime getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
    }

    public Integer getMmsCount() {
        return mmsCount;
    }

    public void setMmsCount(Integer mmsCount) {
        this.mmsCount = mmsCount;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((callbackData == null) ? 0 : callbackData.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((mmsCount == null) ? 0 : mmsCount.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((receivedAt == null) ? 0 : receivedAt.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboundReport)) {
            return false;
        }
        InboundReport other = (InboundReport) obj;
        if (callbackData == null) {
            if (other.callbackData != null) {
                return false;
            }
        } else if (!callbackData.equals(other.callbackData)) {
            return false;
        }
        if (from == null) {
            if (other.from != null) {
                return false;
            }
        } else if (!from.equals(other.from)) {
            return false;
        }
        if (message == null) {
            if (other.message != null) {
                return false;
            }
        } else if (!message.equals(other.message)) {
            return false;
        }
        if (messageId == null) {
            if (other.messageId != null) {
                return false;
            }
        } else if (!messageId.equals(other.messageId)) {
            return false;
        }
        if (mmsCount == null) {
            if (other.mmsCount != null) {
                return false;
            }
        } else if (!mmsCount.equals(other.mmsCount)) {
            return false;
        }
        if (price == null) {
            if (other.price != null) {
                return false;
            }
        } else if (!price.equals(other.price)) {
            return false;
        }
        if (receivedAt == null) {
            if (other.receivedAt != null) {
                return false;
            }
        } else if (!receivedAt.equals(other.receivedAt)) {
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
        return "InboundReport [messageId=" + messageId + ", to=" + to + ", from=" + from
                + ", message=" + message + ", receivedAt=" + receivedAt + ", mmsCount=" + mmsCount
                + ", callbackData=" + callbackData + ", price=" + price + "]";
    }
}
