
package io.github.infobip_community.client.channels.email.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class Message {
    private Integer messageCount;
    private String messageId;
    private SendStatus status;
    private String to;
}
