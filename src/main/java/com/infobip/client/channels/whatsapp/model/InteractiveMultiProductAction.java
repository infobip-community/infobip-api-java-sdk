
package com.infobip.client.channels.whatsapp.model;

import java.util.ArrayList;
import java.util.List;

public final class InteractiveMultiProductAction {
    private final String catalogId;
    private List<InteractiveMultiProductActionSection> sections = new ArrayList<>();

    public InteractiveMultiProductAction(String catalogId,
            List<InteractiveMultiProductActionSection> sections) {
        this.catalogId = catalogId;
        this.sections = sections;
    }
}
