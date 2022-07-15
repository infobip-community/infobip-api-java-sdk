
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class DocumentHeader extends Header {
    @NotBlank
    @Size(max = 2048)
    @URL
    private final String mediaUrl;
    @NotBlank
    @Size(max = 240)
    private final String filename;

    /**
     * <p>
     * DocumentHeader.
     * </p>
     *
     * @param mediaUrl URL of a document sent in the header. It is expected to be a
     *     valid URL starting with https:// or http://. Supported document type is
     *     PDF. Maximum document size is 100MB.
     * @param filename Filename of the document.
     */
    public DocumentHeader(String mediaUrl, String filename) {
        super(HeaderType.DOCUMENT);
        this.mediaUrl = mediaUrl;
        this.filename = filename;
    }
}
