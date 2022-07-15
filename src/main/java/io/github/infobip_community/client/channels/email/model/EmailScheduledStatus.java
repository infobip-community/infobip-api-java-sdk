
package io.github.infobip_community.client.channels.email.model;

import io.github.infobip_community.client.channels.common.Status;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class EmailScheduledStatus {
    @NotNull
    private final Status status;
}
