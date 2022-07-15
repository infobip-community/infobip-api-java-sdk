
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.multiproduct;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
public final class Action {
    @NotEmpty
    private final String catalogId;
    @Valid
    @NotEmpty
    @Size(max = 10)
    private List<Section> sections = new ArrayList<>();

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
    public Action(String catalogId, List<Section> sections) {
        this.catalogId = catalogId;
        this.sections = sections;
    }
}
