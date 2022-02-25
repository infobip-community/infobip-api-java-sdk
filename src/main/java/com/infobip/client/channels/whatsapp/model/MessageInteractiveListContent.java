
package com.infobip.client.channels.whatsapp.model;

public final class MessageInteractiveListContent extends MessageContent {
    private final InteractiveListBody body;
    private final InteractiveListAction action;
    private InteractiveListHeader header;
    private InteractiveListFooter footer;

    public MessageInteractiveListContent(InteractiveListBody body, InteractiveListAction action) {
        this.body = body;
        this.action = action;
    }

    public MessageInteractiveListContent header(InteractiveListHeader header) {
        this.header = header;
        return this;
    }

    public MessageInteractiveListContent footer(InteractiveListFooter footer) {
        this.footer = footer;
        return this;
    }
}
