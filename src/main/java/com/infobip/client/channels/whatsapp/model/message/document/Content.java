
package com.infobip.client.channels.whatsapp.model.message.document;

import com.infobip.client.channels.whatsapp.model.message.MessageContent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;

public final class Content extends MessageContent {
    @NotBlank
    @Size(max = 2048)
    @URL
    private final String mediaUrl;
    @Size(max = 3000)
    private String caption;
    @Size(max = 240)
    private String filename;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param mediaUrl URL of a document sent in a WhatsApp message. Must be a valid
     *     URL starting with https:// or http://. Maximum document size is 100MB.
     */
    public Content(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * Caption of the document.
     */
    public Content caption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * File name of the document.
     */
    public Content filename(String filename) {
        this.filename = filename;
        return this;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public String getCaption() {
        return caption;
    }

    public String getFilename() {
        return filename;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((caption == null) ? 0 : caption.hashCode());
        result = prime * result + ((filename == null) ? 0 : filename.hashCode());
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
        if (caption == null) {
            if (other.caption != null) {
                return false;
            }
        } else if (!caption.equals(other.caption)) {
            return false;
        }
        if (filename == null) {
            if (other.filename != null) {
                return false;
            }
        } else if (!filename.equals(other.filename)) {
            return false;
        }
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
        return "Content [mediaUrl=" + mediaUrl + ", caption=" + caption + ", filename=" + filename
                + "]";
    }
}
