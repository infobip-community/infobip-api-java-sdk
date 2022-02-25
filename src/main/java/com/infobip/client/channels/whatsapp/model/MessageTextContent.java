
package com.infobip.client.channels.whatsapp.model;

public final class MessageTextContent extends MessageContent {
    private final String text;
    private boolean previewUrl = false;

    public MessageTextContent(String text) {
        this.text = text;
    }

    public MessageTextContent previewUrl(boolean previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    public String getText() {
        return text;
    }

    public boolean isPreviewUrl() {
        return previewUrl;
    }

    @Override
    public String toString() {
        return "MessageTextContent [text=" + text + ", previewUrl=" + previewUrl + "]";
    }
}
