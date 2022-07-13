
package io.github.infobip_community.client.channels.sms.model.tfa.pin;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class TfaQueryStringSendPinCode {
    private boolean ncNeeded = true;

    /**
     * Indicates if Number Lookup is needed before sending the 2FA message. If the
     * parameter value is true, Number Lookup will be requested before sending the
     * SMS. If the value is false, the SMS will be sent without requesting Number
     * Lookup. Field's default value is true.
     */
    public TfaQueryStringSendPinCode ncNeeded(boolean ncNeeded) {
        this.ncNeeded = ncNeeded;
        return this;
    }
}
