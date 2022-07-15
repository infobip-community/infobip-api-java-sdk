
package io.github.infobip_community.client.channels.email.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class EmailQueryStringDeliveryReports {
    private String bulkId;
    private String messageId;
    private Integer limit;

    /**
     * Bulk ID for which report is requested.
     */
    public EmailQueryStringDeliveryReports bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * The ID that uniquely identifies the sent email.
     */
    public EmailQueryStringDeliveryReports messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Maximum number of reports.
     */
    public EmailQueryStringDeliveryReports limit(Integer limit) {
        this.limit = limit;
        return this;
    }
}
