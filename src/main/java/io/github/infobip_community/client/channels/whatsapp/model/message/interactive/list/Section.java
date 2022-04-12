
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.list;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public final class Section {
    @Size(max = 24)
    private String title;
    @Valid
    @NotEmpty
    @Size(max = 10)
    private List<Row> rows = new ArrayList<>();

    /**
     * <p>
     * Section.
     * </p>
     *
     * @param rows An array of rows sent within a section. Section must contain at
     *     least one row. Message can have up to ten rows.
     */
    public Section(List<Row> rows) {
        this.rows = rows;
    }

    /**
     * Title of the section. Required, if the message has more than one section.
     */
    public Section title(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public List<Row> getRows() {
        return rows;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((rows == null) ? 0 : rows.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Section)) {
            return false;
        }
        Section other = (Section) obj;
        if (rows == null) {
            if (other.rows != null) {
                return false;
            }
        } else if (!rows.equals(other.rows)) {
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
        return "Section [title=" + title + ", rows=" + rows + "]";
    }
}
