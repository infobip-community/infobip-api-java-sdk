
package com.infobip.client.channels.whatsapp.model;

/**
 * <p>
 * WhatsAppMessage.
 * </p>
 */
public abstract class WhatsAppMessage {
    protected final String from;
    protected final String to;
    protected String messageId;
    protected final MessageContent content;
    protected String callbackData;
    protected String notifyUrl;

    public WhatsAppMessage(String from, String to, MessageContent content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public WhatsAppMessage messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public WhatsAppMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    public WhatsAppMessage notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getMessageId() {
        return messageId;
    }

    public MessageContent getContent() {
        return content;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }
}
