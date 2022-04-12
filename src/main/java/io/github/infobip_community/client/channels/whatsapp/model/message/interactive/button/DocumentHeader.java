
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.button;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;

public final class DocumentHeader extends Header {
    @NotEmpty
    @Size(max = 2048)
    @URL
    private final String mediaUrl;
    @Size(max = 240)
    private String filename;

    /**
     * <p>
     * DocumentHeader.
     * </p>
     *
     * @param mediaUrl URL of a document sent in the header of a message containing
     *     one or more interactive buttons. Must be a valid URL starting with
     *     https:// or http://. Supported document type is PDF. Maximum document
     *     size is 100MB.
     */
    public DocumentHeader(String mediaUrl) {
        super(HeaderType.DOCUMENT);
        this.mediaUrl = mediaUrl;
    }

    /**
     * Filename of the document.
     */
    public DocumentHeader filename(String filename) {
        this.filename = filename;
        return this;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public String getFilename() {
        return filename;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((filename == null) ? 0 : filename.hashCode());
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
        if (!(obj instanceof DocumentHeader)) {
            return false;
        }
        DocumentHeader other = (DocumentHeader) obj;
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
        return "DocumentHeader [mediaUrl=" + mediaUrl + ", filename=" + filename + ", type=" + type
                + "]";
    }
}
