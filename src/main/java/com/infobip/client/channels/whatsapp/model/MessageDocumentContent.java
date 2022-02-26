
package com.infobip.client.channels.whatsapp.model;

public final class MessageDocumentContent extends MessageContent {
    private final String mediaUrl;
    private String caption;
    private String filename;

    public MessageDocumentContent(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public MessageDocumentContent caption(String caption) {
        this.caption = caption;
        return this;
    }

    public MessageDocumentContent filename(String filename) {
        this.filename = filename;
        return this;
    }
}
