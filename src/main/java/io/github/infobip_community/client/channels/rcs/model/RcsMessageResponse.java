
package io.github.infobip_community.client.channels.rcs.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public final class RcsMessageResponse {
    private List<ResponseMessage> messages = new ArrayList<>();
}
