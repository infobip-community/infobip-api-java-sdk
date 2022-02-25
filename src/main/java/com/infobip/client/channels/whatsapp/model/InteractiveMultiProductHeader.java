
package com.infobip.client.channels.whatsapp.model;

public abstract class InteractiveMultiProductHeader {
    private final InteractiveMultiProductHeaderType type;

    public InteractiveMultiProductHeader(InteractiveMultiProductHeaderType type) {
        this.type = type;
    }
}
