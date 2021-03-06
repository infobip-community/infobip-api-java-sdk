
package io.github.infobip_community.client.channels.whatsapp.model.message.image;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;
import lombok.ToString;

@ToString(callSuper = true)
public final class WhatsAppImageMessage extends WhatsAppMessage<WhatsAppImageMessage> {
    /**
     * <p>
     * WhatsAppImageMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppImageMessage(String from, String to, Content content) {
        super(from, to, content);
    }
}
