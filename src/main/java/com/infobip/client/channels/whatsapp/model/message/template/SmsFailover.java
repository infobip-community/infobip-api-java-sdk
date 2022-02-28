
package com.infobip.client.channels.whatsapp.model.message.template;

public final class SmsFailover {
    private final String from;
    private final String text;

    /**
     * <p>
     * SmsFailover.
     * </p>
     *
     * @param from SMS sender number. Must be in international format.
     * @param text Content of the SMS that will be sent.
     */
    public SmsFailover(String from, String text) {
        this.from = from;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsFailover)) {
            return false;
        }
        SmsFailover other = (SmsFailover) obj;
        if (from == null) {
            if (other.from != null) {
                return false;
            }
        } else if (!from.equals(other.from)) {
            return false;
        }
        if (text == null) {
            if (other.text != null) {
                return false;
            }
        } else if (!text.equals(other.text)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SmsFailover [from=" + from + ", text=" + text + "]";
    }
}
