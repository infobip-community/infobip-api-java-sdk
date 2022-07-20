
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.button;

import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.Action;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
public final class ButtonAction extends Action {
    @Valid
    @NotEmpty
    @Size(max = 3)
    private List<Button> buttons;

    /**
     * <p>
     * Action.
     * </p>
     *
     * @param buttons Allows you to specify buttons sent in the message.
     */
    public ButtonAction(List<Button> buttons) {
        this.buttons = buttons;
    }
}
