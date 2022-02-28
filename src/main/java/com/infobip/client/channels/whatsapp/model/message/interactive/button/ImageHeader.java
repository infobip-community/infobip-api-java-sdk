
package com.infobip.client.channels.whatsapp.model.message.interactive.button;

public final class ImageHeader extends Header {
    private final String mediaUrl;

    /**
     * <p>
     * ImageHeader.
     * </p>
     *
     * @param mediaUrl URL of an image sent in the header of a message containing
     *     one or more interactive buttons. Must be a valid URL starting with
     *     https:// or http://. Supported image types are JPG, JPEG, PNG. Maximum
     *     image size is 5MB.
     */
    public ImageHeader(String mediaUrl) {
        super(HeaderType.IMAGE);
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
        if (!(obj instanceof ImageHeader)) {
            return false;
        }
        ImageHeader other = (ImageHeader) obj;
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
        return "ImageHeader [mediaUrl=" + mediaUrl + ", type=" + type + "]";
    }
}
