
package com.infobip.client.channels.whatsapp.model;

public final class HeaderFormatText extends Header {
    private final String text;

    public HeaderFormatText(String text) {
        super(HeaderFormat.TEXT);
        this.text = text;
    }
}
