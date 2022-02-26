
package com.infobip.client.channels.whatsapp.model;

public abstract class Button {
    private final ButtonType type;
    private final String text;

    public Button(ButtonType type, String text) {
        this.type = type;
        this.text = text;
    }
}
