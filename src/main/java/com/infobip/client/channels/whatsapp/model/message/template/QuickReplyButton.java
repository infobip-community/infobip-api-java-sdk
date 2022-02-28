
package com.infobip.client.channels.whatsapp.model.message.template;

public final class QuickReplyButton extends Button {
    /**
     * <p>
     * QuickReplyButton.
     * </p>
     *
     * @param parameter Payload of a quick reply button.
     */
    public QuickReplyButton(String parameter) {
        super(ButtonType.QUICK_REPLY, parameter);
    }

    @Override
    public String toString() {
        return "QuickReplyButton [type=" + type + ", parameter=" + parameter + "]";
    }
}
