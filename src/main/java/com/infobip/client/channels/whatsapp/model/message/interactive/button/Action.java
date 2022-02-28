
package com.infobip.client.channels.whatsapp.model.message.interactive.button;

import java.util.ArrayList;
import java.util.List;

public final class Action {
    private List<Button> buttons = new ArrayList<>();

    /**
     * <p>
     * Action.
     * </p>
     *
     * @param buttons Allows you to specify buttons sent in the message.
     */
    public Action(List<Button> buttons) {
        this.buttons = buttons;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((buttons == null) ? 0 : buttons.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action other = (Action) obj;
        if (buttons == null) {
            if (other.buttons != null) {
                return false;
            }
        } else if (!buttons.equals(other.buttons)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Action [buttons=" + buttons + "]";
    }
}
