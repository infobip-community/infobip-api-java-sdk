
package io.github.infobip_community.client.channels.whatsapp.model.template;

import io.github.infobip_community.client.channels.whatsapp.model.common.Language;

public final class WhatsAppTemplate extends Template {
    /**
     * <p>
     * WhatsAppTemplate.
     * </p>
     *
     * @see Template#Template(String, Language, Category, Structure)
     */
    public WhatsAppTemplate(String name, Language language, Category category,
            Structure structure) {
        super(name, language, category, structure);
    }

    @Override
    public String toString() {
        return "WhatsAppTemplate [name=" + name + ", language=" + language + ", category="
                + category + ", structure=" + structure + "]";
    }
}
