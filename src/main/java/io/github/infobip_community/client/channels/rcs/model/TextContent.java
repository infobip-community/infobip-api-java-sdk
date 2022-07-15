
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class TextContent extends Content {
    @NotBlank
    @Size(min = 1, max = 1000)
    private final String text;
    @Valid
    private List<Suggestion> suggestions = new ArrayList<>();

    /**
     * <p>
     * TextContent.
     * </p>
     *
     * @param text Message text
     */
    public TextContent(String text) {
        super(ContentType.TEXT);
        this.text = text;
    }

    /**
     * List of suggestions.
     */
    public TextContent suggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
        return this;
    }
}
