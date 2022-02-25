
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppInteractiveButtonsMessage.
 * </p>
 */
public class WhatsAppInteractiveButtonsMessage extends WhatsAppMessage {
    public WhatsAppInteractiveButtonsMessage(String from, String to,
            MessageInteractiveButtonsContent content) {
        super(from, to, content);
    }
}
