
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppImageMessage.
 * </p>
 */
public final class WhatsAppImageMessage extends WhatsAppMessage {
    public WhatsAppImageMessage(String from, String to, MessageImageContent content) {
        super(from, to, content);
    }
}
