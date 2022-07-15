
package io.github.infobip_community.client.channels.sms.model.common;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class ResultPrice {
    private String currency;
    private Double pricePerMessage;
}
