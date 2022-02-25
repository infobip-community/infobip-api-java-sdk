
package com.infobip.client.channels.whatsapp.model;

public final class InteractiveListHeaderText extends InteractiveListHeader {
    private final String text;

    public InteractiveListHeaderText(String text) {
        super(InteractiveListHeaderType.TEXT);
        this.text = text;
    }
}
