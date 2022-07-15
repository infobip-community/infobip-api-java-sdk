
package io.github.infobip_community.client.channels.whatsapp.model.message.image;

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

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param mediaUrl URL of an image sent in a WhatsApp message. Must be a valid
     *     URL starting with https:// or http://. Supported image types are JPG,
     *     JPEG, PNG. Maximum image size is 5MB.
     */
    public Content(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * Caption of the image.
     */
    public Content caption(String caption) {
        this.caption = caption;
        return this;
    }
}
