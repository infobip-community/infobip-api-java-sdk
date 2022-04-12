
package io.github.infobip_community.client.channels.sms.model.tfa.pin;

import java.util.HashMap;
import java.util.Map;

public final class TfaResendPinCode {
    private Map<String, String> placeholders = new HashMap<>();

    /**
     * <p>
     * TfaResendPinCode.
     * </p>
     */
    public TfaResendPinCode() {}

    /**
     * Key value pairs that will be replaced during message sending. Placeholder
     * keys should NOT contain curly brackets and should NOT contain a pin
     * placeholder. Valid example: "placeholders":{"firstName":"John"}
     */
    public TfaResendPinCode placeholders(Map<String, String> placeholders) {
        this.placeholders = placeholders;
        return this;
    }

    public Map<String, String> getPlaceholders() {
        return placeholders;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((placeholders == null) ? 0 : placeholders.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TfaResendPinCode)) {
            return false;
        }
        TfaResendPinCode other = (TfaResendPinCode) obj;
        if (placeholders == null) {
            if (other.placeholders != null) {
                return false;
            }
        } else if (!placeholders.equals(other.placeholders)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TfaResendPinCode [placeholders=" + placeholders + "]";
    }
}
