
package com.infobip.client.channels.rcs.model;

public final class ShowLocationSuggestion extends Suggestion {
    private final double latitude;
    private final double longitude;
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
        if (!(obj instanceof ShowLocationSuggestion)) {
            return false;
        }
        ShowLocationSuggestion other = (ShowLocationSuggestion) obj;
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
        return "ShowLocationSuggestion [latitude=" + latitude + ", longitude=" + longitude
                + ", label=" + label + ", text=" + text + ", postbackData=" + postbackData
                + ", type=" + type + "]";
    }
}
