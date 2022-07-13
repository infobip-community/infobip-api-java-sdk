
package io.github.infobip_community.client.channels.email.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@NoArgsConstructor
@Data
public final class EmailRescheduleResponse {
    private String bulkId;
    private OffsetDateTime sendAt;
}
