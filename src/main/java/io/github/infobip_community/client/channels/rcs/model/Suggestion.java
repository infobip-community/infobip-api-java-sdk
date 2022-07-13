
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public abstract class Suggestion {
    @NotBlank
    @Size(min = 1, max = 25)
    protected final String text;
    @NotBlank
    @Size(min = 1, max = 2048)
    protected final String postbackData;
    protected final SuggestionType type;

    /**
     * <p>
     * Suggestion.
     * </p>
     *
     * @param text Suggestion text
     * @param postbackData Value which is going to be sent as a reply to a
     *     suggestion
     * @param type Suggestion Type
     */
    public Suggestion(String text, String postbackData, SuggestionType type) {
        this.text = text;
        this.postbackData = postbackData;
        this.type = type;
    }
}
