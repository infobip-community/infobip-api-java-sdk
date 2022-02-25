
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * </p>
 */
public abstract class WhatsAppTemplate {
    protected String name;
    protected Language language;
    protected Category category;
    protected Structure structure;

    public WhatsAppTemplate() {}

    public WhatsAppTemplate name(String name) {
        this.name = name;
        return this;
    }

    public WhatsAppTemplate language(Language language) {
        this.language = language;
        return this;
    }

    public WhatsAppTemplate category(Category category) {
        this.category = category;
        return this;
    }

    public WhatsAppTemplate structure(Structure structure) {
        this.structure = structure;
        return this;
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
