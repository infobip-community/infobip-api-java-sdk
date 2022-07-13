
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.product;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
public final class Content extends MessageContent {
    @Valid
    @NotNull
    private final Action action;
    @Valid
    private Body body;
    @Valid
    private Footer footer;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param action Allows you to specify catalog and product details sent in the
     *     product message.
     */
    public Content(Action action) {
        this.action = action;
    }

    /**
     * Body of a message containing one or more <a href=
     * "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     * elements</a>.
     */
    public Content body(Body body) {
        this.body = body;
        return this;
    }

    /**
     * Footer of a message containing one or more <a href=
     * "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     * elements</a>.
     */
    public Content footer(Footer footer) {
        this.footer = footer;
        return this;
    }
}
