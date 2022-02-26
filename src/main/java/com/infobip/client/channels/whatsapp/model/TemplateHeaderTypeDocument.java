
package com.infobip.client.channels.whatsapp.model;

public final class TemplateHeaderTypeDocument extends TemplateHeader {
    private final String mediaUrl;
    private final String filename;

    public TemplateHeaderTypeDocument(String mediaUrl, String filename) {
        super(TemplateHeaderType.DOCUMENT);
        this.mediaUrl = mediaUrl;
        this.filename = filename;
    }
}
