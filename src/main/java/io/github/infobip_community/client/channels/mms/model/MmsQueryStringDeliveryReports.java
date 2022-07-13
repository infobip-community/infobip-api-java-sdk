
package io.github.infobip_community.client.channels.mms.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class MmsQueryStringDeliveryReports {
    private String bulkId;
    private String messageId;
    private Integer limit;

    /**
     * <p>
     * MmsQueryStringDeliveryReports.
     * </p>
     */
    public MmsQueryStringDeliveryReports() {}

    /**
     * ID of bulk which delivery report is requested.
     */
    public MmsQueryStringDeliveryReports bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * ID of MMS which delivery report is requested.
     */
    public MmsQueryStringDeliveryReports messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Maximal number of delivery reports that will be returned.
     */
    public MmsQueryStringDeliveryReports limit(Integer limit) {
        this.limit = limit;
        return this;
    }
}
