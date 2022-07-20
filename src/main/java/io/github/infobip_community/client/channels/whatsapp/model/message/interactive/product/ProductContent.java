
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.product;

import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.Body;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.Footer;
import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.Content;
import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
public final class ProductContent extends Content {
    @Valid
    private Body body;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @param productAction Allows you to specify catalog and product details sent in the
     *     product message.
     */
    public ProductContent(ProductAction productAction) {
        super(productAction);
    }

    /**
     * Body of a message containing one or more <a href=
     * "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     * elements</a>.
     */
    public ProductContent body(Body body) {
        this.body = body;
        return this;
    }

    /**
     * Footer of a message containing one or more <a href=
     * "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     * elements</a>.
     */
    public ProductContent footer(Footer footer) {
        super.footer(footer);
        return this;
    }
}
