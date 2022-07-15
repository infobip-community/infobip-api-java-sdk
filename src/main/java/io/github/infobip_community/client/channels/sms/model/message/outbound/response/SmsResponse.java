
package io.github.infobip_community.client.channels.sms.model.message.outbound.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public final class SmsResponse {
    private String bulkId;
    private List<Message> messages = new ArrayList<>();
}
