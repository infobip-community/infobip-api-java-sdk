
package io.github.infobip_community.client.channels.whatsapp.model.message.text;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
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
}
