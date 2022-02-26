
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * List of all templates for given sender.
 * </p>
 */
public final class WhatsAppTemplateResponse extends WhatsAppTemplate {
    private String id;
    private long businessAccountId;
    private Status status;

    public WhatsAppTemplateResponse() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getBusinessAccountId() {
        return businessAccountId;
    }

    public void setBusinessAccountId(long businessAccountId) {
        this.businessAccountId = businessAccountId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
