
package com.infobip.client.channels.whatsapp.model;

public final class Content {
    private final String templateName;
    private final TemplateData templateData;
    private final Language language;

    public Content(String templateName, TemplateData templateData, Language language) {
        this.templateName = templateName;
        this.templateData = templateData;
        this.language = language;
    }
}
