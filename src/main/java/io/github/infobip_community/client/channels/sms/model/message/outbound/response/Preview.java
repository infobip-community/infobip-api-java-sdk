
package io.github.infobip_community.client.channels.sms.model.message.outbound.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class Preview {
    private Integer charactersRemaining;
    private Configuration configuration;
    private Integer messageCount;
    private String textPreview;
}
