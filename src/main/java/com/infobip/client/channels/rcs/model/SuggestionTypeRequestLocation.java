
package com.infobip.client.channels.rcs.model;

public final class SuggestionTypeRequestLocation extends Suggestion {
    /**
     * <p>
     * Create SuggestionTypeRequestLocation with required fields.
     * </p>
     *
     * @param text Suggestion text
     * @param postbackData Value which is going to be sent as a reply to a
     *     suggestion
     */
    public SuggestionTypeRequestLocation(String text, String postbackData) {
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
        if (!(obj instanceof SuggestionTypeRequestLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SuggestionTypeRequestLocation [text=" + text + ", postbackData=" + postbackData
                + ", type=" + type + "]";
    }
}
