
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.multiproduct;

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
public final class Section {
    @Size(max = 24)
    private String title;
    @NotEmpty
    private List<String> productRetailerIds;

    /**
     * <p>
     * Section.
     * </p>
     *
     * @param productRetailerIds An array of product-unique identifiers as defined
     *     in the <a href=
     *     "https://www.infobip.com/docs/whatsapp/manage-connection#manage-catalog">catalog</a>.
     *     If product retailer ID doesn't exist in your catalog, the product won't
     *     be displayed.
     */
    public Section(List<String> productRetailerIds) {
        this.productRetailerIds = productRetailerIds;
    }

    /**
     * Title of the section. Required, if the message has more than one section.
     */
    public Section title(String title) {
        this.title = title;
        return this;
    }
}
