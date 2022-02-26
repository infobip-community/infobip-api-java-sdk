
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppVideoMessage.
 * </p>
 */
public class WhatsAppVideoMessage extends WhatsAppMessage {
    public WhatsAppVideoMessage(String from, String to, MessageVideoContent content) {
        super(from, to, content);
    }
}
