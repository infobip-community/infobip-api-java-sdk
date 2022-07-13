
package io.github.infobip_community.client.channels.whatsapp.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

/**
 * <p>
 * WhatsAppDeleteMedia.
 * </p>
 */
@Getter
@EqualsAndHashCode
@ToString
public final class WhatsAppDeleteMedia {
    @NotEmpty
    @URL
    private final String url;

    public WhatsAppDeleteMedia(String url) {
        this.url = url;
    }
}
