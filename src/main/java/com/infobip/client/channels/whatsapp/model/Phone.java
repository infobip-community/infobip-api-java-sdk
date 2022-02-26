
package com.infobip.client.channels.whatsapp.model;

public final class Phone {
    private String phone;
    private PhoneType type;
    private String waId;

    public Phone() {}

    public Phone phone(String phone) {
        this.phone = phone;
        return this;
    }

    public Phone type(PhoneType type) {
        this.type = type;
        return this;
    }

    public Phone waId(String waId) {
        this.waId = waId;
        return this;
    }
}
