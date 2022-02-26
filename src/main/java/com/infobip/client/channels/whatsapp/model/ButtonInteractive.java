
package com.infobip.client.channels.whatsapp.model;

public final class ButtonInteractive {
    private final ButtonInteractiveType type;
    private final String id;
    private final String title;

    public ButtonInteractive(ButtonInteractiveType type, String id, String title) {
        this.type = type;
        this.id = id;
        this.title = title;
    }
}
