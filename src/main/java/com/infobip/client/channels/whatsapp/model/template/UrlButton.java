
package com.infobip.client.channels.whatsapp.model.template;

public final class UrlButton extends Button {
    private final String url;

    /**
     * <p>
     * UrlButton.
     * </p>
     *
     * @param text {@link Button#Button(ButtonType, String)}
     * @param url URL to which the end-user will be directed when hitting the
     *     button. URL is expected to start with https:// or http://. Can be static
     *     or dynamic. For dynamic URL registration, add a placeholder {{1}} at the
     *     end of the link. Example: https://www.infobip.com/{{1}}
     */
    public UrlButton(String text, String url) {
        super(ButtonType.URL, text);
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
        if (!(obj instanceof UrlButton)) {
            return false;
        }
        UrlButton other = (UrlButton) obj;
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
        return "UrlButton [url=" + url + ", type=" + type + ", text=" + text + "]";
    }
}
