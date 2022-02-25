
package com.infobip.client.channels.whatsapp.model;

import java.util.ArrayList;
import java.util.List;

public final class TemplateBody {
    private List<String> placeholders = new ArrayList<>();

    public TemplateBody(List<String> placeholders) {
        this.placeholders = placeholders;
    }
}
