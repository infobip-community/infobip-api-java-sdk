
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class SmsFailover {
    @NotBlank
    private String from;
    @NotBlank
    private String text;
    private Integer validityPeriod;
    private ValidityPeriodTimeUnit validityPeriodTimeUnit;

    /**
     * <p>
     * SmsFailover.
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
    public SmsFailover validityPeriod(Integer validityPeriod) {
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
}
