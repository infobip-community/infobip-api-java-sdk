
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class CarouselContent extends Content {
    @NotNull
    private final Width cardWidth;
    @Valid
    @NotNull
    @Size(min = 2, max = 10)
    private List<ResourceContent> contents = new ArrayList<>();
    @Valid
    private List<Suggestion> suggestions = new ArrayList<>();

    /**
     * <p>
     * CarouselContent.
     * </p>
     *
     * @param cardWidth Width of cards contained within the carousel
     * @param contents An array of cards contained within the carousel
     */
    public CarouselContent(Width cardWidth, List<ResourceContent> contents) {
        super(ContentType.CAROUSEL);
        this.cardWidth = cardWidth;
        this.contents = contents;
    }

    /**
     * List of suggestions.
     */
    public CarouselContent suggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
        return this;
    }
}
