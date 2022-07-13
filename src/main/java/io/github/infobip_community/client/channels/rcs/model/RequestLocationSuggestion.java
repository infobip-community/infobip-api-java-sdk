
package io.github.infobip_community.client.channels.rcs.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class RequestLocationSuggestion extends Suggestion {
    /**
     * <p>
     * RequestLocationSuggestion.
     * </p>
     *
     * @see Suggestion#Suggestion(String, String, SuggestionType)
     */
    public RequestLocationSuggestion(String text, String postbackData) {
        super(text, postbackData, SuggestionType.REQUEST_LOCATION);
    }
}
