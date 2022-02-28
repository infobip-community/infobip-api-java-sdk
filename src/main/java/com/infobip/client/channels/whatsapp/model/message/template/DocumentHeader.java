
package com.infobip.client.channels.whatsapp.model.message.template;

public final class DocumentHeader extends Header {
    private final String mediaUrl;
    private final String filename;

    /**
     * <p>
     * DocumentHeader.
     * </p>
     *
     * @param mediaUrl URL of a document sent in the header. It is expected to be a
     *     valid URL starting with https:// or http://. Supported document type is
     *     PDF. Maximum document size is 100MB.
     * @param filename Filename of the document.
     */
    public DocumentHeader(String mediaUrl, String filename) {
        super(HeaderType.DOCUMENT);
        this.mediaUrl = mediaUrl;
        this.filename = filename;
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
