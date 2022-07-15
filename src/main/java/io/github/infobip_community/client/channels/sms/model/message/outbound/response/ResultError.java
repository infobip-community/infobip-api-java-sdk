
package io.github.infobip_community.client.channels.sms.model.message.outbound.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class ResultError {
    private String description;
    private Integer groupId;
    private String groupName;
    private Integer id;
    private String name;
    private boolean permanent;
}
