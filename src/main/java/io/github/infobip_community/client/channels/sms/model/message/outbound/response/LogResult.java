
package io.github.infobip_community.client.channels.sms.model.message.outbound.response;

import io.github.infobip_community.client.channels.sms.model.common.ResultPrice;
import java.time.OffsetDateTime;

public final class LogResult {
    private String bulkId;
    private OffsetDateTime doneAt;
    private ResultError error;
    private String from;
    private String mccMnc;
    private String messageId;
    private ResultPrice price;
    private OffsetDateTime sentAt;
    private Integer smsCount;
    private Status status;
    private String text;
    private String to;

    public LogResult() {}

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    public OffsetDateTime getDoneAt() {
        return doneAt;
    }

    public void setDoneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
    }

    public ResultError getError() {
        return error;
    }

    public void setError(ResultError error) {
        this.error = error;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMccMnc() {
        return mccMnc;
    }

    public void setMccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
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

    public OffsetDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public Integer getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
        result = prime * result + ((bulkId == null) ? 0 : bulkId.hashCode());
        result = prime * result + ((doneAt == null) ? 0 : doneAt.hashCode());
        result = prime * result + ((error == null) ? 0 : error.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((mccMnc == null) ? 0 : mccMnc.hashCode());
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((sentAt == null) ? 0 : sentAt.hashCode());
        result = prime * result + ((smsCount == null) ? 0 : smsCount.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogResult)) {
            return false;
        }
        LogResult other = (LogResult) obj;
        if (bulkId == null) {
            if (other.bulkId != null) {
                return false;
            }
        } else if (!bulkId.equals(other.bulkId)) {
            return false;
        }
        if (doneAt == null) {
            if (other.doneAt != null) {
                return false;
            }
        } else if (!doneAt.equals(other.doneAt)) {
            return false;
        }
        if (error == null) {
            if (other.error != null) {
                return false;
            }
        } else if (!error.equals(other.error)) {
            return false;
        }
        if (from == null) {
            if (other.from != null) {
                return false;
            }
        } else if (!from.equals(other.from)) {
            return false;
        }
        if (mccMnc == null) {
            if (other.mccMnc != null) {
                return false;
            }
        } else if (!mccMnc.equals(other.mccMnc)) {
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
        if (sentAt == null) {
            if (other.sentAt != null) {
                return false;
            }
        } else if (!sentAt.equals(other.sentAt)) {
            return false;
        }
        if (smsCount == null) {
            if (other.smsCount != null) {
                return false;
            }
        } else if (!smsCount.equals(other.smsCount)) {
            return false;
        }
        if (status == null) {
            if (other.status != null) {
                return false;
            }
        } else if (!status.equals(other.status)) {
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
        return "LogResult [bulkId=" + bulkId + ", doneAt=" + doneAt + ", error=" + error + ", from="
                + from + ", mccMnc=" + mccMnc + ", messageId=" + messageId + ", price=" + price
                + ", sentAt=" + sentAt + ", smsCount=" + smsCount + ", status=" + status + ", text="
                + text + ", to=" + to + "]";
    }
}
