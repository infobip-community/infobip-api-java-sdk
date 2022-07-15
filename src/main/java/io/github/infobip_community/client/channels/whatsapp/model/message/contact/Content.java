
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
public final class Content extends MessageContent {
    @Valid
    @NotEmpty
    private List<Contact> contacts = new ArrayList<>();

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param contacts An array of contacts sent in a WhatsApp message.
     */
    public Content(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
