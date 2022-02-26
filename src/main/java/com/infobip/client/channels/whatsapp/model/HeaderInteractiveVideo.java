
package com.infobip.client.channels.whatsapp.model;

public final class HeaderInteractiveVideo extends HeaderInteractive {
    private final String mediaUrl;

    public HeaderInteractiveVideo(String mediaUrl) {
        super(HeaderInteractiveType.VIDEO);
        this.mediaUrl = mediaUrl;
    }
}
