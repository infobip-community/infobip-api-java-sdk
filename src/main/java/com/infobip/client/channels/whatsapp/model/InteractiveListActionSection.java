
package com.infobip.client.channels.whatsapp.model;

import java.util.ArrayList;
import java.util.List;

public final class InteractiveListActionSection {
    private String title;
    private List<InteractiveListActionSectionRow> rows = new ArrayList<>();

    public InteractiveListActionSection(List<InteractiveListActionSectionRow> rows) {
        this.rows = rows;
    }

    public InteractiveListActionSection title(String title) {
        this.title = title;
        return this;
    }
}
