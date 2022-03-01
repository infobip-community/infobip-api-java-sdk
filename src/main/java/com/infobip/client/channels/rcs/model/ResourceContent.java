
package com.infobip.client.channels.rcs.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public final class ResourceContent {
    @Size(min = 1, max = 200)
    private String title;
    @Size(min = 1, max = 2000)
    private String description;
    @Valid
    private ResourceMedia media;
    @Valid
    @Size(max = 4)
    private List<Suggestion> suggestions = new ArrayList<>();

    public ResourceContent() {}

    /**
     * Title of the card, displayed as bolded text.
     */
    public ResourceContent title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description of the card, displayed as regular text.
     */
    public ResourceContent description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Object defining display of card media.
     */
    public ResourceContent media(ResourceMedia media) {
        this.media = media;
        return this;
    }

    /**
     * List of suggestions that will be sent in card.
     */
    public ResourceContent suggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public ResourceMedia getMedia() {
        return media;
    }

    public List<Suggestion> getSuggestions() {
        return suggestions;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((media == null) ? 0 : media.hashCode());
        result = prime * result + ((suggestions == null) ? 0 : suggestions.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceContent)) {
            return false;
        }
        ResourceContent other = (ResourceContent) obj;
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (media == null) {
            if (other.media != null) {
                return false;
            }
        } else if (!media.equals(other.media)) {
            return false;
        }
        if (suggestions == null) {
            if (other.suggestions != null) {
                return false;
            }
        } else if (!suggestions.equals(other.suggestions)) {
            return false;
        }
        if (title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!title.equals(other.title)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResourceContent [title=" + title + ", description=" + description + ", media="
                + media + ", suggestions=" + suggestions + "]";
    }
}
