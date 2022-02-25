
package com.infobip.client.channels.whatsapp.model;

import java.util.ArrayList;
import java.util.List;

public final class Structure {
    private Header header;
    private final String body;
    private String footer;
    private List<Button> buttons = new ArrayList<>();
    private StructureType type; // TODO: not present in request ...

    public Structure(String body) {
        this.body = body;
    }

    public Structure header(Header header) {
        this.header = header;
        return this;
    }

    public Structure footer(String footer) {
        this.footer = footer;
        return this;
    }

    public Structure buttons(List<Button> buttons) {
        this.buttons = buttons;
        return this;
    }

    public Structure type(StructureType type) {
        this.type = type;
        return this;
    }
}
