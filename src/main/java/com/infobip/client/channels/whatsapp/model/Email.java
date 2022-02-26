
package com.infobip.client.channels.whatsapp.model;

public final class Email {
    private String email;
    private EmailType type;

    public Email() {}

    public Email email(String email) {
        this.email = email;
        return this;
    }

    public Email type(EmailType type) {
        this.type = type;
        return this;
    }
}
