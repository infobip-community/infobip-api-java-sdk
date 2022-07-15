
package io.github.infobip_community.client.channels.mms.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class Message {
    private String to;
    private Status status;
    private String messageId;
}
