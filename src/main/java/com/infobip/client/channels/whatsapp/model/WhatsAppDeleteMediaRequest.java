
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppDeleteMediaRequest.
 * </p>
 */
public class WhatsAppDeleteMediaRequest {
    private String url;

    public WhatsAppDeleteMediaRequest(String url) {
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
        if (!(obj instanceof WhatsAppDeleteMediaRequest)) {
            return false;
        }
        WhatsAppDeleteMediaRequest other = (WhatsAppDeleteMediaRequest) obj;
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
        return "WhatsAppDeleteMediaRequest [url=" + url + "]";
    }
}
