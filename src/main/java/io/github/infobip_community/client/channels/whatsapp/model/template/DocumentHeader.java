
package io.github.infobip_community.client.channels.whatsapp.model.template;

public final class DocumentHeader extends Header {
    /**
     * <p>
     * DocumentHeader.
     * </p>
     */
    public DocumentHeader() {
        super(HeaderFormat.DOCUMENT);
    }

    @Override
    public String toString() {
        return "DocumentHeader [format=" + format + "]";
    }
}
