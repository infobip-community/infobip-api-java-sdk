
package io.github.infobip_community.client.channels.whatsapp.model.message.location;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
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
}
