
package io.github.infobip_community.client.channels.sms.model.tfa.template.response;

import java.util.ArrayList;
import java.util.List;

public final class TfaTemplateResponse {
    private List<TemplateResponse> templates = new ArrayList<>();

    public TfaTemplateResponse() {}

    public List<TemplateResponse> getTemplates() {
        return templates;
    }

    public void setTemplates(List<TemplateResponse> templates) {
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
        if (!(obj instanceof TfaTemplateResponse)) {
            return false;
        }
        TfaTemplateResponse other = (TfaTemplateResponse) obj;
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
        return "TfaTemplateResponse [templates=" + templates + "]";
    }
}
