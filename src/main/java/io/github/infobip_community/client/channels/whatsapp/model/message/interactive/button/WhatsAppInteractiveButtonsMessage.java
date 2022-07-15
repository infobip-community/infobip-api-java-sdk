
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.button;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;
import lombok.ToString;

@ToString(callSuper = true)
public final class WhatsAppInteractiveButtonsMessage extends WhatsAppMessage<WhatsAppInteractiveButtonsMessage> {
    /**
     * <p>
     * WhatsAppInteractiveButtonsMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppInteractiveButtonsMessage(String from, String to,
            Content content) {
        super(from, to, content);
    }
}
