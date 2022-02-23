
package com.infobip.client.channels.rcs.model;

import java.util.ArrayList;
import java.util.List;

public final class ContentTypeText extends Content {
    private final String text;
    private List<Suggestion> suggestions = new ArrayList<>();

    /**
     * <p>
     * Create ContentTypeText with required fields.
     * </p>
     *
     * @param text Message text
     */
    public ContentTypeText(String text) {
        super(ContentType.TEXT);
        this.text = text;
    }

    /**
     * List of suggestions.
     */
    public ContentTypeText suggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
        return this;
    }

    public String getText() {
        return text;
    }

    public List<Suggestion> getSuggestions() {
        return suggestions;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((suggestions == null) ? 0 : suggestions.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
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
        if (!(obj instanceof ContentTypeText)) {
            return false;
        }
        ContentTypeText other = (ContentTypeText) obj;
        if (suggestions == null) {
            if (other.suggestions != null) {
                return false;
            }
        } else if (!suggestions.equals(other.suggestions)) {
            return false;
        }
        if (text == null) {
            if (other.text != null) {
                return false;
            }
        } else if (!text.equals(other.text)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ContentTypeText [text=" + text + ", suggestions=" + suggestions + ", type=" + type
                + "]";
    }
}
