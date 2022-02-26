
package com.infobip.client.channels.whatsapp.model;

public final class MessageInteractiveMultiProductContent extends MessageContent {
    private final InteractiveMultiProductHeader header;
    private final InteractiveMultiProductBody body;
    private final InteractiveMultiProductAction action;
    private InteractiveMultiProductFooter footer;

    public MessageInteractiveMultiProductContent(InteractiveMultiProductHeader header,
            InteractiveMultiProductBody body, InteractiveMultiProductAction action) {
        this.header = header;
        this.body = body;
        this.action = action;
    }

    public MessageInteractiveMultiProductContent footer(InteractiveMultiProductFooter footer) {
        this.footer = footer;
        return this;
    }
}
