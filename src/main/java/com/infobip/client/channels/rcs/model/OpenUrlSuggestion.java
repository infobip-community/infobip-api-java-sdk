
package com.infobip.client.channels.rcs.model;

public final class OpenUrlSuggestion extends Suggestion {
    private final String url;

    /**
     * <p>
     * OpenUrlSuggestion.
     * </p>
     *
     * @param url URL that will be opened on mobile phone when the suggestion is
     *     selected
     *
     * @see Suggestion#Suggestion(String, String, SuggestionType)
     */
    public OpenUrlSuggestion(String text, String postbackData, String url) {
        super(text, postbackData, SuggestionType.OPEN_URL);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((url == null) ? 0 : url.hashCode());
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
        if (!(obj instanceof OpenUrlSuggestion)) {
            return false;
        }
        OpenUrlSuggestion other = (OpenUrlSuggestion) obj;
        if (url == null) {
            if (other.url != null) {
                return false;
            }
        } else if (!url.equals(other.url)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OpenUrlSuggestion [url=" + url + ", text=" + text + ", postbackData=" + postbackData
                + ", type=" + type + "]";
    }
}
