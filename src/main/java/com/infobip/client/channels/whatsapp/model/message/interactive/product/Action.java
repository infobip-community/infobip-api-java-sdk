
package com.infobip.client.channels.whatsapp.model.message.interactive.product;

public final class Action {
    private final String catalogId;
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
    public Action(String catalogId, String productRetailerId) {
        this.catalogId = catalogId;
        this.productRetailerId = productRetailerId;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public String getProductRetailerId() {
        return productRetailerId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((catalogId == null) ? 0 : catalogId.hashCode());
        result = prime * result + ((productRetailerId == null) ? 0 : productRetailerId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action other = (Action) obj;
        if (catalogId == null) {
            if (other.catalogId != null) {
                return false;
            }
        } else if (!catalogId.equals(other.catalogId)) {
            return false;
        }
        if (productRetailerId == null) {
            if (other.productRetailerId != null) {
                return false;
            }
        } else if (!productRetailerId.equals(other.productRetailerId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Action [catalogId=" + catalogId + ", productRetailerId=" + productRetailerId + "]";
    }
}
