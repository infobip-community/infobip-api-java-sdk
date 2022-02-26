
package com.infobip.client.channels.whatsapp.model;

public final class HeaderInteractiveDocument extends HeaderInteractive {
    private final String mediaUrl;
    private String filename;

    public HeaderInteractiveDocument(String mediaUrl) {
        super(HeaderInteractiveType.DOCUMENT);
        this.mediaUrl = mediaUrl;
    }

    public HeaderInteractiveDocument filename(String filename) {
        this.filename = filename;
        return this;
    }
}
