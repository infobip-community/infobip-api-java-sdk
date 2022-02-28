
package com.infobip.client.channels.whatsapp.model.message.template;

public final class UrlButton extends Button {
    /**
     * <p>
     * UrlButton.
     * </p>
     *
     * @param parameter URL extension of a dynamic URL defined in the registered
     *     template.
     */
    public UrlButton(String parameter) {
        super(ButtonType.URL, parameter);
    }

    @Override
    public String toString() {
        return "UrlButton [type=" + type + ", parameter=" + parameter + "]";
    }
}
