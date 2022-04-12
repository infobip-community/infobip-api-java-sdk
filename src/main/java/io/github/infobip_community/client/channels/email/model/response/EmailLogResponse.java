
package io.github.infobip_community.client.channels.email.model.response;

import java.util.ArrayList;
import java.util.List;

public final class EmailLogResponse {
    private List<LogReport> reports = new ArrayList<>();

    public EmailLogResponse() {}

    public List<LogReport> getReports() {
        return reports;
    }

    public void setReports(List<LogReport> reports) {
        this.reports = reports;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((reports == null) ? 0 : reports.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailLogResponse)) {
            return false;
        }
        EmailLogResponse other = (EmailLogResponse) obj;
        if (reports == null) {
            if (other.reports != null) {
                return false;
            }
        } else if (!reports.equals(other.reports)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmailLogResponse [reports=" + reports + "]";
    }
}
