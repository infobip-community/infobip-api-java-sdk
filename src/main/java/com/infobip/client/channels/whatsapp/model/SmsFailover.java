
package com.infobip.client.channels.whatsapp.model;

public final class SmsFailover {
    private final String from;
    private final String text;

    public SmsFailover(String from, String text) {
        this.from = from;
        this.text = text;
    }
}
