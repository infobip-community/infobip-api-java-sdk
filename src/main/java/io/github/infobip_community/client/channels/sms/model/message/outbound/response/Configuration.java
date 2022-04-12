
package io.github.infobip_community.client.channels.sms.model.message.outbound.response;

import io.github.infobip_community.client.channels.sms.model.message.outbound.Language;
import io.github.infobip_community.client.channels.sms.model.message.outbound.Transliteration;

public final class Configuration {
    private Language language;
    private Transliteration transliteration;

    public Configuration() {}

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Transliteration getTransliteration() {
        return transliteration;
    }

    public void setTransliteration(Transliteration transliteration) {
        this.transliteration = transliteration;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + ((transliteration == null) ? 0 : transliteration.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration other = (Configuration) obj;
        if (language == null) {
            if (other.language != null) {
                return false;
            }
        } else if (!language.equals(other.language)) {
            return false;
        }
        if (transliteration != other.transliteration) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Configuration [language=" + language + ", transliteration=" + transliteration
                + "]";
    }
}
