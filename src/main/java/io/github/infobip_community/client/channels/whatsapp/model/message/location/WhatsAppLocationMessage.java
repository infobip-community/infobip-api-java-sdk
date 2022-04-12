
package io.github.infobip_community.client.channels.whatsapp.model.message.location;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;

public final class WhatsAppLocationMessage extends WhatsAppMessage<WhatsAppLocationMessage> {
    /**
     * <p>
     * WhatsAppLocationMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppLocationMessage(String from, String to, Content content) {
        super(from, to, content);
    }

    @Override
    public String toString() {
        return "WhatsAppLocationMessage [from=" + from + ", to=" + to + ", messageId=" + messageId
                + ", content=" + content + ", callbackData=" + callbackData + ", notifyUrl="
                + notifyUrl + "]";
    }
}
