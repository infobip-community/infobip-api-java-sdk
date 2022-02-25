
package com.infobip.client.channels.whatsapp.model;

public final class MessageInteractiveButtonsContent extends MessageContent {
    private final Body body;
    private final Action action;
    private HeaderInteractive header;
    private FooterInteractive footer;

    public MessageInteractiveButtonsContent(Body body, Action action) {
        this.body = body;
        this.action = action;
    }

    public MessageInteractiveButtonsContent header(HeaderInteractive header) {
        this.header = header;
        return this;
    }

    public MessageInteractiveButtonsContent footer(FooterInteractive footer) {
        this.footer = footer;
        return this;
    }
}
