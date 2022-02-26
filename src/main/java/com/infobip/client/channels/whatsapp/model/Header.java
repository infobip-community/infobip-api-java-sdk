
package com.infobip.client.channels.whatsapp.model;

public abstract class Header {
    private final HeaderFormat format;

    public Header(HeaderFormat format) {
        this.format = format;
    }
}
