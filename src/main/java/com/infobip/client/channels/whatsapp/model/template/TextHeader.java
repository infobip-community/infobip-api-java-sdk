
package com.infobip.client.channels.whatsapp.model.template;

public final class TextHeader extends Header {
    private final String text;

    /**
     * <p>
     * TextHeader.
     * </p>
     *
     * @param text Template header text. Can contain up to 60 characters, with one
     *     placeholder {{1}}.
     */
    public TextHeader(String text) {
        super(HeaderFormat.TEXT);
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextHeader [text=" + text + ", format=" + format + "]";
    }
}
