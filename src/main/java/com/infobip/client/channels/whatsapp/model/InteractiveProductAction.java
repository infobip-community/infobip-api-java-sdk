
package com.infobip.client.channels.whatsapp.model;

public final class InteractiveProductAction {
    private final String catalogId;
    private final String productRetailerId;

    public InteractiveProductAction(String catalogId, String productRetailerId) {
        this.catalogId = catalogId;
        this.productRetailerId = productRetailerId;
    }
}
