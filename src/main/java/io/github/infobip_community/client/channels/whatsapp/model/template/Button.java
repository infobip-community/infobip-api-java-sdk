
package io.github.infobip_community.client.channels.whatsapp.model.template;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public abstract class Button {
    protected final ButtonType type;
    @NotEmpty
    @Size(max = 200)
    protected final String text;

    /**
     * <p>
     * Button.
     * </p>
     *
     * @param type ButtonType
     * @param text Button text.
     */
    public Button(ButtonType type, String text) {
        this.type = type;
        this.text = text;
    }
}
