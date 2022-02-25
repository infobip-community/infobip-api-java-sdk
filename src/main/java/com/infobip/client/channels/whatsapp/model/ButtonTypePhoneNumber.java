
package com.infobip.client.channels.whatsapp.model;

public final class ButtonTypePhoneNumber extends Button {
    private final String phoneNumber;

    public ButtonTypePhoneNumber(String text, String phoneNumber) {
        super(ButtonType.PHONE_NUMBER, text);
        this.phoneNumber = phoneNumber;
    }
}
