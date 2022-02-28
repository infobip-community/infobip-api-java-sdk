
package com.infobip.client.channels.rcs.model;

public final class DialPhoneSuggestion extends Suggestion {
    private String phoneNumber;

    /**
     * <p>
     * DialPhoneSuggestion.
     * </p>
     *
     * @see Suggestion#Suggestion(String, String, SuggestionType)
     */
    public DialPhoneSuggestion(String text, String postbackData) {
        super(text, postbackData, SuggestionType.DIAL_PHONE);
    }

    /**
     * Valid phone number.
     */
    public DialPhoneSuggestion phoneNumber(String phoneNumber) {
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
        if (!(obj instanceof DialPhoneSuggestion)) {
            return false;
        }
        DialPhoneSuggestion other = (DialPhoneSuggestion) obj;
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
        return "DialPhoneSuggestion [phoneNumber=" + phoneNumber + ", text=" + text
                + ", postbackData=" + postbackData + ", type=" + type + "]";
    }
}
