
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppAudioMessage.
 * </p>
 */
public final class WhatsAppAudioMessage extends WhatsAppMessage {
    public WhatsAppAudioMessage(String from, String to, MessageAudioContent content) {
        super(from, to, content);
    }
}
