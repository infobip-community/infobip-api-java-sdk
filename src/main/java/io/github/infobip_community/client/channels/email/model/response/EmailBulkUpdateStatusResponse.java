
package io.github.infobip_community.client.channels.email.model.response;

import io.github.infobip_community.client.channels.common.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class EmailBulkUpdateStatusResponse {
    private String bulkId;
    private Status status;
}
