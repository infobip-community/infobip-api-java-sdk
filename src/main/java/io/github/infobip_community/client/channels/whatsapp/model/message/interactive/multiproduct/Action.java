
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.multiproduct;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public final class Action {
    @NotEmpty
    private final String catalogId;
    @Valid
    @NotEmpty
    @Size(max = 10)
    private List<Section> sections = new ArrayList<>();

    /**
     * <p>
     * Action.
     * </p>
     *
     * @param catalogId The ID that uniquely identifies the <a href=
     *     "https://www.infobip.com/docs/whatsapp/manage-connection#manage-catalog">catalog</a>
     *     registered with Facebook and connected to the WhatsApp Business Account
     *     the sender belongs to.
     * @param sections An array of multi product sections.
     */
    public Action(String catalogId, List<Section> sections) {
        this.catalogId = catalogId;
        this.sections = sections;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public List<Section> getSections() {
        return sections;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((catalogId == null) ? 0 : catalogId.hashCode());
        result = prime * result + ((sections == null) ? 0 : sections.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action other = (Action) obj;
        if (catalogId == null) {
            if (other.catalogId != null) {
                return false;
            }
        } else if (!catalogId.equals(other.catalogId)) {
            return false;
        }
        if (sections == null) {
            if (other.sections != null) {
                return false;
            }
        } else if (!sections.equals(other.sections)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Action [catalogId=" + catalogId + ", sections=" + sections + "]";
    }
}
