
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.product;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;

public final class WhatsAppInteractiveProductMessage
        extends WhatsAppMessage<WhatsAppInteractiveProductMessage> {
    /**
     * <p>
     * WhatsAppInteractiveProductMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppInteractiveProductMessage(String from, String to,
            Content content) {
        super(from, to, content);
    }

    @Override
    public String toString() {
        return "WhatsAppInteractiveProductMessage [from=" + from + ", to=" + to + ", messageId="
                + messageId + ", content=" + content + ", callbackData=" + callbackData
                + ", notifyUrl=" + notifyUrl + "]";
    }
}
