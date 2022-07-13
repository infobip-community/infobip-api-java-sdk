
package io.github.infobip_community.client.channels.sms.model.message.scheduled.response;

import io.github.infobip_community.client.channels.common.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class SmsBulkStatusResponse {
    private String bulkId;
    private Status status;
}
