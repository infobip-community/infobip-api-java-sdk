
package io.github.infobip_community.client.channels.whatsapp.model.template;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public abstract class Header {
    protected final HeaderFormat format;

    /**
     * <p>
     * Header.
     * </p>
     *
     * @param format HeaderFormat
     */
    public Header(HeaderFormat format) {
        this.format = format;
    }
}
