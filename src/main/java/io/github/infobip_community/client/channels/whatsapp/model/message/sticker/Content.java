
package io.github.infobip_community.client.channels.whatsapp.model.message.sticker;

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

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param mediaUrl URL of a sticker sent in a WhatsApp message. Must be a valid
     *     URL starting with https:// or http://. Supported sticker type is WebP.
     *     Sticker file should be 512x512 pixels. Maximum sticker size is 100KB.
     */
    public Content(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }
}
