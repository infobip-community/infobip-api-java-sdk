
package io.github.infobip_community.client.channels.mms.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class Status {
    private Integer groupId;
    private String groupName;
    private Integer id;
    private String name;
    private String description;
}
