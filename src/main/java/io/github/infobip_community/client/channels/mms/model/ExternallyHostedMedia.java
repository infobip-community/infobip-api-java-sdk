
package io.github.infobip_community.client.channels.mms.model;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

@Getter
@EqualsAndHashCode
@ToString
public final class ExternallyHostedMedia {
    @NotBlank
    private final String contentType;
    @NotBlank
    private final String contentId;
    @NotBlank
    @URL
    private final String contentUrl;

    /**
     * <p>
     * ExternallyHostedMedia.
     * </p>
     *
     * @param contentType Content type for media, for example 'image/png'.
     * @param contentId Unique identifier for the content part.
     * @param contentUrl URL for externally hosted content.
     */
    public ExternallyHostedMedia(String contentType, String contentId, String contentUrl) {
        this.contentType = contentType;
        this.contentId = contentId;
        this.contentUrl = contentUrl;
    }
}
