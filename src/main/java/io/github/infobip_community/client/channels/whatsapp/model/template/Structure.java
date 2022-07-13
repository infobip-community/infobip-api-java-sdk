
package io.github.infobip_community.client.channels.whatsapp.model.template;

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
public final class Structure {
    @Valid
    private Header header;
    @NotEmpty
    private final String body;
    @Size(max = 60)
    private String footer;
    @Valid
    @Size(max = 3)
    private List<Button> buttons = new ArrayList<>();
    private StructureType type;

    /**
     * <p>
     * Structure.
     * <p>
     *
     * @param body Template body. Can be registered as plain text or text with
     *     placeholders. Placeholders have to be correctly formatted and in the
     *     correct order, regardless of other sections. Example: {{1}}, {{2}},
     *     {{3}}...
     */
    public Structure(String body) {
        this.body = body;
    }

    /**
     * Template header. Can be image, document, video, location or text.
     */
    public Structure header(Header header) {
        this.header = header;
        return this;
    }

    /**
     * Template footer. Plain text, up to 60 characters.
     */
    public Structure footer(String footer) {
        this.footer = footer;
        return this;
    }

    /**
     * Template buttons. Can be either up to 3 quick reply buttons or up to 2 call
     * to action buttons. Call to action buttons must be unique in type.
     */
    public Structure buttons(List<Button> buttons) {
        this.buttons = buttons;
        return this;
    }
}
