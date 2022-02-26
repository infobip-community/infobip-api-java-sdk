
package com.infobip.client.channels.whatsapp.model;

public abstract class TempateButton {
    protected final TemplateButtonType type;
    protected final String parameter;

    public TempateButton(TemplateButtonType type, String parameter) {
        this.type = type;
        this.parameter = parameter;
    }
}
