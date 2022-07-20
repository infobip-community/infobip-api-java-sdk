
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.multiproduct;

import io.github.infobip_community.client.channels.whatsapp.model.message.interactive.Action;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
public final class MultiProductAction extends Action {
    @NotEmpty
    private final String catalogId;
    @Valid
    @NotEmpty
    @Size(max = 10)
    private List<Section> sections;

    /**
     * <p>
     * Action.
     * </p>
     *
     * @param catalogId The ID that uniquely identifies the <a href=
     *     "https://www.infobip.com/docs/whatsapp/manage-connection#manage-catalog">catalog</a>
     *     registered with Facebook and connected to the WhatsApp Business Account
     *     the sender belongs to.
     * @param sections An array of multi product sections.
     */
    public MultiProductAction(String catalogId, List<Section> sections) {
        this.catalogId = catalogId;
        this.sections = sections;
    }
}
