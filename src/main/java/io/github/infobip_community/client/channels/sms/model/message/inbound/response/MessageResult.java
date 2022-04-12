
package io.github.infobip_community.client.channels.sms.model.message.inbound.response;

import io.github.infobip_community.client.channels.sms.model.common.ResultPrice;
import java.time.OffsetDateTime;

public final class MessageResult {
    private String callbackData;
    private String cleanText;
    private String from;
    private String keyword;
    private String messageId;
    private ResultPrice price;
    private OffsetDateTime receivedAt;
    private Integer smsCount;
    private String text;
    private String to;

    public MessageResult() {}

    public String getCallbackData() {
        return callbackData;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    public String getCleanText() {
        return cleanText;
    }

    public void setCleanText(String cleanText) {
        this.cleanText = cleanText;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public ResultPrice getPrice() {
        return price;
    }

    public void setPrice(ResultPrice price) {
        this.price = price;
    }

    public OffsetDateTime getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
    }

    public Integer getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((callbackData == null) ? 0 : callbackData.hashCode());
        result = prime * result + ((cleanText == null) ? 0 : cleanText.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((keyword == null) ? 0 : keyword.hashCode());
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((receivedAt == null) ? 0 : receivedAt.hashCode());
        result = prime * result + ((smsCount == null) ? 0 : smsCount.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageResult)) {
            return false;
        }
        MessageResult other = (MessageResult) obj;
        if (callbackData == null) {
            if (other.callbackData != null) {
                return false;
            }
        } else if (!callbackData.equals(other.callbackData)) {
            return false;
        }
        if (cleanText == null) {
            if (other.cleanText != null) {
                return false;
            }
        } else if (!cleanText.equals(other.cleanText)) {
            return false;
        }
        if (from == null) {
            if (other.from != null) {
                return false;
            }
        } else if (!from.equals(other.from)) {
            return false;
        }
        if (keyword == null) {
            if (other.keyword != null) {
                return false;
            }
        } else if (!keyword.equals(other.keyword)) {
            return false;
        }
        if (messageId == null) {
            if (other.messageId != null) {
                return false;
            }
        } else if (!messageId.equals(other.messageId)) {
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
        if (smsCount == null) {
            if (other.smsCount != null) {
                return false;
            }
        } else if (!smsCount.equals(other.smsCount)) {
            return false;
        }
        if (text == null) {
            if (other.text != null) {
                return false;
            }
        } else if (!text.equals(other.text)) {
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
        return "MessageResult [callbackData=" + callbackData + ", cleanText=" + cleanText
                + ", from=" + from + ", keyword=" + keyword + ", messageId=" + messageId
                + ", price=" + price + ", receivedAt=" + receivedAt + ", smsCount=" + smsCount
                + ", text=" + text + ", to=" + to + "]";
    }
}
