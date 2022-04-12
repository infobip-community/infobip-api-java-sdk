
package io.github.infobip_community.client.channels.mms.model.response;

import java.util.ArrayList;
import java.util.List;

public final class MmsReportResponse {
    private List<Report> reports = new ArrayList<>();

    public MmsReportResponse() {}

    public List<Report> getReports() {
        return reports;
    }

    public void setReports(List<Report> reports) {
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
        if (!(obj instanceof MmsReportResponse)) {
            return false;
        }
        MmsReportResponse other = (MmsReportResponse) obj;
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
        return "MmsReportResponse [reports=" + reports + "]";
    }
}
