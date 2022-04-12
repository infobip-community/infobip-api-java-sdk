
package io.github.infobip_community.client.channels.whatsapp.model.message.text;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public final class Content extends MessageContent {
    @NotBlank
    @Size(max = 4096)
    private final String text;
    private boolean previewUrl = false;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param text Content of the message being sent.
     */
    public Content(String text) {
        this.text = text;
    }

    /**
     * Allows for URL preview from within the message. If set to true, the message
     * content must contain a URL starting with https:// or http://. Defaults to
     * false.
     */
    public Content previewUrl(boolean previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    public String getText() {
        return text;
    }

    public boolean isPreviewUrl() {
        return previewUrl;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (previewUrl ? 1231 : 1237);
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content other = (Content) obj;
        if (previewUrl != other.previewUrl) {
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
        return "Content [text=" + text + ", previewUrl=" + previewUrl + "]";
    }
}
