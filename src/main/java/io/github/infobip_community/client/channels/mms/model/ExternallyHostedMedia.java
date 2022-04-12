
package io.github.infobip_community.client.channels.mms.model;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public final class ExternallyHostedMedia {
    @NotBlank
    private final String contentType;
    @NotBlank
    private final String contentId;
    @NotBlank
    @URL
    private final String contentUrl;

    /**
     * <p>
     * ExternallyHostedMedia.
     * </p>
     *
     * @param contentType Content type for media, for example 'image/png'.
     * @param contentId Unique identifier for the content part.
     * @param contentUrl URL for externally hosted content.
     */
    public ExternallyHostedMedia(String contentType, String contentId, String contentUrl) {
        this.contentType = contentType;
        this.contentId = contentId;
        this.contentUrl = contentUrl;
    }

    public String getContentType() {
        return contentType;
    }

    public String getContentId() {
        return contentId;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contentId == null) ? 0 : contentId.hashCode());
        result = prime * result + ((contentType == null) ? 0 : contentType.hashCode());
        result = prime * result + ((contentUrl == null) ? 0 : contentUrl.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternallyHostedMedia)) {
            return false;
        }
        ExternallyHostedMedia other = (ExternallyHostedMedia) obj;
        if (contentId == null) {
            if (other.contentId != null) {
                return false;
            }
        } else if (!contentId.equals(other.contentId)) {
            return false;
        }
        if (contentType == null) {
            if (other.contentType != null) {
                return false;
            }
        } else if (!contentType.equals(other.contentType)) {
            return false;
        }
        if (contentUrl == null) {
            if (other.contentUrl != null) {
                return false;
            }
        } else if (!contentUrl.equals(other.contentUrl)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExternallyHostedMedia [contentType=" + contentType + ", contentId=" + contentId
                + ", contentUrl=" + contentUrl + "]";
    }
}
