
package com.infobip.client.channels.whatsapp.model;

public final class TemplateHeaderTypeImage extends TemplateHeader {
    private final String mediaUrl;

    public TemplateHeaderTypeImage(String mediaUrl) {
        super(TemplateHeaderType.IMAGE);
        this.mediaUrl = mediaUrl;
    }
}
