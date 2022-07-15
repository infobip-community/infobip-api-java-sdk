
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class Tracking {
    private String baseUrl;
    private String processKey;
    private ConversionRateTrack track;
    private ConversionType type;

    /**
     * <p>
     * Tracking.<br>
     * Sets up tracking parameters to track conversion metrics and type
     * </p>
     */
    public Tracking() {}

    /**
     * Custom base URL for shortened links in messages when tracking URL
     * conversions.
     */
    public Tracking baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    /**
     * The process key which uniquely identifies conversion tracking.
     */
    public Tracking processKey(String processKey) {
        this.processKey = processKey;
        return this;
    }

    /**
     * Indicates if a message has to be tracked for conversion rates. Values are:
     * SMS and URL.
     */
    public Tracking track(ConversionRateTrack track) {
        this.track = track;
        return this;
    }

    /**
     * Sets a custom conversion type naming convention, e.g. ONE_TIME_PIN or
     * SOCIAL_INVITES.
     */
    public Tracking type(ConversionType type) {
        this.type = type;
        return this;
    }
}
