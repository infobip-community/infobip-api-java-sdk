
package com.infobip.client.channels.whatsapp.model.message.audio;

import com.infobip.client.channels.whatsapp.model.message.MessageContent;

public final class Content extends MessageContent {
    private final String mediaUrl;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param mediaUrl URL of an audio sent in a WhatsApp message. Must be a valid
     *     URL starting with https:// or http://. Supported audio types are AAC,
     *     AMR, MP3, MP4, OPUS. Maximum audio size is 16MB.
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
