
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppInteractiveMultiProductMessage.
 * </p>
 */
public class WhatsAppInteractiveMultiProductMessage extends WhatsAppMessage {
    public WhatsAppInteractiveMultiProductMessage(String from, String to,
            MessageInteractiveMultiProductContent content) {
        super(from, to, content);
    }
}
