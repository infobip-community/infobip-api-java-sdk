
package com.infobip.client.channels.whatsapp.model.message.template;

import jakarta.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

public final class Body {
    @NotEmpty
    private List<String> placeholders = new ArrayList<>();

    /**
     * <p>
     * Body.
     * </p>
     *
     * @param placeholders Template's parameters values ordered as registered in the
     *     template. The value must not be null, but can be an empty array if the
     *     template was registered without placeholders. Values within the array
     *     must not be null or empty.
     */
    public Body(List<String> placeholders) {
        this.placeholders = placeholders;
    }

    public List<String> getPlaceholders() {
        return placeholders;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((placeholders == null) ? 0 : placeholders.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Body)) {
            return false;
        }
        Body other = (Body) obj;
        if (placeholders == null) {
            if (other.placeholders != null) {
                return false;
            }
        } else if (!placeholders.equals(other.placeholders)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Body [placeholders=" + placeholders + "]";
    }
}
