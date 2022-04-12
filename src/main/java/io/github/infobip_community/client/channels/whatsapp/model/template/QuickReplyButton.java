
package io.github.infobip_community.client.channels.whatsapp.model.template;

public final class QuickReplyButton extends Button {
    /**
     * <p>
     * QuickReplyButton.
     * </p>
     *
     * @param text {@link Button#Button(ButtonType, String)}
     */
    public QuickReplyButton(String text) {
        super(ButtonType.QUICK_REPLY, text);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof QuickReplyButton)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QuickReplyButton [type=" + type + ", text=" + text + "]";
    }
}
