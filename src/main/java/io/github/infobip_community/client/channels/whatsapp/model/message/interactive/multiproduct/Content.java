
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.multiproduct;

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
    private final Header header;
    @Valid
    @NotNull
    private final Body body;
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
     * @see MessageContent#MessageContent()
     *
     * @param header Header of a message containing one or more <a href=
     *     "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     *     elements</a>.
     * @param body Body of a message containing one or more <a href=
     *     "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     *     elements</a>.
     * @param action Allows you to specify catalog and product details sent in the
     *     multi-product message.
     */
    public Content(Header header, Body body, Action action) {
        this.header = header;
        this.body = body;
        this.action = action;
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
