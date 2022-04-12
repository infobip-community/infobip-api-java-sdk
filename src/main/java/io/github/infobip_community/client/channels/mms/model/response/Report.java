
package io.github.infobip_community.client.channels.mms.model.response;

import io.github.infobip_community.client.channels.common.Price;
import java.time.OffsetDateTime;

public final class Report {
    private String bulkId;
    private String messageId;
    private String to;
    private String from;
    private OffsetDateTime sentAt;
    private OffsetDateTime doneAt;
    private Integer mmsCount;
    private String mccMnc;
    private String callbackData;
    private Price price;
    private Status status;
    private Status error;

    public Report() {}

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

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

    public OffsetDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public OffsetDateTime getDoneAt() {
        return doneAt;
    }

    public void setDoneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
    }

    public Integer getMmsCount() {
        return mmsCount;
    }

    public void setMmsCount(Integer mmsCount) {
        this.mmsCount = mmsCount;
    }

    public String getMccMnc() {
        return mccMnc;
    }

    public void setMccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getError() {
        return error;
    }

    public void setError(Status error) {
        this.error = error;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bulkId == null) ? 0 : bulkId.hashCode());
        result = prime * result + ((callbackData == null) ? 0 : callbackData.hashCode());
        result = prime * result + ((doneAt == null) ? 0 : doneAt.hashCode());
        result = prime * result + ((error == null) ? 0 : error.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((mccMnc == null) ? 0 : mccMnc.hashCode());
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((mmsCount == null) ? 0 : mmsCount.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((sentAt == null) ? 0 : sentAt.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Report)) {
            return false;
        }
        Report other = (Report) obj;
        if (bulkId == null) {
            if (other.bulkId != null) {
                return false;
            }
        } else if (!bulkId.equals(other.bulkId)) {
            return false;
        }
        if (callbackData == null) {
            if (other.callbackData != null) {
                return false;
            }
        } else if (!callbackData.equals(other.callbackData)) {
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
        if (sentAt == null) {
            if (other.sentAt != null) {
                return false;
            }
        } else if (!sentAt.equals(other.sentAt)) {
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
        return "Report [bulkId=" + bulkId + ", messageId=" + messageId + ", to=" + to + ", from="
                + from + ", sentAt=" + sentAt + ", doneAt=" + doneAt + ", mmsCount=" + mmsCount
                + ", mccMnc=" + mccMnc + ", callbackData=" + callbackData + ", price=" + price
                + ", status=" + status + ", error=" + error + "]";
    }
}
