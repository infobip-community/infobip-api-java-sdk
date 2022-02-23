
package com.infobip.client.channels.rcs.model;

public final class SuggestionTypeReply extends Suggestion {
    /**
     * <p>
     * Create SuggestionTypeReply with required fields.
     * </p>
     *
     * @param text Suggestion text
     * @param postbackData Value which is going to be sent as a reply to a
     *     suggestion
     */
    public SuggestionTypeReply(String text, String postbackData) {
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
        if (!(obj instanceof SuggestionTypeReply)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SuggestionTypeReply [text=" + text + ", postbackData=" + postbackData + ", type="
                + type + "]";
    }
}
