
package io.github.infobip_community.client.channels.whatsapp.model.template;

import lombok.ToString;

@ToString(callSuper = true)
public final class VideoHeader extends Header {
    /**
     * <p>
     * VideoHeader.
     * </p>
     */
    public VideoHeader() {
        super(HeaderFormat.VIDEO);
    }
}
