
package io.github.infobip_community.client.channels.whatsapp.model.message.audio;

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
     * @param mediaUrl URL of an audio sent in a WhatsApp message. Must be a valid
     *     URL starting with https:// or http://. Supported audio types are AAC,
     *     AMR, MP3, MP4, OPUS. Maximum audio size is 16MB.
     */
    public Content(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }
}
