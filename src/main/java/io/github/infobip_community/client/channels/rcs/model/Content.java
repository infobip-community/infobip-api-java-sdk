
package io.github.infobip_community.client.channels.rcs.model;

public abstract class Content {
    protected final ContentType type;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @param type Message type, describing type of message which is going to be
     *     sent over RCS
     */
    public Content(ContentType type) {
        this.type = type;
    }

    public ContentType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
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
        if (type != other.type) {
            return false;
        }
        return true;
    }
}
