
package com.infobip.client.channels.whatsapp.model.message.template;

import com.infobip.client.channels.whatsapp.model.message.MessageContent;
import com.infobip.client.channels.whatsapp.model.message.WhatsAppMessage;
import jakarta.validation.Valid;

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

    public SmsFailover getSmsFailover() {
        return smsFailover;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((smsFailover == null) ? 0 : smsFailover.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof TemplateMessage)) {
            return false;
        }
        TemplateMessage other = (TemplateMessage) obj;
        if (smsFailover == null) {
            if (other.smsFailover != null) {
                return false;
            }
        } else if (!smsFailover.equals(other.smsFailover)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TemplateMessage [smsFailover=" + smsFailover + ", from=" + from + ", to=" + to
                + ", messageId=" + messageId + ", content=" + content + ", callbackData="
                + callbackData + ", notifyUrl=" + notifyUrl + "]";
    }
}
