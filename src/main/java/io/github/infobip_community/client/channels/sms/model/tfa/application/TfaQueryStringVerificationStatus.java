
package io.github.infobip_community.client.channels.sms.model.tfa.application;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class TfaQueryStringVerificationStatus {
    @NotBlank
    private final String msisdn;
    private boolean verified;
    private boolean sent;

    /**
     * <p>
     * TfaQueryStringVerificationStatus.
     * </p>
     *
     * @param msisdn Filter by msisdn (phone number) for which verification status
     *     is checked.
     */
    public TfaQueryStringVerificationStatus(String msisdn) {
        this.msisdn = msisdn;
    }

    /**
     * Filter by verified (true or false).
     */
    public TfaQueryStringVerificationStatus verified(boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * Filter by message sent status (true or false).
     */
    public TfaQueryStringVerificationStatus sent(boolean sent) {
        this.sent = sent;
        return this;
    }
}
