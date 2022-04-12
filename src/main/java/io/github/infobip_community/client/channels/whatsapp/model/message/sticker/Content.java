
package io.github.infobip_community.client.channels.whatsapp.model.message.sticker;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;

public final class Content extends MessageContent {
    @NotBlank
    @Size(max = 2048)
    @URL
    private final String mediaUrl;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param mediaUrl URL of a sticker sent in a WhatsApp message. Must be a valid
     *     URL starting with https:// or http://. Supported sticker type is WebP.
     *     Sticker file should be 512x512 pixels. Maximum sticker size is 100KB.
     */
    public Content(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mediaUrl == null) ? 0 : mediaUrl.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content other = (Content) obj;
        if (mediaUrl == null) {
            if (other.mediaUrl != null) {
                return false;
            }
        } else if (!mediaUrl.equals(other.mediaUrl)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Content [mediaUrl=" + mediaUrl + "]";
    }
}
