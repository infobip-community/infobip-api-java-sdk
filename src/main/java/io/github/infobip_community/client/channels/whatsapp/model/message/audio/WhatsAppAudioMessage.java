
package io.github.infobip_community.client.channels.whatsapp.model.message.audio;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;
import lombok.ToString;

@ToString(callSuper = true)
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
}
