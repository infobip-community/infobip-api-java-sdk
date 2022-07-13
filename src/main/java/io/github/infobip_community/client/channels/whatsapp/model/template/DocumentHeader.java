
package io.github.infobip_community.client.channels.whatsapp.model.template;

import lombok.ToString;

@ToString(callSuper = true)
public final class DocumentHeader extends Header {
    /**
     * <p>
     * DocumentHeader.
     * </p>
     */
    public DocumentHeader() {
        super(HeaderFormat.DOCUMENT);
    }
}
