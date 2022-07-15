
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

import io.github.infobip_community.client.channels.whatsapp.model.message.MessageContent;
import io.github.infobip_community.client.channels.whatsapp.model.message.WhatsAppMessage;
import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class TemplateMessage extends WhatsAppMessage<TemplateMessage> {
    @Valid
    private SmsFailover smsFailover;

    /**
     * <p>
     * TemplateMessage.
     * </p>
     *
     * @see WhatsAppMessage#WhatsAppMessage(String, String, MessageContent)
     */
    public TemplateMessage(String from, String to, Content content) {
        super(from, to, content);
    }

    /**
     * SMS message to be sent if the WhatsApp template message could not be
     * delivered.
     */
    public TemplateMessage smsFailover(SmsFailover smsFailover) {
        this.smsFailover = smsFailover;
        return this;
    }
}
