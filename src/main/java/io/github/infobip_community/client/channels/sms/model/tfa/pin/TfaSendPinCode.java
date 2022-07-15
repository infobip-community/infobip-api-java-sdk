
package io.github.infobip_community.client.channels.sms.model.tfa.pin;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@EqualsAndHashCode
@ToString
public final class TfaSendPinCode {
    @NotBlank
    private final String applicationId;
    private String from;
    @NotBlank
    private final String messageId;
    private Map<String, String> placeholders = new HashMap<>();
    @NotBlank
    private final String to;

    /**
     * <p>
     * TfaSendPinCode.
     * </p>
     *
     * @param applicationId The ID of the application that represents your service,
     *     e.g. 2FA for login, 2FA for changing the password, etc.
     * @param messageId The ID of the message template (message body with the PIN
     *     placeholder) that is sent to the recipient.
     * @param to Phone number to which the 2FA message will be sent. Example:
     *     41793026727.
     */
    public TfaSendPinCode(String applicationId, String messageId, String to) {
        this.applicationId = applicationId;
        this.messageId = messageId;
        this.to = to;
    }

    /**
     * Use this parameter if you wish to override the sender ID from the created
     * message template parameter senderId.
     */
    public TfaSendPinCode from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Key value pairs that will be replaced during message sending. Placeholder
     * keys should NOT contain curly brackets and should NOT contain a pin
     * placeholder. Valid example: "placeholders":{"firstName":"John"}
     */
    public TfaSendPinCode placeholders(Map<String, String> placeholders) {
        this.placeholders = placeholders;
        return this;
    }
}
