
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class TextHeader extends Header {
    @NotBlank
    private final String placeholder;

    /**
     * <p>
     * TextHeader.
     * </p>
     *
     * @param placeholder Value of a placeholder in the text header.
     */
    public TextHeader(String placeholder) {
        super(HeaderType.TEXT);
        this.placeholder = placeholder;
    }
}
