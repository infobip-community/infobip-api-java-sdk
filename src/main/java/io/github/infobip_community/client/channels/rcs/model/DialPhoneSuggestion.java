
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class DialPhoneSuggestion extends Suggestion {
    @Size(min = 5, max = 15)
    private String phoneNumber;

    /**
     * <p>
     * DialPhoneSuggestion.
     * </p>
     *
     * @see Suggestion#Suggestion(String, String, SuggestionType)
     */
    public DialPhoneSuggestion(String text, String postbackData) {
        super(text, postbackData, SuggestionType.DIAL_PHONE);
    }

    /**
     * Valid phone number.
     */
    public DialPhoneSuggestion phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
