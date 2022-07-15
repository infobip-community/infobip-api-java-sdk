
package io.github.infobip_community.client.channels.whatsapp.model.template;

import lombok.ToString;

@ToString(callSuper = true)
public final class LocationHeader extends Header {
    /**
     * <p>
     * LocationHeader.
     * </p>
     */
    public LocationHeader() {
        super(HeaderFormat.LOCATION);
    }
}
