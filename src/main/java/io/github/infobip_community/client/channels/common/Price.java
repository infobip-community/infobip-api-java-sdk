
package io.github.infobip_community.client.channels.common;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class Price {
    private Integer pricePerMessage;
    private String currency;
}
