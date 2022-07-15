
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class ShowLocationSuggestion extends Suggestion {
    @Range(min = -90, max = 90)
    private final double latitude;
    @Range(min = -180, max = 180)
    private final double longitude;
    @Size(min = 1, max = 100)
    private String label;

    /**
     * <p>
     * ShowLocationSuggestion.
     * </p>
     *
     * @param latitude Latitude of the location
     * @param longitude Longitude of the location
     *
     * @see Suggestion#Suggestion(String, String, SuggestionType)
     */
    public ShowLocationSuggestion(String text, String postbackData, double latitude,
            double longitude) {
        super(text, postbackData, SuggestionType.SHOW_LOCATION);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Label of the location.
     */
    public ShowLocationSuggestion label(String label) {
        this.label = label;
        return this;
    }
}
