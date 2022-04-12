
package io.github.infobip_community.client.channels.sms.model.message.outbound;

public final class Language {
    private LanguageCode languageCode;

    /**
     * <p>
     * Language.
     * </p>
     */
    public Language() {}

    /**
     * Language code for the correct character set. Possible values: TR for Turkish,
     * ES for Spanish, PT for Portuguese, or AUTODETECT to let platform select the
     * character set based on message content.
     */
    public Language languageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((languageCode == null) ? 0 : languageCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Language)) {
            return false;
        }
        Language other = (Language) obj;
        if (languageCode != other.languageCode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Language [languageCode=" + languageCode + "]";
    }
}
