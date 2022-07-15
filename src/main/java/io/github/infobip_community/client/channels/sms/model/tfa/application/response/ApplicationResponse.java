
package io.github.infobip_community.client.channels.sms.model.tfa.application.response;

import io.github.infobip_community.client.channels.sms.model.tfa.application.Configuration;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class ApplicationResponse {
    private String applicationId;
    private Configuration configuration;
    private Boolean enabled;
    private String name;
}
