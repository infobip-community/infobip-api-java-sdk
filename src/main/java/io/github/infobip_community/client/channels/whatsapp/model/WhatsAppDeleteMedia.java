
package io.github.infobip_community.client.channels.whatsapp.model;

import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

/**
 * <p>
 * WhatsAppDeleteMedia.
 * </p>
 */
public final class WhatsAppDeleteMedia {
    @NotEmpty
    @URL
    private final String url;

    public WhatsAppDeleteMedia(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhatsAppDeleteMedia)) {
            return false;
        }
        WhatsAppDeleteMedia other = (WhatsAppDeleteMedia) obj;
        if (url == null) {
            if (other.url != null) {
                return false;
            }
        } else if (!url.equals(other.url)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WhatsAppDeleteMedia [url=" + url + "]";
    }
}
