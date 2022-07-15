
package io.github.infobip_community.client.channels.sms.model.message.inbound.response;

import io.github.infobip_community.client.channels.sms.model.common.ResultPrice;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@NoArgsConstructor
@Data
public final class MessageResult {
    private String callbackData;
    private String cleanText;
    private String from;
    private String keyword;
    private String messageId;
    private ResultPrice price;
    private OffsetDateTime receivedAt;
    private Integer smsCount;
    private String text;
    private String to;
}
