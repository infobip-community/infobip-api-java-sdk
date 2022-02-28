
package com.infobip.client.channels.whatsapp.model.message.template;

import com.infobip.client.channels.whatsapp.model.common.Language;
import com.infobip.client.channels.whatsapp.model.message.MessageContent;

public final class Content extends MessageContent {
    private final String templateName;
    private final TemplateData templateData;
    private final Language language;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param templateName Template name. Should only contain lowercase alphanumeric
     *     characters and underscores.
     * @param templateData Template data. Values have to be set as registered in the
     *     template.
     * @param language The code of language or locale to use. Must be the same code
     *     used when registering the template.
     */
    public Content(String templateName, TemplateData templateData, Language language) {
        this.templateName = templateName;
        this.templateData = templateData;
        this.language = language;
    }

    public String getTemplateName() {
        return templateName;
    }

    public TemplateData getTemplateData() {
        return templateData;
    }

    public Language getLanguage() {
        return language;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + ((templateData == null) ? 0 : templateData.hashCode());
        result = prime * result + ((templateName == null) ? 0 : templateName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content other = (Content) obj;
        if (language != other.language) {
            return false;
        }
        if (templateData == null) {
            if (other.templateData != null) {
                return false;
            }
        } else if (!templateData.equals(other.templateData)) {
            return false;
        }
        if (templateName == null) {
            if (other.templateName != null) {
                return false;
            }
        } else if (!templateName.equals(other.templateName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Content [templateName=" + templateName + ", templateData=" + templateData
                + ", language=" + language + "]";
    }
}
