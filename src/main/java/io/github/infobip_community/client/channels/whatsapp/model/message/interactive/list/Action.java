
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
public final class Action {
    @NotEmpty
    @Size(max = 20)
    private final String title;
    @Valid
    @NotEmpty
    @Size(max = 10)
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
}
