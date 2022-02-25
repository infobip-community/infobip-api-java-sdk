
package com.infobip.client.channels.whatsapp.model;

public abstract class TemplateHeader {
    private final TemplateHeaderType type;

    public TemplateHeader(TemplateHeaderType type) {
        this.type = type;
    }
}
