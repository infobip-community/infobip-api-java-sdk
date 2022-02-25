
package com.infobip.client.channels.whatsapp.model;

import java.util.ArrayList;
import java.util.List;

public final class InteractiveMultiProductActionSection {
    private String title;
    private List<String> productRetailerIds = new ArrayList<>();

    public InteractiveMultiProductActionSection(List<String> productRetailerIds) {
        this.productRetailerIds = productRetailerIds;
    }

    public InteractiveMultiProductActionSection title(String title) {
        this.title = title;
        return this;
    }
}
