
package io.github.infobip_community.client.channels.sms.model.tfa.pin.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class TfaStartAuthenticationResponse {
    private String callStatus;
    private String ncStatus;
    private String pinId;
    private String smsStatus;
    private String to;
}
