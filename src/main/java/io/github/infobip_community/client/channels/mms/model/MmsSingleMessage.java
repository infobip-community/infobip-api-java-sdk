
package io.github.infobip_community.client.channels.mms.model;

import jakarta.validation.Valid;
import java.io.File;

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

    public Head getHead() {
        return head;
    }

    public String getText() {
        return text;
    }

    public File getMedia() {
        return media;
    }

    public ExternallyHostedMedia getExternallyHostedMedia() {
        return externallyHostedMedia;
    }

    public String getSmil() {
        return smil;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((externallyHostedMedia == null) ? 0 : externallyHostedMedia.hashCode());
        result = prime * result + ((head == null) ? 0 : head.hashCode());
        result = prime * result + ((media == null) ? 0 : media.hashCode());
        result = prime * result + ((smil == null) ? 0 : smil.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MmsSingleMessage)) {
            return false;
        }
        MmsSingleMessage other = (MmsSingleMessage) obj;
        if (externallyHostedMedia == null) {
            if (other.externallyHostedMedia != null) {
                return false;
            }
        } else if (!externallyHostedMedia.equals(other.externallyHostedMedia)) {
            return false;
        }
        if (head == null) {
            if (other.head != null) {
                return false;
            }
        } else if (!head.equals(other.head)) {
            return false;
        }
        if (media == null) {
            if (other.media != null) {
                return false;
            }
        } else if (!media.equals(other.media)) {
            return false;
        }
        if (smil == null) {
            if (other.smil != null) {
                return false;
            }
        } else if (!smil.equals(other.smil)) {
            return false;
        }
        if (text == null) {
            if (other.text != null) {
                return false;
            }
        } else if (!text.equals(other.text)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MmsSingleMessage [head=" + head + ", text=" + text + ", media=" + media
                + ", externallyHostedMedia=" + externallyHostedMedia + ", smil=" + smil + "]";
    }
}
