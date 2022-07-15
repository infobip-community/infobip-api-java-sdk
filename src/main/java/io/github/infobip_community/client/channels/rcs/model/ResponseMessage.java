
package io.github.infobip_community.client.channels.rcs.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class ResponseMessage {
    private String to;
    private int messageCount;
    private String messageId;
    private Status status;
}
