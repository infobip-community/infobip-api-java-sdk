
package com.infobip.client.channels.whatsapp.model;

public final class HeaderInteractiveText extends HeaderInteractive {
    private final String text;

    public HeaderInteractiveText(String text) {
        super(HeaderInteractiveType.TEXT);
        this.text = text;
    }
}
