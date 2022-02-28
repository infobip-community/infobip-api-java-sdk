
package com.infobip.client.channels.whatsapp.model.message.interactive.button;

public final class VideoHeader extends Header {
    private final String mediaUrl;

    /**
     * <p>
     * VideoHeader.
     * </p>
     *
     * @param mediaUrl URL of a video sent in the header of a message containing one
     *     or more interactive buttons. Must be a valid URL starting with https://
     *     or http://. Supported video types are MP4, 3GPP. Maximum video size is
     *     16MB.
     */
    public VideoHeader(String mediaUrl) {
        super(HeaderType.VIDEO);
        this.mediaUrl = mediaUrl;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((mediaUrl == null) ? 0 : mediaUrl.hashCode());
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
        if (!(obj instanceof VideoHeader)) {
            return false;
        }
        VideoHeader other = (VideoHeader) obj;
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
        return "VideoHeader [mediaUrl=" + mediaUrl + ", type=" + type + "]";
    }
}
