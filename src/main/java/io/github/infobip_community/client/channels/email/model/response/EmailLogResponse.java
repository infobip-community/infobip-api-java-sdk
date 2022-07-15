
package io.github.infobip_community.client.channels.email.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public final class EmailLogResponse {
    private List<LogReport> reports = new ArrayList<>();
}
