
package io.github.infobip_community.client.channels.sms.model.tfa.template.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public final class TfaTemplateResponse {
    private List<TemplateResponse> templates = new ArrayList<>();
}
