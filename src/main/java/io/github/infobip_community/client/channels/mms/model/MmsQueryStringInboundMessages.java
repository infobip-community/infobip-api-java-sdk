
package io.github.infobip_community.client.channels.mms.model;

public final class MmsQueryStringInboundMessages {
    private Integer limit;

    /**
     * <p>
     * MmsQueryStringInboundMessages.
     * </p>
     */
    public MmsQueryStringInboundMessages() {}

    /**
     * Maximal number of delivery reports that will be returned.
     */
    public MmsQueryStringInboundMessages limit(Integer limit) {
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
        if (!(obj instanceof MmsQueryStringInboundMessages)) {
            return false;
        }
        MmsQueryStringInboundMessages other = (MmsQueryStringInboundMessages) obj;
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
        return "MmsQueryStringInboundMessages [limit=" + limit + "]";
    }
}
