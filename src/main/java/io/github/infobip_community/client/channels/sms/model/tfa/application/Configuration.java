
package io.github.infobip_community.client.channels.sms.model.tfa.application;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class Configuration {
    private boolean allowMultiplePinVerifications = true;
    private int pinAttempts = 10;
    private String pinTimeToLive = "15m";
    private String sendPinPerApplicationLimit = "10000/1d";
    private String sendPinPerPhoneNumberLimit = "3/1d";
    private String verifyPinLimit = "1/3s";

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
}
