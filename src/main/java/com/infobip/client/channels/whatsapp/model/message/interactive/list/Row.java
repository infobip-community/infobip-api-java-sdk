
package com.infobip.client.channels.whatsapp.model.message.interactive.list;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public final class Row {
    @NotEmpty
    @Size(max = 200)
    private final String id;
    @NotEmpty
    @Size(max = 24)
    private final String title;
    @Size(max = 72)
    private String description;

    /**
     * <p>
     * Row.
     * </p>
     *
     * @param id Identifier of the row. It must be unique across all sections.
     * @param title Title of the row.
     */
    public Row(String id, String title) {
        this.id = id;
        this.title = title;
    }

    /**
     * Description of the row.
     */
    public Row description(String description) {
        this.description = description;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Row)) {
            return false;
        }
        Row other = (Row) obj;
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
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
        return "Row [id=" + id + ", title=" + title + ", description=" + description + "]";
    }
}
