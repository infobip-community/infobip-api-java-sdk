
package com.infobip.client.channels.whatsapp.model.template;

public final class ImageHeader extends Header {
    /**
     * <p>
     * ImageHeader.
     * </p>
     */
    public ImageHeader() {
        super(HeaderFormat.IMAGE);
    }

    @Override
    public String toString() {
        return "ImageHeader [format=" + format + "]";
    }
}
