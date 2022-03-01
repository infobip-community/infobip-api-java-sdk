
package com.infobip.client.channels.whatsapp.model.template;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public abstract class Button {
    protected final ButtonType type;
    @NotEmpty
    @Size(max = 200)
    protected final String text;

    /**
     * <p>
     * Button.
     * </p>
     *
     * @param type ButtonType
     * @param text Button text.
     */
    public Button(ButtonType type, String text) {
        this.type = type;
        this.text = text;
    }

    public ButtonType getType() {
        return type;
    }

    public String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button other = (Button) obj;
        if (text == null) {
            if (other.text != null) {
                return false;
            }
        } else if (!text.equals(other.text)) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        return true;
    }
}
