
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
public final class ImageHeader extends Header {
    @NotBlank
    @Size(max = 2048)
    @URL
    private final String mediaUrl;

    /**
     * <p>
     * ImageHeader.
     * </p>
     *
     * @param mediaUrl URL of an image sent in the header. It is expected to be a
     *     valid URL starting with https:// or http://. Supported image types are
     *     JPG, JPEG, PNG. Maximum image size is 5MB.
     */
    public ImageHeader(String mediaUrl) {
        super(HeaderType.IMAGE);
        this.mediaUrl = mediaUrl;
    }
}
