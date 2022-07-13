
package io.github.infobip_community.client.channels.whatsapp.model.template;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class TextHeader extends Header {
    @NotEmpty
    @Size(max = 60)
    private final String text;

    /**
     * <p>
     * TextHeader.
     * </p>
     *
     * @param text Template header text. Can contain up to 60 characters, with one
     *     placeholder {{1}}.
     */
    public TextHeader(String text) {
        super(HeaderFormat.TEXT);
        this.text = text;
    }
}
