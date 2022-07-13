
package io.github.infobip_community.client.channels.sms.model.tfa.template;

import io.github.infobip_community.client.channels.sms.model.common.Regional;
import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class TfaCreateMessage {
    private Language language;
    private String messageText;
    private Integer pinLength;
    private PinType pinType;
    @Valid
    private Regional regional;
    private String repeatDtmf;
    private String senderId;
    private Double speechRate;

    /**
     * <p>
     * TfaCreateMessage.
     * </p>
     *
     * @param messageText Content of the message being sent which contains at
     *     minimum one placeholder for a PIN code ({{pin}}). Placeholder format is
     *     {{placeholderName}}.
     * @param pinType Type of PIN code that will be generated and sent as part of
     *     2FA message.
     */
    public TfaCreateMessage(String messageText, PinType pinType) {
        this.messageText = messageText;
        this.pinType = pinType;
    }

    /**
     * Content of the message being sent which contains at minimum one placeholder
     * for a PIN code ({{pin}}). Placeholder format is {{placeholderName}}.
     */
    public TfaCreateMessage messageText(String messageText) {
        this.messageText = messageText;
        return this;
    }

    /**
     * The type of PIN code that will be generated and sent as part of a 2FA
     * message.
     */
    public TfaCreateMessage pinType(PinType pinType) {
        this.pinType = pinType;
        return this;
    }

    /**
     * The language code which message is written in used when sending
     * text-to-speech messages. If not defined, it will default to English (en).
     */
    public TfaCreateMessage language(Language language) {
        this.language = language;
        return this;
    }

    /**
     * PIN code length.
     */
    public TfaCreateMessage pinLength(Integer pinLength) {
        this.pinLength = pinLength;
        return this;
    }

    /**
     * Region-specific parameters, often imposed by local laws. Use this, if country
     * or region that you are sending a message to requires additional information.
     */
    public TfaCreateMessage regional(Regional regional) {
        this.regional = regional;
        return this;
    }

    /**
     * If the PIN is sent as a voice message, the DTMF code allows the recipient to
     * replay the message.
     */
    public TfaCreateMessage repeatDtmf(String repeatDtmf) {
        this.repeatDtmf = repeatDtmf;
        return this;
    }

    /**
     * The name that will appear as the sender of the 2FA message (Example:
     * CompanyName).
     */
    public TfaCreateMessage senderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
     * The speed of narration for messages sent as voice. Supported range is from
     * 0.5 to 2.
     */
    public TfaCreateMessage speechRate(Double speechRate) {
        this.speechRate = speechRate;
        return this;
    }
}
