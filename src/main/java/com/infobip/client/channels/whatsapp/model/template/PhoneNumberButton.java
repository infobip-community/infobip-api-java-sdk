
package com.infobip.client.channels.whatsapp.model.template;

import jakarta.validation.constraints.NotEmpty;

public final class PhoneNumberButton extends Button {
    @NotEmpty
    private final String phoneNumber;

    /**
     * <p>
     * PhoneNumberButton.
     * </p>
     *
     * @param text {@link Button#Button(ButtonType, String)}
     * @param phoneNumber Phone number to which a phone call would be placed by
     *     end-user when hitting the button.
     */
    public PhoneNumberButton(String text, String phoneNumber) {
        super(ButtonType.PHONE_NUMBER, text);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
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
        if (!(obj instanceof PhoneNumberButton)) {
            return false;
        }
        PhoneNumberButton other = (PhoneNumberButton) obj;
        if (phoneNumber == null) {
            if (other.phoneNumber != null) {
                return false;
            }
        } else if (!phoneNumber.equals(other.phoneNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PhoneNumberButton [phoneNumber=" + phoneNumber + ", type=" + type + ", text=" + text
                + "]";
    }
}
