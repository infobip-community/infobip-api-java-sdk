
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class ResourceContent {
    @Size(min = 1, max = 200)
    private String title;
    @Size(min = 1, max = 2000)
    private String description;
    @Valid
    private ResourceMedia media;
    @Valid
    @Size(max = 4)
    private List<Suggestion> suggestions = new ArrayList<>();

    /**
     * Title of the card, displayed as bolded text.
     */
    public ResourceContent title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description of the card, displayed as regular text.
     */
    public ResourceContent description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Object defining display of card media.
     */
    public ResourceContent media(ResourceMedia media) {
        this.media = media;
        return this;
    }

    /**
     * List of suggestions that will be sent in card.
     */
    public ResourceContent suggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
        return this;
    }
}
