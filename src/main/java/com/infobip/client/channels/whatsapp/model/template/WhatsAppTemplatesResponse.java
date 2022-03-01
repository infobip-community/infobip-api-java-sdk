
package com.infobip.client.channels.whatsapp.model.template;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * WhatsAppTemplatesResponse.
 * </p>
 */
public final class WhatsAppTemplatesResponse {
    private List<WhatsAppTemplateResponse> templates = new ArrayList<>();

    public WhatsAppTemplatesResponse() {}

    public List<WhatsAppTemplateResponse> getTemplates() {
        return templates;
    }

    public void setTemplates(List<WhatsAppTemplateResponse> templates) {
        this.templates = templates;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((templates == null) ? 0 : templates.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhatsAppTemplatesResponse)) {
            return false;
        }
        WhatsAppTemplatesResponse other = (WhatsAppTemplatesResponse) obj;
        if (templates == null) {
            if (other.templates != null) {
                return false;
            }
        } else if (!templates.equals(other.templates)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WhatsAppTemplatesResponse [templates=" + templates + "]";
    }
}
