
package com.infobip.client.channels.whatsapp.model;

import java.util.ArrayList;
import java.util.List;

public final class TemplateData {
    private final TemplateBody body;
    private TemplateHeader header;
    private List<TempateButton> buttons = new ArrayList<>();

    public TemplateData(TemplateBody body) {
        this.body = body;
    }

    public TemplateData header(TemplateHeader header) {
        this.header = header;
        return this;
    }

    public TemplateData buttons(List<TempateButton> buttons) {
        this.buttons = buttons;
        return this;
    }
}
