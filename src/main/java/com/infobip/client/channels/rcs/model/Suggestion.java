
package com.infobip.client.channels.rcs.model;

public abstract class Suggestion {
    protected final String text;
    protected final String postbackData;
    protected final SuggestionType type;

    /**
     * <p>
     * Suggestion.
     * </p>
     *
     * @param text Suggestion text
     * @param postbackData Value which is going to be sent as a reply to a
     *     suggestion
     * @param type Suggestion Type
     */
    public Suggestion(String text, String postbackData, SuggestionType type) {
        this.text = text;
        this.postbackData = postbackData;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public String getPostbackData() {
        return postbackData;
    }

    public SuggestionType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((postbackData == null) ? 0 : postbackData.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        Suggestion other = (Suggestion) obj;
        if (postbackData == null) {
            if (other.postbackData != null) {
                return false;
            }
        } else if (!postbackData.equals(other.postbackData)) {
            return false;
        }
        if (text == null) {
            if (other.text != null) {
                return false;
            }
        } else if (!text.equals(other.text)) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        return true;
    }
}
