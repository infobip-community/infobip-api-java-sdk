
package io.github.infobip_community.client.channels.whatsapp.model.template;

/**
 * <p>
 * List of all templates for given sender.
 * </p>
 */
public final class WhatsAppTemplateResponse extends Template {
    private String id;
    private long businessAccountId;
    private StatusType status;

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

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType statusType) {
        this.status = statusType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (int) (businessAccountId ^ (businessAccountId >>> 32));
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof WhatsAppTemplateResponse)) {
            return false;
        }
        WhatsAppTemplateResponse other = (WhatsAppTemplateResponse) obj;
        if (businessAccountId != other.businessAccountId) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (status != other.status) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WhatsAppTemplateResponse [id=" + id + ", businessAccountId=" + businessAccountId
                + ", status=" + status + "]";
    }
}
