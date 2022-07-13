
package io.github.infobip_community.client.channels.mms.model.response;

import io.github.infobip_community.client.channels.common.Price;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@NoArgsConstructor
@Data
public final class InboundReport {
    private String messageId;
    private String to;
    private String from;
    private String message;
    private OffsetDateTime receivedAt;
    private Integer mmsCount;
    private String callbackData;
    private Price price;
}
