
package io.github.infobip_community.client.channels.mms.model;

import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.File;

@Getter
@EqualsAndHashCode
@ToString
public final class MmsSingleMessage {
    @Valid
    private Head head;
    private String text;
    private File media;
    @Valid
    private ExternallyHostedMedia externallyHostedMedia;
    private String smil;

    /**
     * <p>
     * MmsSingleMessage.
     * </p>
     */
    public MmsSingleMessage() {}

    /**
     * Head part contains required information for sending MMS to an end user.
     */
    public MmsSingleMessage head(Head head) {
        this.head = head;
        return this;
    }

    /**
     * Optional part sent with content type as text/plain containing textual message
     * data. Can be sent with different charsets.
     */
    public MmsSingleMessage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Optional part sent with content type for media containing media(image, video)
     * message data.
     */
    public MmsSingleMessage media(File media) {
        this.media = media;
        return this;
    }

    /**
     * Optional part containing information for externally hosted media (image,
     * video).
     */
    public MmsSingleMessage externallyHostedMedia(ExternallyHostedMedia externallyHostedMedia) {
        this.externallyHostedMedia = externallyHostedMedia;
        return this;
    }

    /**
     * Optional part sent with content type application/smil containing SMIL -
     * synchronized multimedia integration language file. Used for parts ordering in
     * MMS.
     */
    public MmsSingleMessage smil(String smil) {
        this.smil = smil;
        return this;
    }
}
