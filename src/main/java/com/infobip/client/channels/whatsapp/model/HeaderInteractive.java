
package com.infobip.client.channels.whatsapp.model;

public abstract class HeaderInteractive {
    private final HeaderInteractiveType type;

    public HeaderInteractive(HeaderInteractiveType type) {
        this.type = type;
    }
}
