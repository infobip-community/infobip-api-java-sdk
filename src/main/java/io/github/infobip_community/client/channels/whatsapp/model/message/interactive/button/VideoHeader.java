
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
public final class VideoHeader extends Header {
    @NotEmpty
    @Size(max = 2048)
    @URL
    private final String mediaUrl;

    /**
     * <p>
     * VideoHeader.
     * </p>
     *
     * @param mediaUrl URL of a video sent in the header of a message containing one
     *     or more interactive buttons. Must be a valid URL starting with https://
     *     or http://. Supported video types are MP4, 3GPP. Maximum video size is
     *     16MB.
     */
    public VideoHeader(String mediaUrl) {
        super(HeaderType.VIDEO);
        this.mediaUrl = mediaUrl;
    }
}
