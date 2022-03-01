
package com.infobip.client.channels.whatsapp.model.message.template;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public final class QuickReplyButton extends Button {
    @NotBlank
    @Size(max = 128)
    private final String parameter;

    /**
     * <p>
     * QuickReplyButton.
     * </p>
     *
     * @param parameter Payload of a quick reply button.
     */
    public QuickReplyButton(String parameter) {
        super(ButtonType.QUICK_REPLY);
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((parameter == null) ? 0 : parameter.hashCode());
        return result;
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
        QuickReplyButton other = (QuickReplyButton) obj;
        if (parameter == null) {
            if (other.parameter != null) {
                return false;
            }
        } else if (!parameter.equals(other.parameter)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QuickReplyButton [parameter=" + parameter + ", type=" + type + "]";
    }
}
