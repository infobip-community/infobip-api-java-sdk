
package com.infobip.client.channels.whatsapp.model.message.interactive.multiproduct;

import java.util.ArrayList;
import java.util.List;

public final class Section {
    private String title;
    private List<String> productRetailerIds = new ArrayList<>();

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

    public String getTitle() {
        return title;
    }

    public List<String> getProductRetailerIds() {
        return productRetailerIds;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((productRetailerIds == null) ? 0 : productRetailerIds.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Section)) {
            return false;
        }
        Section other = (Section) obj;
        if (productRetailerIds == null) {
            if (other.productRetailerIds != null) {
                return false;
            }
        } else if (!productRetailerIds.equals(other.productRetailerIds)) {
            return false;
        }
        if (title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!title.equals(other.title)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Section [title=" + title + ", productRetailerIds=" + productRetailerIds + "]";
    }
}
