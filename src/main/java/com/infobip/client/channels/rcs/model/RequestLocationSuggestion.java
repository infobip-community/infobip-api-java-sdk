
package com.infobip.client.channels.rcs.model;

public final class RequestLocationSuggestion extends Suggestion {
    /**
     * <p>
     * RequestLocationSuggestion.
     * </p>
     *
     * @see Suggestion#Suggestion(String, String, SuggestionType)
     */
    public RequestLocationSuggestion(String text, String postbackData) {
        super(text, postbackData, SuggestionType.REQUEST_LOCATION);
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
        if (!(obj instanceof RequestLocationSuggestion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RequestLocationSuggestion [text=" + text + ", postbackData=" + postbackData
                + ", type=" + type + "]";
    }
}
