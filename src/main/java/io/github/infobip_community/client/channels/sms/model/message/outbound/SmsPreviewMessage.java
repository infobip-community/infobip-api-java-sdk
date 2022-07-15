
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
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
}
