package io.github.infobip_community.client.channels.whatsapp.model.message.interactive;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class Body {
    @NotEmpty
    @Size(max = 1024)
    private final String text;

    /**
     * <p>
     * Body.
     * </p>
     *
     * @param text Content of the message body.
     */
    public Body(String text) {
        this.text = text;
    }
}