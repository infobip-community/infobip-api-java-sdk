
package com.infobip.client.channels.whatsapp.model;

public abstract class InteractiveListHeader {
    private final InteractiveListHeaderType type;

    public InteractiveListHeader(InteractiveListHeaderType type) {
        this.type = type;
    }
}
