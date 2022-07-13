
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.button;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
public final class Action {
    @Valid
    @NotEmpty
    @Size(max = 3)
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
}
