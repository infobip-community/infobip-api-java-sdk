
package io.github.infobip_community.client.channels.whatsapp.model.message.text;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;

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

    @Override
    public String toString() {
        return "WhatsAppTextMessage [from=" + from + ", to=" + to + ", messageId=" + messageId
                + ", content=" + content + ", callbackData=" + callbackData + ", notifyUrl="
                + notifyUrl + "]";
    }
}
