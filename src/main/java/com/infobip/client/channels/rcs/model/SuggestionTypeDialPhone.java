
package com.infobip.client.channels.rcs.model;

public final class SuggestionTypeDialPhone extends Suggestion {
    private String phoneNumber;

    /**
     * <p>
     * Create SuggestionTypeDialPhone with required fields.
     * </p>
     *
     * @param text Suggestion text
     * @param postbackData Value which is going to be sent as a reply to a
     *     suggestion
     */
    public SuggestionTypeDialPhone(String text, String postbackData) {
        super(text, postbackData, SuggestionType.DIAL_PHONE);
    }

    /**
     * Valid phone number.
     */
    public SuggestionTypeDialPhone phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
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
        if (!(obj instanceof SuggestionTypeDialPhone)) {
            return false;
        }
        SuggestionTypeDialPhone other = (SuggestionTypeDialPhone) obj;
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
        return "SuggestionTypeDialPhone [phoneNumber=" + phoneNumber + ", text=" + text
                + ", postbackData=" + postbackData + ", type=" + type + "]";
    }
}
