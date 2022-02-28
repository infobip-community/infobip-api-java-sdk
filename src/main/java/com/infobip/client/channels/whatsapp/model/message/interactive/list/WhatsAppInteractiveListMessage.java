
package com.infobip.client.channels.whatsapp.model.message.interactive.list;

import com.infobip.client.channels.whatsapp.model.message.MessageContent;
import com.infobip.client.channels.whatsapp.model.message.WhatsAppMessage;

public final class WhatsAppInteractiveListMessage
        extends WhatsAppMessage<WhatsAppInteractiveListMessage> {
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

    @Override
    public String toString() {
        return "WhatsAppInteractiveListMessage [from=" + from + ", to=" + to + ", messageId="
                + messageId + ", content=" + content + ", callbackData=" + callbackData
                + ", notifyUrl=" + notifyUrl + "]";
    }
}
