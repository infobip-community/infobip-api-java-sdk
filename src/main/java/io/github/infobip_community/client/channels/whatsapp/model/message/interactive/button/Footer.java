
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.button;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class Footer {
    @NotEmpty
    @Size(max = 60)
    private final String text;

    /**
     * <p>
     * Footer.
     * </p>
     *
     * @param text Content of the message footer.
     */
    public Footer(String text) {
        this.text = text;
    }
}
