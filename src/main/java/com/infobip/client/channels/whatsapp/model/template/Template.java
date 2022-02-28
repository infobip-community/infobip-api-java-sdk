
package com.infobip.client.channels.whatsapp.model.template;

import com.infobip.client.channels.whatsapp.model.common.Language;

public abstract class Template {
    protected String name;
    protected Language language;
    protected Category category;
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
}
