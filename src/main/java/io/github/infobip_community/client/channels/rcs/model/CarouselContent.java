
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public final class CarouselContent extends Content {
    @NotNull
    private final Width cardWidth;
    @Valid
    @NotNull
    @Size(min = 2, max = 10)
    private List<ResourceContent> contents = new ArrayList<>();
    @Valid
    private List<Suggestion> suggestions = new ArrayList<>();

    /**
     * <p>
     * CarouselContent.
     * </p>
     *
     * @param cardWidth Width of cards contained within the carousel
     * @param contents An array of cards contained within the carousel
     */
    public CarouselContent(Width cardWidth, List<ResourceContent> contents) {
        super(ContentType.CAROUSEL);
        this.cardWidth = cardWidth;
        this.contents = contents;
    }

    /**
     * List of suggestions.
     */
    public CarouselContent suggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
        return this;
    }

    public Width getCardWidth() {
        return cardWidth;
    }

    public List<ResourceContent> getContents() {
        return contents;
    }

    public List<Suggestion> getSuggestions() {
        return suggestions;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((cardWidth == null) ? 0 : cardWidth.hashCode());
        result = prime * result + ((contents == null) ? 0 : contents.hashCode());
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
        if (!(obj instanceof CarouselContent)) {
            return false;
        }
        CarouselContent other = (CarouselContent) obj;
        if (cardWidth != other.cardWidth) {
            return false;
        }
        if (contents == null) {
            if (other.contents != null) {
                return false;
            }
        } else if (!contents.equals(other.contents)) {
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
        return "CarouselContent [cardWidth=" + cardWidth + ", contents=" + contents
                + ", suggestions=" + suggestions + ", type=" + type + "]";
    }
}
