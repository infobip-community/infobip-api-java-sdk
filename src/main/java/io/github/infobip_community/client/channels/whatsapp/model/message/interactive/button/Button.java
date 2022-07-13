
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.button;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class Button {
    @NotNull
    private final ButtonType type;
    @NotEmpty
    @Size(max = 256)
    private final String id;
    @NotEmpty
    @Size(max = 20)
    private final String title;

    /**
     * <p>
     * Button.
     * </p>
     *
     * @param type ButtonType
     * @param id Unique identifier of the button.
     * @param title Unique title of the button. Doesn't allow emojis or markdown.
     */
    public Button(ButtonType type, String id, String title) {
        this.type = type;
        this.id = id;
        this.title = title;
    }
}
