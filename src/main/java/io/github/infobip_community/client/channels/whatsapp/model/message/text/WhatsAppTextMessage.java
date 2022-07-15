
package io.github.infobip_community.client.channels.whatsapp.model.message.text;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;
import lombok.ToString;

@ToString(callSuper = true)
public final class WhatsAppTextMessage extends WhatsAppMessage<WhatsAppTextMessage> {
    /**
     * <p>
     * WhatsAppTextMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppTextMessage(String from, String to, Content content) {
        super(from, to, content);
    }
}
