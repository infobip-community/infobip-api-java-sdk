
package com.infobip.client.channels.whatsapp.model;

public final class MessageVideoContent extends MessageContent {
    private final String mediaUrl;
    private String caption;

    public MessageVideoContent(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public MessageVideoContent caption(String caption) {
        this.caption = caption;
        return this;
    }
}
