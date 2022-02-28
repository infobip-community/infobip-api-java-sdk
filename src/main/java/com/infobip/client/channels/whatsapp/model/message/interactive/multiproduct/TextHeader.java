
package com.infobip.client.channels.whatsapp.model.message.interactive.multiproduct;

public final class TextHeader extends Header {
    private final String text;

    /**
     * <p>
     * TextHeader.
     * </p>
     *
     * @param text Content of the multi-product message header.
     */
    public TextHeader(String text) {
        super(HeaderType.TEXT);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((text == null) ? 0 : text.hashCode());
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
        return "TextHeader [text=" + text + ", type=" + type + "]";
    }
}
