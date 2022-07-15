
package io.github.infobip_community.client.channels.sms.model.tfa.application.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public final class TfaVerificationResponse {
    private List<VerificationResponse> verifications = new ArrayList<>();
}
