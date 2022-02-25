
package com.infobip.client.channels.whatsapp.model;

public final class HeaderInteractiveImage extends HeaderInteractive {
    private final String mediaUrl;

    public HeaderInteractiveImage(String mediaUrl) {
        super(HeaderInteractiveType.IMAGE);
        this.mediaUrl = mediaUrl;
    }
}
