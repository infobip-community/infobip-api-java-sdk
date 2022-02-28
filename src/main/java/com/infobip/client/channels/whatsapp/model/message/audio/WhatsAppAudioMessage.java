
package com.infobip.client.channels.whatsapp.model.message.audio;

import com.infobip.client.channels.whatsapp.model.message.MessageContent;
import com.infobip.client.channels.whatsapp.model.message.WhatsAppMessage;

public final class WhatsAppAudioMessage extends WhatsAppMessage<WhatsAppAudioMessage> {
    /**
     * <p>
     * WhatsAppAudioMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppAudioMessage(String from, String to, Content content) {
        super(from, to, content);
    }

    @Override
    public String toString() {
        return "WhatsAppAudioMessage [from=" + from + ", to=" + to + ", messageId=" + messageId
                + ", content=" + content + ", callbackData=" + callbackData + ", notifyUrl="
                + notifyUrl + "]";
    }
}
