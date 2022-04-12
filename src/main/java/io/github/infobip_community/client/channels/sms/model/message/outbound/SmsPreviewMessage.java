
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.constraints.NotNull;

public final class SmsPreviewMessage {
    private LanguageCode languageCode;
    @NotNull
    private final String text;
    private Transliteration transliteration;

    /**
     * <p>
     * SmsPreviewMessage.
     * </p>
     *
     * @param text Content of the message being sent.
     */
    public SmsPreviewMessage(String text) {
        this.text = text;
    }

    /**
     * Language code for the correct character set. Possible values: TR for Turkish,
     * ES for Spanish, PT for Portuguese, or AUTODETECT to let platform select the
     * character set based on message content.
     */
    public SmsPreviewMessage languageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * The transliteration of your sent message from one script to another.
     * Transliteration is used to replace characters which are not recognized as
     * part of your defaulted alphabet. Possible values: TURKISH, GREEK, CYRILLIC,
     * SERBIAN_CYRILLIC, CENTRAL_EUROPEAN, BALTIC and NON_UNICODE.
     */
    public SmsPreviewMessage transliteration(Transliteration transliteration) {
        this.transliteration = transliteration;
        return this;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
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
        int result = 1;
        result = prime * result + ((languageCode == null) ? 0 : languageCode.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((transliteration == null) ? 0 : transliteration.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsPreviewMessage)) {
            return false;
        }
        SmsPreviewMessage other = (SmsPreviewMessage) obj;
        if (languageCode != other.languageCode) {
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
        return "SmsPreviewMessage [languageCode=" + languageCode + ", text=" + text
                + ", transliteration=" + transliteration + "]";
    }
}
