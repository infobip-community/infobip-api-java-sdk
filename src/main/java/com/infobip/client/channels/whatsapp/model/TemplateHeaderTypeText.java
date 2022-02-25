
package com.infobip.client.channels.whatsapp.model;

public final class TemplateHeaderTypeText extends TemplateHeader {
    private final String placeholder;

    public TemplateHeaderTypeText(String placeholder) {
        super(TemplateHeaderType.TEXT);
        this.placeholder = placeholder;
    }
}
