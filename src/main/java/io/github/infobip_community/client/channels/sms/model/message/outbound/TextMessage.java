
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.Valid;
import java.util.List;

public final class TextMessage extends Message<TextMessage> {
    @Valid
    private Language language;
    private String text;
    private Transliteration transliteration;

    /**
     * <p>
     * TextMessage.
     * </p>
     *
     * @param destinations An array of destination objects for where messages are
     *     being sent. A valid destination is required.
     */
    public TextMessage(List<Destination> destinations) {
        super(destinations);
    }

    /**
     * Sets the language parameters for the message being sent.
     */
    public TextMessage language(Language language) {
        this.language = language;
        return this;
    }

    /**
     * Content of the message being sent.
     */
    public TextMessage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * The transliteration of your sent message from one script to another.
     * Transliteration is used to replace characters which are not recognized as
     * part of your defaulted alphabet. Possible values: TURKISH, GREEK, CYRILLIC,
     * SERBIAN_CYRILLIC, CENTRAL_EUROPEAN, BALTIC and NON_UNICODE.
     */
    public TextMessage transliteration(Transliteration transliteration) {
        this.transliteration = transliteration;
        return this;
    }

    public Language getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }

    public Transliteration getTransliteration() {
        return transliteration;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((transliteration == null) ? 0 : transliteration.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof TextMessage)) {
            return false;
        }
        TextMessage other = (TextMessage) obj;
        if (language == null) {
            if (other.language != null) {
                return false;
            }
        } else if (!language.equals(other.language)) {
            return false;
        }
        if (text == null) {
            if (other.text != null) {
                return false;
            }
        } else if (!text.equals(other.text)) {
            return false;
        }
        if (transliteration != other.transliteration) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TextMessage [language=" + language + ", text=" + text + ", transliteration="
                + transliteration + ", callbackData=" + callbackData + ", deliveryTimeWindow="
                + deliveryTimeWindow + ", destinations=" + destinations + ", flash=" + flash
                + ", from=" + from + ", intermediateReport=" + intermediateReport
                + ", notifyContentType=" + notifyContentType + ", notifyUrl=" + notifyUrl
                + ", regional=" + regional + ", sendAt=" + sendAt + ", validityPeriod="
                + validityPeriod + "]";
    }
}
