
package io.github.infobip_community.client.channels.whatsapp.model.template;

import io.github.infobip_community.client.channels.whatsapp.model.common.Language;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

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
     */
    public Template() {}

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((structure == null) ? 0 : structure.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Template)) {
            return false;
        }
        Template other = (Template) obj;
        if (category != other.category) {
            return false;
        }
        if (language != other.language) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (structure == null) {
            if (other.structure != null) {
                return false;
            }
        } else if (!structure.equals(other.structure)) {
            return false;
        }
        return true;
    }
}
