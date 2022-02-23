
package com.infobip.client.channels.rcs.model;

public final class SmsFailover {
    private String from;
    private String text;
    private int validityPeriod;
    private ValidityPeriodTimeUnit validityPeriodTimeUnit;

    /**
     * <p>
     * Create SmsFailover with required fields.
     * </p>
     *
     * @param from Message failover sender
     * @param text Message failover text
     */
    public SmsFailover(String from, String text) {
        this.from = from;
        this.text = text;
    }

    /**
     * Message failover validity period.
     */
    public SmsFailover validityPeriod(int validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Message failover validity period time unit.
     */
    public SmsFailover validityPeriodTimeUnit(ValidityPeriodTimeUnit validityPeriodTimeUnit) {
        this.validityPeriodTimeUnit = validityPeriodTimeUnit;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public String getText() {
        return text;
    }

    public int getValidityPeriod() {
        return validityPeriod;
    }

    public ValidityPeriodTimeUnit getValidityPeriodTimeUnit() {
        return validityPeriodTimeUnit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + validityPeriod;
        result = prime * result
                + ((validityPeriodTimeUnit == null) ? 0 : validityPeriodTimeUnit.hashCode());
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
        if (validityPeriod != other.validityPeriod) {
            return false;
        }
        if (validityPeriodTimeUnit != other.validityPeriodTimeUnit) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SmsFailover [from=" + from + ", text=" + text + ", validityPeriod=" + validityPeriod
                + ", validityPeriodTimeUnit=" + validityPeriodTimeUnit + "]";
    }
}
