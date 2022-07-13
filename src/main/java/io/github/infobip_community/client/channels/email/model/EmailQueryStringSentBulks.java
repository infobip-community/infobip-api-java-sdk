
package io.github.infobip_community.client.channels.email.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class EmailQueryStringSentBulks {
    @NotBlank
    private final String bulkId;
}
