
package com.infobip.client.channels.rcs.model;

public final class SuggestionTypeOpenUrl extends Suggestion {
    private final String url;

    /**
     * <p>
     * Create SuggestionTypeOpenUrl with required fields.
     * </p>
     *
     * @param text Suggestion text
     * @param postbackData Value which is going to be sent as a reply to a
     *     suggestion
     * @param url URL that will be opened on mobile phone when the suggestion is
     *     selected
     */
    public SuggestionTypeOpenUrl(String text, String postbackData, String url) {
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
        if (!(obj instanceof SuggestionTypeOpenUrl)) {
            return false;
        }
        SuggestionTypeOpenUrl other = (SuggestionTypeOpenUrl) obj;
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
        return "SuggestionTypeOpenUrl [url=" + url + ", text=" + text + ", postbackData="
                + postbackData + ", type=" + type + "]";
    }
}
