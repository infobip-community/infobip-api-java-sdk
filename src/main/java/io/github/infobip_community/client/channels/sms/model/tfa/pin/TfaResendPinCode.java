
package io.github.infobip_community.client.channels.sms.model.tfa.pin;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class TfaResendPinCode {
    private Map<String, String> placeholders = new HashMap<>();

    /**
     * Key value pairs that will be replaced during message sending. Placeholder
     * keys should NOT contain curly brackets and should NOT contain a pin
     * placeholder. Valid example: "placeholders":{"firstName":"John"}
     */
    public TfaResendPinCode placeholders(Map<String, String> placeholders) {
        this.placeholders = placeholders;
        return this;
    }
}
