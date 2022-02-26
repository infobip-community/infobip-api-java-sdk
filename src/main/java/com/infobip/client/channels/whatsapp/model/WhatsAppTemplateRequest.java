
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppTemplateRequest.
 * </p>
 */
public final class WhatsAppTemplateRequest extends WhatsAppTemplate {
    public WhatsAppTemplateRequest(String name, Language language, Category category,
            Structure structure) {
        super.name = name;
        super.language = language;
        super.category = category;
        super.structure = structure;
    }
}
