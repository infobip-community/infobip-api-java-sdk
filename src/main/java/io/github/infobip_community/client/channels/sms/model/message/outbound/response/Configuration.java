
package io.github.infobip_community.client.channels.sms.model.message.outbound.response;

import io.github.infobip_community.client.channels.sms.model.message.outbound.Language;
import io.github.infobip_community.client.channels.sms.model.message.outbound.Transliteration;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class Configuration {
    private Language language;
    private Transliteration transliteration;
}
