
package com.infobip.client.channels.whatsapp.model.message.template;

import jakarta.validation.constraints.NotBlank;

public final class TextHeader extends Header {
    @NotBlank
    private final String placeholder;

    /**
     * <p>
     * TextHeader.
     * </p>
     *
     * @param placeholder Value of a placeholder in the text header.
     */
    public TextHeader(String placeholder) {
        super(HeaderType.TEXT);
        this.placeholder = placeholder;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((placeholder == null) ? 0 : placeholder.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof TextHeader)) {
            return false;
        }
        TextHeader other = (TextHeader) obj;
        if (placeholder == null) {
            if (other.placeholder != null) {
                return false;
            }
        } else if (!placeholder.equals(other.placeholder)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TextHeader [placeholder=" + placeholder + ", type=" + type + "]";
    }
}
