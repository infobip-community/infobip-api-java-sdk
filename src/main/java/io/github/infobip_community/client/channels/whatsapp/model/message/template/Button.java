
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
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
}
