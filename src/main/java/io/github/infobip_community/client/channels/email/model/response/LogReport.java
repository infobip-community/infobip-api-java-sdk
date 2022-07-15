
package io.github.infobip_community.client.channels.email.model.response;

import io.github.infobip_community.client.channels.common.Price;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@NoArgsConstructor
@Data
public final class LogReport {
    private String messageId;
    private String to;
    private String from;
    private String text;
    private OffsetDateTime sentAt;
    private OffsetDateTime doneAt;
    private Integer messageCount;
    private Price price;
    private Status status;
    private String bulkId;
}
