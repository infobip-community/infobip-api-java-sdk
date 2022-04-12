
package io.github.infobip_community.client.channels.whatsapp.model.template;

public final class LocationHeader extends Header {
    /**
     * <p>
     * LocationHeader.
     * </p>
     */
    public LocationHeader() {
        super(HeaderFormat.LOCATION);
    }

    @Override
    public String toString() {
        return "LocationHeader [format=" + format + "]";
    }
}
