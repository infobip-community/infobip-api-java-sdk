
package io.github.infobip_community.client.channels.sms.model.message.scheduled.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@NoArgsConstructor
@Data
public final class SmsBulkResponse {
    private String bulkId;
    private OffsetDateTime sendAt;
}
