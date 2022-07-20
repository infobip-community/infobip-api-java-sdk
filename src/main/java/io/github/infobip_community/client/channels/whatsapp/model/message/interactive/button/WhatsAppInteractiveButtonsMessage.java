
package io.github.infobip_community.client.channels.whatsapp.model.message.interactive.button;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString
public final class WhatsAppInteractiveButtonsMessage
        extends WhatsAppMessage<WhatsAppInteractiveButtonsMessage> {
    /**
     * <p>
     * WhatsAppInteractiveButtonsMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public WhatsAppInteractiveButtonsMessage(String from, String to, ButtonContent buttonContent) {
        super(from, to, buttonContent);
    }
}
