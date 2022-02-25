
package com.infobip.client.channels.whatsapp.model;

public final class InteractiveListActionSectionRow {
    private final String id;
    private final String title;
    private String description;

    public InteractiveListActionSectionRow(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public InteractiveListActionSectionRow description(String description) {
        this.description = description;
        return this;
    }
}
