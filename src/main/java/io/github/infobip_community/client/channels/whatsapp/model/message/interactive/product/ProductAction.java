
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.product;

import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.Action;
import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
public final class ProductAction extends Action {
    @NotEmpty
    private final String catalogId;
    @NotEmpty
    private final String productRetailerId;

    /**
     * <p>
     * Action.
     * </p>
     *
     * @param catalogId The ID that uniquely identifies the <a href=
     *     "https://www.infobip.com/docs/whatsapp/manage-connection#manage-catalog">catalog</a>
     *     registered with Facebook and connected to the WhatsApp Business Account
     *     the sender belongs to.
     * @param productRetailerId Product-unique identifier, as defined in catalog.
     */
    public ProductAction(String catalogId, String productRetailerId) {
        this.catalogId = catalogId;
        this.productRetailerId = productRetailerId;
    }
}
