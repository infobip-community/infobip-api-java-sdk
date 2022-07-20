
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.multiproduct;

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
@ToString
public final class MultiProductContent extends Content {
    @Valid
    @NotNull
    private final Header header;
    @Valid
    @NotNull
    private final Body body;

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
     * @param multiProductAction Allows you to specify catalog and product details sent in the
     *     multi-product message.
     */
    public MultiProductContent(Header header, Body body, MultiProductAction multiProductAction) {
        super(multiProductAction);
        this.header = header;
        this.body = body;
    }

    /**
     * Footer of a message containing one or more <a href=
     * "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     * elements</a>.
     */
    public MultiProductContent footer(Footer footer) {
        super.footer(footer);
        return this;
    }
}
