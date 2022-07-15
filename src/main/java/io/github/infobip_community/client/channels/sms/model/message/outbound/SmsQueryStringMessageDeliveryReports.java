
package io.github.infobip_community.client.channels.sms.model.message.outbound;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class SmsQueryStringMessageDeliveryReports {
    private String bulkId;
    private String messageId;
    private Integer limit;

    /**
     * Unique ID assigned to the request if messaging multiple recipients or sending
     * multiple messages via a single API request.
     */
    public SmsQueryStringMessageDeliveryReports bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Unique message ID for which a report is requested.
     */
    public SmsQueryStringMessageDeliveryReports messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Maximum number of delivery reports to be returned. If not set, the latest 50
     * records are returned. Maximum limit value is 1000 and you can only access
     * reports for the last 48h.
     */
    public SmsQueryStringMessageDeliveryReports limit(Integer limit) {
        this.limit = limit;
        return this;
    }
}
