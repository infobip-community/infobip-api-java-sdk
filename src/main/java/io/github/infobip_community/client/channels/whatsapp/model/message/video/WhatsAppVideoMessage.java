
package io.github.infobip_community.client.channels.whatsapp.model.message.video;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;
import lombok.ToString;

@ToString(callSuper = true)
public final class WhatsAppVideoMessage extends WhatsAppMessage<WhatsAppVideoMessage> {
    /**
     * <p>
     * WhatsAppVideoMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppVideoMessage(String from, String to, Content content) {
        super(from, to, content);
    }
}
