
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.list;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
public final class Section {
    @Size(max = 24)
    private String title;
    @Valid
    @NotEmpty
    @Size(max = 10)
    private List<Row> rows;

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
}
