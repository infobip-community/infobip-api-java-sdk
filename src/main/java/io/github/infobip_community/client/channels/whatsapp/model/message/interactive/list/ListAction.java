
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.list;

import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.Action;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
public final class ListAction extends Action {
    @NotEmpty
    @Size(max = 20)
    private final String title;
    @Valid
    @NotEmpty
    @Size(max = 10)
    private List<Section> sections;

    /**
     * <p>
     * Action.
     * </p>
     *
     * @param title Title of the list. Does not allow emojis or markdown.
     * @param sections Array of sections in the list.
     */
    public ListAction(String title, List<Section> sections) {
        this.title = title;
        this.sections = sections;
    }
}
