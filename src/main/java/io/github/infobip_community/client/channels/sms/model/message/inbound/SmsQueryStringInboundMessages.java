
package io.github.infobip_community.client.channels.sms.model.message.inbound;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
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
}
