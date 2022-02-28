
package com.infobip.client.channels.rcs.model;

import java.util.ArrayList;
import java.util.List;

public final class CardContent extends Content {
    private final Orientation orientation;
    private final Alignment alignment;
    private final ResourceContent content;
    private List<Suggestion> suggestions = new ArrayList<>();

    /**
     * <p>
     * CardContent.
     * </p>
     *
     * @param orientation Orientation type defines orientation in Card message
     * @param alignment Alignment type defines alignment in Card message
     * @param content Card contained within the carousel
     */
    public CardContent(Orientation orientation, Alignment alignment, ResourceContent content) {
        super(ContentType.CARD);
        this.orientation = orientation;
        this.alignment = alignment;
        this.content = new ResourceContent();
    }

    /**
     * List of suggestions.
     */
    public CardContent suggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
        return this;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public ResourceContent getContent() {
        return content;
    }

    public List<Suggestion> getSuggestions() {
        return suggestions;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((alignment == null) ? 0 : alignment.hashCode());
        result = prime * result + ((content == null) ? 0 : content.hashCode());
        result = prime * result + ((orientation == null) ? 0 : orientation.hashCode());
        result = prime * result + ((suggestions == null) ? 0 : suggestions.hashCode());
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
        if (!(obj instanceof CardContent)) {
            return false;
        }
        CardContent other = (CardContent) obj;
        if (alignment != other.alignment) {
            return false;
        }
        if (content == null) {
            if (other.content != null) {
                return false;
            }
        } else if (!content.equals(other.content)) {
            return false;
        }
        if (orientation != other.orientation) {
            return false;
        }
        if (suggestions == null) {
            if (other.suggestions != null) {
                return false;
            }
        } else if (!suggestions.equals(other.suggestions)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CardContent [orientation=" + orientation + ", alignment=" + alignment
                + ", content=" + content + ", suggestions=" + suggestions + ", type=" + type + "]";
    }
}
