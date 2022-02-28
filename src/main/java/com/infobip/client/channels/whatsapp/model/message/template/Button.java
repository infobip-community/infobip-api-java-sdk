
package com.infobip.client.channels.whatsapp.model.message.template;

public abstract class Button {
    protected final ButtonType type;
    protected final String parameter;

    /**
     * <p>
     * Button.
     * </p>
     *
     * @param type ButtonType
     * @param parameter Payload.
     */
    public Button(ButtonType type, String parameter) {
        this.type = type;
        this.parameter = parameter;
    }

    public ButtonType getType() {
        return type;
    }

    public String getParameter() {
        return parameter;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((parameter == null) ? 0 : parameter.hashCode());
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
        if (parameter == null) {
            if (other.parameter != null) {
                return false;
            }
        } else if (!parameter.equals(other.parameter)) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        return true;
    }
}
