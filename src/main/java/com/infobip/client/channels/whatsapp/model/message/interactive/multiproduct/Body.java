
package com.infobip.client.channels.whatsapp.model.message.interactive.multiproduct;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public final class Body {
    @NotEmpty
    @Size(max = 1024)
    private final String text;

    /**
     * <p>
     * Body.
     * </p>
     *
     * @param text Content of the message body.
     */
    public Body(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((text == null) ? 0 : text.hashCode());
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
        if (text == null) {
            if (other.text != null) {
                return false;
            }
        } else if (!text.equals(other.text)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Body [text=" + text + "]";
    }
}
