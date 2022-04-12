
package io.github.infobip_community.client.channels.sms.model.tfa.application;

public final class Configuration {
    private boolean allowMultiplePinVerifications = true;
    private int pinAttempts = 10;
    private String pinTimeToLive = "15m";
    private String sendPinPerApplicationLimit = "10000/1d";
    private String sendPinPerPhoneNumberLimit = "3/1d";
    private String verifyPinLimit = "1/3s";

    /**
     * <p>
     * Configuration.
     * </p>
     */
    public Configuration() {}

    /**
     * Indicates whether multiple PIN verification is allowed.
     */
    public Configuration allowMultiplePinVerifications(boolean allowMultiplePinVerifications) {
        this.allowMultiplePinVerifications = allowMultiplePinVerifications;
        return this;
    }

    /**
     * Number of possible PIN attempts.
     */
    public Configuration pinAttempts(int pinAttempts) {
        this.pinAttempts = pinAttempts;
        return this;
    }

    /**
     * Validity period of PIN in specified time unit. Required format:
     * {timeLength}{timeUnit}. timeLength is optional with a default value of 1.
     * timeUnit can be set to: ms, s, m, h or d representing milliseconds, seconds,
     * minutes, hours, and days respectively. Must not exceed one year, although
     * much lower value is recommended.
     */
    public Configuration pinTimeToLive(String pinTimeToLive) {
        this.pinTimeToLive = pinTimeToLive;
        return this;
    }

    /**
     * Overall number of requests over a specififed time period for generating a PIN
     * and sending an SMS using a single application. Required format:
     * {attempts}/{timeLength}{timeUnit}. attempts is mandatory and timeLength is
     * optional with a default value of 1. timeUnit is one of: ms, s, m, h or d
     * representing milliseconds, seconds, minutes, hours, and days respectively.
     * Must not exceed one year, although much lower value is recommended.
     */
    public Configuration sendPinPerApplicationLimit(String sendPinPerApplicationLimit) {
        this.sendPinPerApplicationLimit = sendPinPerApplicationLimit;
        return this;
    }

    /**
     * Number of requests over a specififed time period for generating a PIN and
     * sending an SMS to one phone number (MSISDN). Required format:
     * {attempts}/{timeLength}{timeUnit}. attempts is mandatory and timeLength is
     * optional with a default value of 1. timeUnit is one of: ms, s, m, h or d
     * representing milliseconds, seconds, minutes, hours, and days respectively.
     * Must not exceed one year, although much lower value is recommended.
     */
    public Configuration sendPinPerPhoneNumberLimit(String sendPinPerPhoneNumberLimit) {
        this.sendPinPerPhoneNumberLimit = sendPinPerPhoneNumberLimit;
        return this;
    }

    /**
     * The number of PIN verification requests over a specififed time period from
     * one phone number (MSISDN). Required format:
     * {attempts}/{timeLength}{timeUnit}. attempts is mandatory and timeLength is
     * optional with a default value of 1. timeUnit is one of: ms, s, m, h or d
     * representing milliseconds, seconds, minutes, hours, and days respectively.
     * Must not exceed one day, although much lower value is recommended.
     */
    public Configuration verifyPinLimit(String verifyPinLimit) {
        this.verifyPinLimit = verifyPinLimit;
        return this;
    }

    public boolean isAllowMultiplePinVerifications() {
        return allowMultiplePinVerifications;
    }

    public int getPinAttempts() {
        return pinAttempts;
    }

    public String getPinTimeToLive() {
        return pinTimeToLive;
    }

    public String getSendPinPerApplicationLimit() {
        return sendPinPerApplicationLimit;
    }

    public String getSendPinPerPhoneNumberLimit() {
        return sendPinPerPhoneNumberLimit;
    }

    public String getVerifyPinLimit() {
        return verifyPinLimit;
    }

    public void setAllowMultiplePinVerifications(boolean allowMultiplePinVerifications) {
        this.allowMultiplePinVerifications = allowMultiplePinVerifications;
    }

    public void setPinAttempts(int pinAttempts) {
        this.pinAttempts = pinAttempts;
    }

    public void setPinTimeToLive(String pinTimeToLive) {
        this.pinTimeToLive = pinTimeToLive;
    }

    public void setSendPinPerApplicationLimit(String sendPinPerApplicationLimit) {
        this.sendPinPerApplicationLimit = sendPinPerApplicationLimit;
    }

    public void setSendPinPerPhoneNumberLimit(String sendPinPerPhoneNumberLimit) {
        this.sendPinPerPhoneNumberLimit = sendPinPerPhoneNumberLimit;
    }

    public void setVerifyPinLimit(String verifyPinLimit) {
        this.verifyPinLimit = verifyPinLimit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (allowMultiplePinVerifications ? 1231 : 1237);
        result = prime * result + pinAttempts;
        result = prime * result + ((pinTimeToLive == null) ? 0 : pinTimeToLive.hashCode());
        result = prime * result + ((sendPinPerApplicationLimit == null) ? 0
                : sendPinPerApplicationLimit.hashCode());
        result = prime * result + ((sendPinPerPhoneNumberLimit == null) ? 0
                : sendPinPerPhoneNumberLimit.hashCode());
        result = prime * result + ((verifyPinLimit == null) ? 0 : verifyPinLimit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration other = (Configuration) obj;
        if (allowMultiplePinVerifications != other.allowMultiplePinVerifications) {
            return false;
        }
        if (pinAttempts != other.pinAttempts) {
            return false;
        }
        if (pinTimeToLive == null) {
            if (other.pinTimeToLive != null) {
                return false;
            }
        } else if (!pinTimeToLive.equals(other.pinTimeToLive)) {
            return false;
        }
        if (sendPinPerApplicationLimit == null) {
            if (other.sendPinPerApplicationLimit != null) {
                return false;
            }
        } else if (!sendPinPerApplicationLimit.equals(other.sendPinPerApplicationLimit)) {
            return false;
        }
        if (sendPinPerPhoneNumberLimit == null) {
            if (other.sendPinPerPhoneNumberLimit != null) {
                return false;
            }
        } else if (!sendPinPerPhoneNumberLimit.equals(other.sendPinPerPhoneNumberLimit)) {
            return false;
        }
        if (verifyPinLimit == null) {
            if (other.verifyPinLimit != null) {
                return false;
            }
        } else if (!verifyPinLimit.equals(other.verifyPinLimit)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Configuration [allowMultiplePinVerifications=" + allowMultiplePinVerifications
                + ", pinAttempts=" + pinAttempts + ", pinTimeToLive=" + pinTimeToLive
                + ", sendPinPerApplicationLimit=" + sendPinPerApplicationLimit
                + ", sendPinPerPhoneNumberLimit=" + sendPinPerPhoneNumberLimit + ", verifyPinLimit="
                + verifyPinLimit + "]";
    }
}
