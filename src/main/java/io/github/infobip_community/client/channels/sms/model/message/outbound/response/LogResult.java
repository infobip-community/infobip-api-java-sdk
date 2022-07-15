
package io.github.infobip_community.client.channels.sms.model.message.outbound.response;

import io.github.infobip_community.client.channels.sms.model.common.ResultPrice;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@NoArgsConstructor
@Data
public final class LogResult {
    private String bulkId;
    private OffsetDateTime doneAt;
    private ResultError error;
    private String from;
    private String mccMnc;
    private String messageId;
    private ResultPrice price;
    private OffsetDateTime sentAt;
    private Integer smsCount;
    private Status status;
    private String text;
    private String to;
}
