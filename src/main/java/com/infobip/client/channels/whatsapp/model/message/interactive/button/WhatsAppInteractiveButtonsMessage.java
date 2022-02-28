
package com.infobip.client.channels.whatsapp.model.message.interactive.button;

import com.infobip.client.channels.whatsapp.model.message.MessageContent;
import com.infobip.client.channels.whatsapp.model.message.WhatsAppMessage;

public final class WhatsAppInteractiveButtonsMessage
        extends WhatsAppMessage<WhatsAppInteractiveButtonsMessage> {
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

    @Override
    public String toString() {
        return "WhatsAppInteractiveButtonsMessage [from=" + from + ", to=" + to + ", messageId="
                + messageId + ", content=" + content + ", callbackData=" + callbackData
                + ", notifyUrl=" + notifyUrl + "]";
    }
}
