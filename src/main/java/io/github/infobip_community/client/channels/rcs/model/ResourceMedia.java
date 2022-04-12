
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public final class ResourceMedia {
    @Valid
    @NotNull
    private final ResourceUrl file;
    @Valid
    private ResourceUrl thumbnail;
    @NotNull
    private final Height height;

    /**
     * <p>
     * ResourceMedia.
     * </p>
     *
     * @param file Resource object describing the thumbnail of the card
     * @param height Height of the card media
     */
    public ResourceMedia(ResourceUrl file, Height height) {
        this.file = file;
        this.height = height;
    }

    /**
     * Resource object describing the thumbnail of the card.
     */
    public ResourceMedia thumbnail(ResourceUrl thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public ResourceUrl getFile() {
        return file;
    }

    public ResourceUrl getThumbnail() {
        return thumbnail;
    }

    public Height getHeight() {
        return height;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((file == null) ? 0 : file.hashCode());
        result = prime * result + ((height == null) ? 0 : height.hashCode());
        result = prime * result + ((thumbnail == null) ? 0 : thumbnail.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceMedia)) {
            return false;
        }
        ResourceMedia other = (ResourceMedia) obj;
        if (file == null) {
            if (other.file != null) {
                return false;
            }
        } else if (!file.equals(other.file)) {
            return false;
        }
        if (height != other.height) {
            return false;
        }
        if (thumbnail == null) {
            if (other.thumbnail != null) {
                return false;
            }
        } else if (!thumbnail.equals(other.thumbnail)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResourceMedia [file=" + file + ", thumbnail=" + thumbnail + ", height=" + height
                + "]";
    }
}
