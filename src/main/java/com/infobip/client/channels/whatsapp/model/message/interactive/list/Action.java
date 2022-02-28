
package com.infobip.client.channels.whatsapp.model.message.interactive.list;

import java.util.ArrayList;
import java.util.List;

public final class Action {
    private final String title;
    private List<Section> sections = new ArrayList<>();

    /**
     * <p>
     * Action.
     * </p>
     *
     * @param title Title of the list. Does not allow emojis or markdown.
     * @param sections Array of sections in the list.
     */
    public Action(String title, List<Section> sections) {
        this.title = title;
        this.sections = sections;
    }

    public String getTitle() {
        return title;
    }

    public List<Section> getSections() {
        return sections;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sections == null) ? 0 : sections.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action other = (Action) obj;
        if (sections == null) {
            if (other.sections != null) {
                return false;
            }
        } else if (!sections.equals(other.sections)) {
            return false;
        }
        if (title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!title.equals(other.title)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Action [title=" + title + ", sections=" + sections + "]";
    }
}
