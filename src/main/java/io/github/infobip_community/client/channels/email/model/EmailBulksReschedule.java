
package io.github.infobip_community.client.channels.email.model;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.OffsetDateTime;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class EmailBulksReschedule {
    @NotNull
    private final OffsetDateTime sendAt;
}
