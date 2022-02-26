
package com.infobip.client.channels.whatsapp.model;

import java.util.ArrayList;
import java.util.List;

public final class InteractiveListAction {
    private final String title;
    private List<InteractiveListActionSection> sections = new ArrayList<>();

    public InteractiveListAction(String title, List<InteractiveListActionSection> sections) {
        this.title = title;
        this.sections = sections;
    }
}
