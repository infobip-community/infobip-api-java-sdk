
package com.infobip.client.channels.whatsapp.model;

public final class TemplateMessage {
    private final String from;
    private final String to;
    private String messageId;
    private final Content content;
    private String callbackData;
    private String notifyUrl;
    private SmsFailover smsFailover;

    public TemplateMessage(String from, String to, Content content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public TemplateMessage messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public TemplateMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    public TemplateMessage notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    public TemplateMessage smsFailover(SmsFailover smsFailover) {
        this.smsFailover = smsFailover;
        return this;
    }
}
