
package com.infobip.client.channels.whatsapp.model;

public final class ButtonTypeUrl extends Button {
    private final String url;

    public ButtonTypeUrl(String text, String url) {
        super(ButtonType.URL, text);
        this.url = url;
    }
}
