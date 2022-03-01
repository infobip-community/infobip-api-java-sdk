
package com.infobip.client.channels.whatsapp.model.message.location;

import com.infobip.client.channels.whatsapp.model.message.MessageContent;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;

public final class Content extends MessageContent {
    @Range(min = -90, max = 90)
    private final double latitude;
    @Range(min = -180, max = 180)
    private final double longitude;
    @Size(min = 0, max = 1000)
    private String name;
    @Size(min = 0, max = 1000)
    private String address;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param latitude Latitude of a location sent in the WhatsApp message.
     * @param longitude Longitude of a location sent in the WhatsApp message.
     */
    public Content(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Location name.
     */
    public Content name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Location address.
     */
    public Content address(String address) {
        this.address = address;
        return this;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        long temp;
        temp = Double.doubleToLongBits(latitude);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content other = (Content) obj;
        if (address == null) {
            if (other.address != null) {
                return false;
            }
        } else if (!address.equals(other.address)) {
            return false;
        }
        if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(other.latitude)) {
            return false;
        }
        if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Content [latitude=" + latitude + ", longitude=" + longitude + ", name=" + name
                + ", address=" + address + "]";
    }
}
