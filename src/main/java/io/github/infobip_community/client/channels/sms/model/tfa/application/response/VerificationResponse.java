
package io.github.infobip_community.client.channels.sms.model.tfa.application.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class VerificationResponse {
    private String msisdn;
    private Long sentAt;
    private Boolean verified;
    private Long verifiedAt;
}
