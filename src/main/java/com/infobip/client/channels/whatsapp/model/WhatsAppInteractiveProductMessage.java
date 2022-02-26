
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppInteractiveProductMessage.
 * </p>
 */
public class WhatsAppInteractiveProductMessage extends WhatsAppMessage {
    public WhatsAppInteractiveProductMessage(String from, String to,
            MessageInteractiveProductContent content) {
        super(from, to, content);
    }
}
