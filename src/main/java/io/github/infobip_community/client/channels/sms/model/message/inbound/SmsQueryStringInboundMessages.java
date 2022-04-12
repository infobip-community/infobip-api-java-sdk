
package io.github.infobip_community.client.channels.sms.model.message.inbound;

public final class SmsQueryStringInboundMessages {
    private Integer limit;

    /**
     * <p>
     * SmsQueryStringInboundMessages.
     * </p>
     */
    public SmsQueryStringInboundMessages() {}

    /**
     * Maximum number of messages to be returned in a response. If not set, the
     * latest 50 records are returned. Maximum limit value is 1000 and you can only
     * access messages for the last 48h.
     */
    public SmsQueryStringInboundMessages limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((limit == null) ? 0 : limit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsQueryStringInboundMessages)) {
            return false;
        }
        SmsQueryStringInboundMessages other = (SmsQueryStringInboundMessages) obj;
        if (limit == null) {
            if (other.limit != null) {
                return false;
            }
        } else if (!limit.equals(other.limit)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SmsQueryStringInboundMessages [limit=" + limit + "]";
    }
}
