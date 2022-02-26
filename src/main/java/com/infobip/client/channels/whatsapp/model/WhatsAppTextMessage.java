
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppTextMessage.
 * </p>
 */
public final class WhatsAppTextMessage extends WhatsAppMessage {
    public WhatsAppTextMessage(String from, String to, MessageTextContent content) {
        super(from, to, content);
    }

    @Override
    public String toString() {
        return "WhatsAppTextMessage [from=" + from + ", to=" + to + ", messageId=" + messageId
                + ", content=" + content + ", callbackData=" + callbackData + ", notifyUrl="
                + notifyUrl + "]";
    }
}
