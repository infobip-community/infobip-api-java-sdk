
package io.github.infobip_community.client.channels.mms.model.response;

import io.github.infobip_community.client.channels.common.Price;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@NoArgsConstructor
@Data
public final class Report {
    private String bulkId;
    private String messageId;
    private String to;
    private String from;
    private OffsetDateTime sentAt;
    private OffsetDateTime doneAt;
    private Integer mmsCount;
    private String mccMnc;
    private String callbackData;
    private Price price;
    private Status status;
    private Status error;
}
