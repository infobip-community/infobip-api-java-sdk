
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.multiproduct;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class WhatsAppInteractiveMultiProductMessage extends WhatsAppMessage<WhatsAppInteractiveMultiProductMessage> {
    /**
     * <p>
     * WhatsAppInteractiveMultiProductMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppInteractiveMultiProductMessage(String from, String to, MultiProductContent multiProductContent) {
        super(from, to, multiProductContent);
    }
}
