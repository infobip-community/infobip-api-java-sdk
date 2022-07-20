
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.button;

import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.Body;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.Footer;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.Header;
import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.Content;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public final class ButtonContent extends Content {
    @Valid
    @NotNull
    private final Body body;
    @Valid
    private Header header;

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
     * @param buttonAction Allows you to specify buttons sent in the message.
     */
    public ButtonContent(Body body, ButtonAction buttonAction) {
        super(buttonAction);
        this.body = body;
    }

    /**
     * Header of a message containing one or more <a href=
     * "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     * elements</a>.
     */
    public ButtonContent header(Header header) {
        this.header = header;
        return this;
    }

    /**
     * Footer of a message containing one or more <a href=
     * "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     * elements</a>.
     */
    public ButtonContent footer(Footer footer) {
        super.footer(footer);
        return this;
    }
}
