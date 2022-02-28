
package com.infobip.client.channels.whatsapp.model.message.interactive.button;

public final class Footer {
    private final String text;

    /**
     * <p>
     * Footer.
     * </p>
     *
     * @param text Content of the message footer.
     */
    public Footer(String text) {
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
        if (!(obj instanceof Footer)) {
            return false;
        }
        Footer other = (Footer) obj;
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
        return "Footer [text=" + text + "]";
    }
}
