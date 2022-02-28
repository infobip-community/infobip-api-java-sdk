
package com.infobip.client.channels.whatsapp.model.message.contact;

public final class Url {
    private String url;
    private UrlType type;

    /**
     * <p>
     * Url.
     * </p>
     */
    public Url() {}

    /**
     * Contact's url.
     */
    public Url url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Type of the url. Can be HOME or WORK.
     */
    public Url type(UrlType type) {
        this.type = type;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public UrlType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Url)) {
            return false;
        }
        Url other = (Url) obj;
        if (type != other.type) {
            return false;
        }
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
        return "Url [url=" + url + ", type=" + type + "]";
    }
}
