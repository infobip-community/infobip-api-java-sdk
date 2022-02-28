
package com.infobip.client.channels.rcs.model;

public final class ReplySuggestion extends Suggestion {
    /**
     * <p>
     * ReplySuggestion.
     * </p>
     *
     * @see Suggestion#Suggestion(String, String, SuggestionType)
     */
    public ReplySuggestion(String text, String postbackData) {
        super(text, postbackData, SuggestionType.REPLY);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof ReplySuggestion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ReplySuggestion [text=" + text + ", postbackData=" + postbackData + ", type="
                + type + "]";
    }
}
