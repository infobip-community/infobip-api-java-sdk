
package io.github.infobip_community.client.channels.sms.model.tfa.template;

import io.github.infobip_community.client.channels.sms.model.common.Regional;
import jakarta.validation.Valid;

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
     */
    public TfaCreateMessage() {}

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

    public Language getLanguage() {
        return language;
    }

    public String getMessageText() {
        return messageText;
    }

    public Integer getPinLength() {
        return pinLength;
    }

    public PinType getPinType() {
        return pinType;
    }

    public Regional getRegional() {
        return regional;
    }

    public String getRepeatDtmf() {
        return repeatDtmf;
    }

    public String getSenderId() {
        return senderId;
    }

    public Double getSpeechRate() {
        return speechRate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + ((messageText == null) ? 0 : messageText.hashCode());
        result = prime * result + ((pinLength == null) ? 0 : pinLength.hashCode());
        result = prime * result + ((pinType == null) ? 0 : pinType.hashCode());
        result = prime * result + ((regional == null) ? 0 : regional.hashCode());
        result = prime * result + ((repeatDtmf == null) ? 0 : repeatDtmf.hashCode());
        result = prime * result + ((senderId == null) ? 0 : senderId.hashCode());
        result = prime * result + ((speechRate == null) ? 0 : speechRate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TfaCreateMessage)) {
            return false;
        }
        TfaCreateMessage other = (TfaCreateMessage) obj;
        if (language != other.language) {
            return false;
        }
        if (messageText == null) {
            if (other.messageText != null) {
                return false;
            }
        } else if (!messageText.equals(other.messageText)) {
            return false;
        }
        if (pinLength == null) {
            if (other.pinLength != null) {
                return false;
            }
        } else if (!pinLength.equals(other.pinLength)) {
            return false;
        }
        if (pinType != other.pinType) {
            return false;
        }
        if (regional == null) {
            if (other.regional != null) {
                return false;
            }
        } else if (!regional.equals(other.regional)) {
            return false;
        }
        if (repeatDtmf == null) {
            if (other.repeatDtmf != null) {
                return false;
            }
        } else if (!repeatDtmf.equals(other.repeatDtmf)) {
            return false;
        }
        if (senderId == null) {
            if (other.senderId != null) {
                return false;
            }
        } else if (!senderId.equals(other.senderId)) {
            return false;
        }
        if (speechRate == null) {
            if (other.speechRate != null) {
                return false;
            }
        } else if (!speechRate.equals(other.speechRate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TfaCreateMessage [language=" + language + ", messageText=" + messageText
                + ", pinLength=" + pinLength + ", pinType=" + pinType + ", regional=" + regional
                + ", repeatDtmf=" + repeatDtmf + ", senderId=" + senderId + ", speechRate="
                + speechRate + "]";
    }
}
