
package com.infobip.client.channels.whatsapp.model;

import java.util.ArrayList;
import java.util.List;

public final class Action {
    private List<ButtonInteractive> buttons = new ArrayList<>();

    public Action(List<ButtonInteractive> buttons) {
        this.buttons = buttons;
    }
}
