
package com.infobip.client.channels.whatsapp.model;

public final class InteractiveMultiProductHeaderText extends InteractiveMultiProductHeader {
    private final String text;

    public InteractiveMultiProductHeaderText(String text) {
        super(InteractiveMultiProductHeaderType.TEXT);
        this.text = text;
    }
}
