
package com.infobip.client.channels.rcs.model;

public final class ResourceUrl {
    private final String url;

    /**
     * <p>
     * Create ResourceUrl with required fields.
     * </p>
     *
     * @param url URL of the given resource
     */
    public ResourceUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceUrl)) {
            return false;
        }
        ResourceUrl other = (ResourceUrl) obj;
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
        return "ResourceUrl [url=" + url + "]";
    }
}
