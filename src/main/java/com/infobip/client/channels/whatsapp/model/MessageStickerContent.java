
package com.infobip.client.channels.whatsapp.model;

public final class MessageStickerContent extends MessageContent {
    private final String mediaUrl;

    public MessageStickerContent(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }
}
