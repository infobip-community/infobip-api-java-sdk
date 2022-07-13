
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class LocationHeader extends Header {
    @Range(min = -90, max = 90)
    private final double latitude;
    @Range(min = -180, max = 180)
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
}
