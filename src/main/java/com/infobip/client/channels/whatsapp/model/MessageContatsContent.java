
package com.infobip.client.channels.whatsapp.model;

import java.util.ArrayList;
import java.util.List;

public final class MessageContatsContent extends MessageContent {
    private List<Contact> contacts = new ArrayList<>();

    public MessageContatsContent(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
