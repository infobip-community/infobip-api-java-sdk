
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.multiproduct;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;
import lombok.ToString;

@ToString(callSuper = true)
public final class WhatsAppInteractiveMultiProductMessage extends WhatsAppMessage<WhatsAppInteractiveMultiProductMessage> {
    /**
     * <p>
     * WhatsAppInteractiveMultiProductMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppInteractiveMultiProductMessage(String from, String to,
            Content content) {
        super(from, to, content);
    }
}
