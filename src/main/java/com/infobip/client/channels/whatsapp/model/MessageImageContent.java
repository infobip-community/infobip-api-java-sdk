
package com.infobip.client.channels.whatsapp.model;

public final class MessageImageContent extends MessageContent {
    private final String mediaUrl;
    private String caption;

    public MessageImageContent(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public MessageImageContent caption(String caption) {
        this.caption = caption;
        return this;
    }
}
