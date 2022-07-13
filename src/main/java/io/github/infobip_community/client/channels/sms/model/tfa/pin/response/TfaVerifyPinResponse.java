
package io.github.infobip_community.client.channels.sms.model.tfa.pin.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class TfaVerifyPinResponse {
    private Integer attemptsRemaining;
    private String msisdn;
    private String pinError;
    private String pinId;
    private Boolean verified;
}
