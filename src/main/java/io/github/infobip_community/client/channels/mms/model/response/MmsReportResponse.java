
package io.github.infobip_community.client.channels.mms.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public final class MmsReportResponse {
    private List<Report> reports = new ArrayList<>();
}
