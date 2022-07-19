
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.product;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;
import lombok.ToString;

@ToString(callSuper = true)
public final class WhatsAppInteractiveProductMessage extends WhatsAppMessage<WhatsAppInteractiveProductMessage> {
    /**
     * <p>
     * WhatsAppInteractiveProductMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppInteractiveProductMessage(String from, String to, ProductContent productContent) {
        super(from, to, productContent);
    }
}
