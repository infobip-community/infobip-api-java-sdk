
package com.infobip.client.channels.whatsapp.model;

public final class Url {
    private String url;
    private UrlType type;

    public Url() {}

    public Url url(String url) {
        this.url = url;
        return this;
    }

    public Url type(UrlType type) {
        this.type = type;
        return this;
    }
}
