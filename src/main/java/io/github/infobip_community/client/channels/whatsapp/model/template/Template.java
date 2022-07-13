
package io.github.infobip_community.client.channels.whatsapp.model.template;

import io.github.infobip_community.client.channels.whatsapp.model.common.Language;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public abstract class Template {
    @NotEmpty
    protected String name;
    @NotNull
    protected Language language;
    @NotNull
    protected Category category;
    @Valid
    @NotNull
    protected Structure structure;

    /**
     * <p>
     * Template.
     * </p>
     *
     * @param name Template name. Must only contain lowercase alphanumeric
     *     characters and underscores.
     * @param language The language code or locale to use. Multiple templates with
     *     different language codes can be registered under the same template name.
     * @param category Category of the template.
     * @param structure Template structure.
     */
    public Template(String name, Language language, Category category, Structure structure) {
        this.name = name;
        this.language = language;
        this.category = category;
        this.structure = structure;
    }
}
