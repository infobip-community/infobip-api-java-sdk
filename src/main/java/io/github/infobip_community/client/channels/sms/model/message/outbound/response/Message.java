
package io.github.infobip_community.client.channels.sms.model.message.outbound.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class Message {
    private String messageId;
    private Status status;
    private String to;
}
