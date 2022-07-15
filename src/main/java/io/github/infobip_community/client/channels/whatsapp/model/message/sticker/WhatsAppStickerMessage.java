
package io.github.infobip_community.client.channels.whatsapp.model.message.sticker;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;
import lombok.ToString;

@ToString(callSuper = true)
public final class WhatsAppStickerMessage extends WhatsAppMessage<WhatsAppStickerMessage> {
    /**
     * <p>
     * WhatsAppStickerMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppStickerMessage(String from, String to, Content content) {
        super(from, to, content);
    }
}
