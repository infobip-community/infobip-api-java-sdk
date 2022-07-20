package io.github.infobip_community.client.channels.whatsapp.model.message.interactive;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
public abstract class Content extends MessageContent {
    @Valid
    @NotNull
    private final Action action;
    @Valid
    private Footer footer;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @param action Allows you to specify action for the given interactive message type.
     */
    public Content(Action action) {
        this.action = action;
    }

    /**
     * <p>
     * Content.
     * </p>
     *
     * Footer of a message containing one or more <a href=
     * "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     * elements</a>.
     */
    public Content footer(Footer footer) {
        this.footer = footer;
        return this;
    }
}
