
package io.github.infobip_community.client.channels.sms.model.message.outbound;

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

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getProcessKey() {
        return processKey;
    }

    public ConversionRateTrack getTrack() {
        return track;
    }

    public ConversionType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((baseUrl == null) ? 0 : baseUrl.hashCode());
        result = prime * result + ((processKey == null) ? 0 : processKey.hashCode());
        result = prime * result + ((track == null) ? 0 : track.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tracking)) {
            return false;
        }
        Tracking other = (Tracking) obj;
        if (baseUrl == null) {
            if (other.baseUrl != null) {
                return false;
            }
        } else if (!baseUrl.equals(other.baseUrl)) {
            return false;
        }
        if (processKey == null) {
            if (other.processKey != null) {
                return false;
            }
        } else if (!processKey.equals(other.processKey)) {
            return false;
        }
        if (track != other.track) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tracking [baseUrl=" + baseUrl + ", processKey=" + processKey + ", track=" + track
                + ", type=" + type + "]";
    }
}
