
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.list;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
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
}
