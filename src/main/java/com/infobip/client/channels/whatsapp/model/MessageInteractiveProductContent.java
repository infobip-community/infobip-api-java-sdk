
package com.infobip.client.channels.whatsapp.model;

public final class MessageInteractiveProductContent extends MessageContent {
    private final InteractiveProductAction action;
    private InteractiveProductBody body;
    private InteractiveProductFooter footer;

    public MessageInteractiveProductContent(InteractiveProductAction action) {
        this.action = action;
    }

    public MessageInteractiveProductContent body(InteractiveProductBody body) {
        this.body = body;
        return this;
    }

    public MessageInteractiveProductContent footer(InteractiveProductFooter footer) {
        this.footer = footer;
        return this;
    }
}
