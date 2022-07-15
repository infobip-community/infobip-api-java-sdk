
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

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
public final class WhatsAppTemplateMessage {
    @Valid
    @NotEmpty
    private List<TemplateMessage> messages = new ArrayList<>();
    @Size(min = 1, max = 100)
    private String bulkId;

    /**
     * <p>
     * WhatsAppTemplateMessage.
     * </p>
     *
     * @param messages An array of messages being sent.
     */
    public WhatsAppTemplateMessage(List<TemplateMessage> messages) {
        this.messages = messages;
    }

    /**
     * The ID that uniquely identifies the request. Bulk ID will be received only
     * when you send a message to more than one destination address.
     */
    public WhatsAppTemplateMessage bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }
}
