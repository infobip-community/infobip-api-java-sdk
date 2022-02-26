
package com.infobip.client.channels.whatsapp.model;

public final class TemplateHeaderTypeLocation extends TemplateHeader {
    private final double latitude;
    private final double longitude;

    public TemplateHeaderTypeLocation(double latitude, double longitude) {
        super(TemplateHeaderType.LOCATION);
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
