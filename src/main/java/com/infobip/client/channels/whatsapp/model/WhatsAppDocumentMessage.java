
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppDocumentMessage.
 * </p>
 */
public final class WhatsAppDocumentMessage extends WhatsAppMessage {
    public WhatsAppDocumentMessage(String from, String to, MessageDocumentContent content) {
        super(from, to, content);
    }
}
