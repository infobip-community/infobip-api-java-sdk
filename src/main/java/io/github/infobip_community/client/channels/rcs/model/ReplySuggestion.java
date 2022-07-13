
package io.github.infobip_community.client.channels.rcs.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public final class ReplySuggestion extends Suggestion {
    /**
     * <p>
     * ReplySuggestion.
     * </p>
     *
     * @see Suggestion#Suggestion(String, String, SuggestionType)
     */
    public ReplySuggestion(String text, String postbackData) {
        super(text, postbackData, SuggestionType.REPLY);
    }
}
