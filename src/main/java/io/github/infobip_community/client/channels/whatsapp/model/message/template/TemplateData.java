
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
public final class TemplateData {
    @Valid
    @NotNull
    private final Body body;
    @Valid
    private Header header;
    @Valid
    private List<Button> buttons = new ArrayList<>();

    /**
     * <p>
     * TemplateData.
     * </p>
     *
     * @param body Template body.
     */
    public TemplateData(Body body) {
        this.body = body;
    }

    /**
     * Template header. Should be defined, only if placeholders or media have been
     * registered in the template's header.
     */
    public TemplateData header(Header header) {
        this.header = header;
        return this;
    }

    /**
     * Template buttons. Should be defined in correct order, only if quick reply or
     * dynamic URL buttons have been registered. It can have up to three quick reply
     * buttons or only one dynamic URL button.
     */
    public TemplateData buttons(List<Button> buttons) {
        this.buttons = buttons;
        return this;
    }
}
