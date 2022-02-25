
package com.infobip.client.channels.whatsapp.model;

import static org.hamcrest.CoreMatchers.theInstance;

public final class MessageLocationContent extends MessageContent {
    private final double latitude;
    private final double longitude;
    private String name;
    private String address;

    public MessageLocationContent(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public MessageLocationContent name(String name) {
        this.name = name;
        return this;
    }

    public MessageLocationContent address(String address) {
        this.address = address;
        return this;
    }
}
