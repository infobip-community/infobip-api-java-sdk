
package io.github.infobip_community.client.channels.email.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class SendStatus {
    private String action;
    private String description;
    private Integer groupId;
    private String groupName;
    private Integer id;
    private String name;
}
