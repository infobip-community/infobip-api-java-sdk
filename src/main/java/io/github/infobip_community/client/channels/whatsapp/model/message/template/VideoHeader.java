
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
public final class VideoHeader extends Header {
    @NotBlank
    @Size(max = 2048)
    @URL
    private final String mediaUrl;

    /**
     * <p>
     * VideoHeader.
     * </p>
     *
     * @param mediaUrl URL of a video sent in the header. It is expected to be a
     *     valid URL starting with https:// or http://. Supported video types are
     *     MP4, 3GPP. Maximum video size is 16MB.
     */
    public VideoHeader(String mediaUrl) {
        super(HeaderType.VIDEO);
        this.mediaUrl = mediaUrl;
    }
}
