
package com.infobip.client.channels.rcs.model;

public final class SuggestionTypeShowLocation extends Suggestion {
    private final double latitude;
    private final double longitude;
    private String label;

    /**
     * <p>
     * Create SuggestionTypeShowLocation with required fields.
     * </p>
     *
     * @param text Suggestion text
     * @param postbackData Value which is going to be sent as a reply to a
     *     suggestion
     * @param latitude Latitude of the location
     * @param longitude Longitude of the location
     */
    public SuggestionTypeShowLocation(String text, String postbackData, double latitude,
            double longitude) {
        super(text, postbackData, SuggestionType.SHOW_LOCATION);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Label of the location.
     */
    public SuggestionTypeShowLocation label(String label) {
        this.label = label;
        return this;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((label == null) ? 0 : label.hashCode());
        long temp;
        temp = Double.doubleToLongBits(latitude);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof SuggestionTypeShowLocation)) {
            return false;
        }
        SuggestionTypeShowLocation other = (SuggestionTypeShowLocation) obj;
        if (label == null) {
            if (other.label != null) {
                return false;
            }
        } else if (!label.equals(other.label)) {
            return false;
        }
        if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(other.latitude)) {
            return false;
        }
        if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SuggestionTypeShowLocation [latitude=" + latitude + ", longitude=" + longitude
                + ", label=" + label + ", text=" + text + ", postbackData=" + postbackData
                + ", type=" + type + "]";
    }
}
