
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class OpenUrlSuggestion extends Suggestion {
    @NotBlank
    @URL
    private final String url;

    /**
     * <p>
     * OpenUrlSuggestion.
     * </p>
     *
     * @param url URL that will be opened on mobile phone when the suggestion is
     *     selected
     *
     * @see Suggestion#Suggestion(String, String, SuggestionType)
     */
    public OpenUrlSuggestion(String text, String postbackData, String url) {
        super(text, postbackData, SuggestionType.OPEN_URL);
        this.url = url;
    }
}
