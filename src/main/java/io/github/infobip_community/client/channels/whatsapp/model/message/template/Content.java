
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

import io.github.infobip_community.client.channels.whatsapp.model.common.Language;
import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
public final class Content extends MessageContent {
    @NotBlank
    @Size(min = 1, max = 512)
    private final String templateName;
    @Valid
    @NotNull
    private final TemplateData templateData;
    @NotNull
    private final Language language;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param templateName Template name. Should only contain lowercase alphanumeric
     *     characters and underscores.
     * @param templateData Template data. Values have to be set as registered in the
     *     template.
     * @param language The code of language or locale to use. Must be the same code
     *     used when registering the template.
     */
    public Content(String templateName, TemplateData templateData, Language language) {
        this.templateName = templateName;
        this.templateData = templateData;
        this.language = language;
    }
}
