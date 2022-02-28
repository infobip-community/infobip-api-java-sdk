
package com.infobip.client.channels.whatsapp.model.message.template;

public final class LocationHeader extends Header {
    private final double latitude;
    private final double longitude;

    /**
     * <p>
     * LocationHeader.
     * </p>
     *
     * @param latitude Latitude of a location sent in the header.
     * @param longitude Longitude of a location sent in the header.
     */
    public LocationHeader(double latitude, double longitude) {
        super(HeaderType.LOCATION);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
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
        if (!(obj instanceof LocationHeader)) {
            return false;
        }
        LocationHeader other = (LocationHeader) obj;
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
        return "LocationHeader [latitude=" + latitude + ", longitude=" + longitude + ", type="
                + type + "]";
    }
}
