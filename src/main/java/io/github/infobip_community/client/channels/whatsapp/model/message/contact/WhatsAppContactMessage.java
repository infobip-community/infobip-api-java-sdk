
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;
import lombok.ToString;

@ToString(callSuper = true)
public final class WhatsAppContactMessage extends WhatsAppMessage<WhatsAppContactMessage> {
    /**
     * <p>
     * WhatsAppContactMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppContactMessage(String from, String to, Content content) {
        super(from, to, content);
    }
}
