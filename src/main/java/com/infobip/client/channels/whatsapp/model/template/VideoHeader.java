
package com.infobip.client.channels.whatsapp.model.template;

public final class VideoHeader extends Header {
    /**
     * <p>
     * VideoHeader.
     * </p>
     */
    public VideoHeader() {
        super(HeaderFormat.VIDEO);
    }

    @Override
    public String toString() {
        return "VideoHeader [format=" + format + "]";
    }
}
