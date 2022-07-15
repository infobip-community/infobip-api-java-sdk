
package io.github.infobip_community.client.channels.sms.model.message.inbound.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public final class SmsInboundMessageResponse {
    private Integer messageCount;
    private Integer pendingMessageCount;
    private List<MessageResult> results = new ArrayList<>();
}
