
package io.github.infobip_community.client.channels.sms.model.common;

import jakarta.validation.constraints.NotBlank;

public final class IndiaDlt {
    private String contentTemplateId;
    @NotBlank
    private final String principalEntityId;

    /**
     * <p>
     * IndiaDlt.
     * </p>
     *
     * @param principalEntityId Your assigned DLT principal entity ID.
     */
    public IndiaDlt(String principalEntityId) {
        this.principalEntityId = principalEntityId;
    }

    /**
     * Registered DLT content template ID which matches message you are sending.
     */
    public IndiaDlt contentTemplateId(String contentTemplateId) {
        this.contentTemplateId = contentTemplateId;
        return this;
    }

    public String getContentTemplateId() {
        return contentTemplateId;
    }

    public String getPrincipalEntityId() {
        return principalEntityId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contentTemplateId == null) ? 0 : contentTemplateId.hashCode());
        result = prime * result + ((principalEntityId == null) ? 0 : principalEntityId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndiaDlt)) {
            return false;
        }
        IndiaDlt other = (IndiaDlt) obj;
        if (contentTemplateId == null) {
            if (other.contentTemplateId != null) {
                return false;
            }
        } else if (!contentTemplateId.equals(other.contentTemplateId)) {
            return false;
        }
        if (principalEntityId == null) {
            if (other.principalEntityId != null) {
                return false;
            }
        } else if (!principalEntityId.equals(other.principalEntityId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "IndiaDlt [contentTemplateId=" + contentTemplateId + ", principalEntityId="
                + principalEntityId + "]";
    }
}
