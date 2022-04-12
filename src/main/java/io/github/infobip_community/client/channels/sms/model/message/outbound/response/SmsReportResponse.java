
package io.github.infobip_community.client.channels.sms.model.message.outbound.response;

import java.util.ArrayList;
import java.util.List;

public final class SmsReportResponse {
    private List<ReportResult> results = new ArrayList<>();

    public SmsReportResponse() {}

    public List<ReportResult> getResults() {
        return results;
    }

    public void setResults(List<ReportResult> results) {
        this.results = results;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((results == null) ? 0 : results.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsReportResponse)) {
            return false;
        }
        SmsReportResponse other = (SmsReportResponse) obj;
        if (results == null) {
            if (other.results != null) {
                return false;
            }
        } else if (!results.equals(other.results)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SmsReportResponse [results=" + results + "]";
    }
}
