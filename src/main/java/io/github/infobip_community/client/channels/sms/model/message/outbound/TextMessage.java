
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class TextMessage extends Message<TextMessage> {
    @Valid
    private Language language;
    private String text;
    private Transliteration transliteration;

    /**
     * <p>
     * TextMessage.
     * </p>
     *
     * @param destinations An array of destination objects for where messages are
     *     being sent. A valid destination is required.
     */
    public TextMessage(List<Destination> destinations) {
        super(destinations);
    }

    /**
     * Sets the language parameters for the message being sent.
     */
    public TextMessage language(Language language) {
        this.language = language;
        return this;
    }

    /**
     * Content of the message being sent.
     */
    public TextMessage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * The transliteration of your sent message from one script to another.
     * Transliteration is used to replace characters which are not recognized as
     * part of your defaulted alphabet. Possible values: TURKISH, GREEK, CYRILLIC,
     * SERBIAN_CYRILLIC, CENTRAL_EUROPEAN, BALTIC and NON_UNICODE.
     */
    public TextMessage transliteration(Transliteration transliteration) {
        this.transliteration = transliteration;
        return this;
    }
}
