
package io.github.infobip_community.client.channels.sms.model.tfa.template.response;

import io.github.infobip_community.client.channels.sms.model.common.Regional;
import io.github.infobip_community.client.channels.sms.model.tfa.template.Language;
import io.github.infobip_community.client.channels.sms.model.tfa.template.PinType;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class TemplateResponse {
    private String applicationId;
    private Language language;
    private String messageId;
    private String messageText;
    private Integer pinLength;
    private String pinPlaceholder;
    private PinType pinType;
    private Regional regional;
    private String repeatDtmf;
    private String senderId;
    private Double speechRate;
}
