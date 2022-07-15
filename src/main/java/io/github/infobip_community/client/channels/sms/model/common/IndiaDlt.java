
package io.github.infobip_community.client.channels.sms.model.common;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
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
}
