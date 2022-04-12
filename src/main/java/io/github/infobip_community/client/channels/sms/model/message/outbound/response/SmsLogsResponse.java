
package io.github.infobip_community.client.channels.sms.model.message.outbound.response;

import java.util.ArrayList;
import java.util.List;

public final class SmsLogsResponse {
    private List<LogResult> results = new ArrayList<>();

    public SmsLogsResponse() {}

    public List<LogResult> getResults() {
        return results;
    }

    public void setResults(List<LogResult> results) {
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
        if (!(obj instanceof SmsLogsResponse)) {
            return false;
        }
        SmsLogsResponse other = (SmsLogsResponse) obj;
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
        return "SmsLogsResponse [results=" + results + "]";
    }
}
