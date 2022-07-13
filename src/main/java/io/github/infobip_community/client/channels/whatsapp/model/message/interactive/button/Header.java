
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.button;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public abstract class Header {
    protected final HeaderType type;

    /**
     * <p>
     * Header.
     * </p>
     *
     * @param type HeaderType
     */
    public Header(HeaderType type) {
        this.type = type;
    }
}
