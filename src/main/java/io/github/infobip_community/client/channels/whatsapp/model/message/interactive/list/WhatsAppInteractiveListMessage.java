
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.list;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;
import lombok.ToString;

@ToString(callSuper = true)
public final class WhatsAppInteractiveListMessage extends WhatsAppMessage<WhatsAppInteractiveListMessage> {
    /**
     * <p>
     * WhatsAppInteractiveListMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppInteractiveListMessage(String from, String to, Content content) {
        super(from, to, content);
    }
}
