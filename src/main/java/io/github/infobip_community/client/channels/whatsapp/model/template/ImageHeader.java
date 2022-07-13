
package io.github.infobip_community.client.channels.whatsapp.model.template;

import lombok.ToString;

@ToString(callSuper = true)
public final class ImageHeader extends Header {
    /**
     * <p>
     * ImageHeader.
     * </p>
     */
    public ImageHeader() {
        super(HeaderFormat.IMAGE);
    }
}
