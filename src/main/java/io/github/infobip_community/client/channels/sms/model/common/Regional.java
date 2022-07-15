
package io.github.infobip_community.client.channels.sms.model.common;

import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class Regional {
    @Valid
    private IndiaDlt indiaDlt;

    /**
     * <p>
     * Regional.
     * </p>
     */
    public Regional() {}

    /**
     * Distributed Ledger Technology (DLT) specific parameters required for sending
     * SMS to phone numbers registered in India.
     */
    public Regional indiaDlt(IndiaDlt indiaDlt) {
        this.indiaDlt = indiaDlt;
        return this;
    }
}
