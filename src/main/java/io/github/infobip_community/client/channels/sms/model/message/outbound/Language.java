
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class Language {
    private LanguageCode languageCode;

    /**
     * Language code for the correct character set. Possible values: TR for Turkish,
     * ES for Spanish, PT for Portuguese, or AUTODETECT to let platform select the
     * character set based on message content.
     */
    public Language languageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
        return this;
    }
}
