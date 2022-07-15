
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class CardContent extends Content {
    @NotNull
    private final Orientation orientation;
    @NotNull
    private final Alignment alignment;
    @Valid
    @NotNull
    private final ResourceContent content;
    @Valid
    private List<Suggestion> suggestions = new ArrayList<>();

    /**
     * <p>
     * CardContent.
     * </p>
     *
     * @param orientation Orientation type defines orientation in Card message
     * @param alignment Alignment type defines alignment in Card message
     * @param content Card contained within the carousel
     */
    public CardContent(Orientation orientation, Alignment alignment, ResourceContent content) {
        super(ContentType.CARD);
        this.orientation = orientation;
        this.alignment = alignment;
        this.content = content;
    }

    /**
     * List of suggestions.
     */
    public CardContent suggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
        return this;
    }
}
