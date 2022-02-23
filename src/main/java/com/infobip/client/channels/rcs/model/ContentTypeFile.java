
package com.infobip.client.channels.rcs.model;

public final class ContentTypeFile extends Content {
    private final ResourceUrl file;
    private ResourceUrl thumbnail;

    /**
     * <p>
     * Create ContentTypeFile with required fields.
     * </p>
     *
     * @param file URL of the given resource
     */
    public ContentTypeFile(ResourceUrl file) {
        super(ContentType.FILE);
        this.file = file;
    }

    /**
     * Resource object describing the thumbnail.
     */
    public ContentTypeFile thumbnail(ResourceUrl thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public ResourceUrl getFile() {
        return file;
    }

    public ResourceUrl getThumbnail() {
        return thumbnail;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((file == null) ? 0 : file.hashCode());
        result = prime * result + ((thumbnail == null) ? 0 : thumbnail.hashCode());
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
        if (!(obj instanceof ContentTypeFile)) {
            return false;
        }
        ContentTypeFile other = (ContentTypeFile) obj;
        if (file == null) {
            if (other.file != null) {
                return false;
            }
        } else if (!file.equals(other.file)) {
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
        return "ContentTypeFile [file=" + file + ", thumbnail=" + thumbnail + ", type=" + type
                + "]";
    }
}
