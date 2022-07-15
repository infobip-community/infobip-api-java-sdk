
package io.github.infobip_community.client.channels.mms.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
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
}
