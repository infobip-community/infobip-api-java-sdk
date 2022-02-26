
package com.infobip.client.channels.whatsapp.model;

public final class TemplateHeaderTypeVideo extends TemplateHeader {
    private final String mediaUrl;

    public TemplateHeaderTypeVideo(String mediaUrl) {
        super(TemplateHeaderType.VIDEO);
        this.mediaUrl = mediaUrl;
    }
}
