
package io.github.infobip_community.client.channels.sms.model.message.inbound.response;

import java.util.ArrayList;
import java.util.List;

public final class SmsInboundMessageResponse {
    private Integer messageCount;
    private Integer pendingMessageCount;
    private List<MessageResult> results = new ArrayList<>();

    public SmsInboundMessageResponse() {}

    public Integer getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    public Integer getPendingMessageCount() {
        return pendingMessageCount;
    }

    public void setPendingMessageCount(Integer pendingMessageCount) {
        this.pendingMessageCount = pendingMessageCount;
    }

    public List<MessageResult> getResults() {
        return results;
    }

    public void setResults(List<MessageResult> results) {
        this.results = results;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((messageCount == null) ? 0 : messageCount.hashCode());
        result = prime * result
                + ((pendingMessageCount == null) ? 0 : pendingMessageCount.hashCode());
        result = prime * result + ((results == null) ? 0 : results.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsInboundMessageResponse)) {
            return false;
        }
        SmsInboundMessageResponse other = (SmsInboundMessageResponse) obj;
        if (messageCount == null) {
            if (other.messageCount != null) {
                return false;
            }
        } else if (!messageCount.equals(other.messageCount)) {
            return false;
        }
        if (pendingMessageCount == null) {
            if (other.pendingMessageCount != null) {
                return false;
            }
        } else if (!pendingMessageCount.equals(other.pendingMessageCount)) {
            return false;
        }
        if (results == null) {
            if (other.results != null) {
                return false;
            }
        } else if (!results.equals(other.results)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SmsInboundMessageResponse [messageCount=" + messageCount + ", pendingMessageCount="
                + pendingMessageCount + ", results=" + results + "]";
    }
}
