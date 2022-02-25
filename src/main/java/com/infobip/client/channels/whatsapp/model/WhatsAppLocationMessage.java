
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppLocationMessage.
 * </p>
 */
public class WhatsAppLocationMessage extends WhatsAppMessage {
    public WhatsAppLocationMessage(String from, String to, MessageLocationContent content) {
        super(from, to, content);
    }
}
