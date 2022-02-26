
package com.infobip.client.channels.whatsapp.model;

public final class MessageAudioContent extends MessageContent {
    private final String mediaUrl;

    public MessageAudioContent(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }
}
