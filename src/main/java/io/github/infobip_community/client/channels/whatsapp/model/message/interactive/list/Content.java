
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.list;

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
    private final Body body;
    @Valid
    @NotNull
    private final Action action;
    @Valid
    private Header header;
    @Valid
    private Footer footer;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param body Body of a message containing one or more <a href=
     *     "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     *     elements</a>.
     * @param action Allows you to specify the title of the list and its sections.
     *     Each section can have a title and multiple rows to select.
     */
    public Content(Body body, Action action) {
        this.body = body;
        this.action = action;
    }

    /**
     * Header of a message containing one or more <a href=
     * "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     * elements</a>.
     */
    public Content header(Header header) {
        this.header = header;
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
