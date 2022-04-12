
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

public abstract class Button {
    protected final ButtonType type;

    /**
     * <p>
     * Button.
     * </p>
     *
     * @param type ButtonType
     */
    public Button(ButtonType type) {
        this.type = type;
    }

    public ButtonType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button other = (Button) obj;
        if (type != other.type) {
            return false;
        }
        return true;
    }
}
