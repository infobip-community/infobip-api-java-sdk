
package io.github.infobip_community.client.channels.whatsapp.model.message.document;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
public final class Content extends MessageContent {
    @NotBlank
    @Size(max = 2048)
    @URL
    private final String mediaUrl;
    @Size(max = 3000)
    private String caption;
    @Size(max = 240)
    private String filename;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param mediaUrl URL of a document sent in a WhatsApp message. Must be a valid
     *     URL starting with https:// or http://. Maximum document size is 100MB.
     */
    public Content(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * Caption of the document.
     */
    public Content caption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * File name of the document.
     */
    public Content filename(String filename) {
        this.filename = filename;
        return this;
    }
}
