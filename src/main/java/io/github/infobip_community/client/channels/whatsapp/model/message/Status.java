
package io.github.infobip_community.client.channels.whatsapp.model.message;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class Status {
    private int groupId;
    private String groupName;
    private int id;
    private String name;
    private String description;
    private String action;
}
