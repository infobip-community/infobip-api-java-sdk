
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.button;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class DocumentHeader extends Header {
    @NotEmpty
    @Size(max = 2048)
    @URL
    private final String mediaUrl;
    @Size(max = 240)
    private String filename;

    /**
     * <p>
     * DocumentHeader.
     * </p>
     *
     * @param mediaUrl URL of a document sent in the header of a message containing
     *     one or more interactive buttons. Must be a valid URL starting with
     *     https:// or http://. Supported document type is PDF. Maximum document
     *     size is 100MB.
     */
    public DocumentHeader(String mediaUrl) {
        super(HeaderType.DOCUMENT);
        this.mediaUrl = mediaUrl;
    }

    /**
     * Filename of the document.
     */
    public DocumentHeader filename(String filename) {
        this.filename = filename;
        return this;
    }
}
