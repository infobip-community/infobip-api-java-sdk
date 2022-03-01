
package com.infobip.client.channels.whatsapp.model.message.template;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public final class UrlButton extends Button {
    @NotBlank
    @URL
    private final String parameter;

    /**
     * <p>
     * UrlButton.
     * </p>
     *
     * @param parameter URL extension of a dynamic URL defined in the registered
     *     template.
     */
    public UrlButton(String parameter) {
        super(ButtonType.URL);
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
        if (!(obj instanceof UrlButton)) {
            return false;
        }
        UrlButton other = (UrlButton) obj;
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
        return "UrlButton [parameter=" + parameter + ", type=" + type + "]";
    }
}
