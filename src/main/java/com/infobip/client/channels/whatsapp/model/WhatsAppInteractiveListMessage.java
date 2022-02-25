
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppInteractiveListMessage.
 * </p>
 */
public class WhatsAppInteractiveListMessage extends WhatsAppMessage {
    public WhatsAppInteractiveListMessage(String from, String to,
            MessageInteractiveListContent content) {
        super(from, to, content);
    }
}
