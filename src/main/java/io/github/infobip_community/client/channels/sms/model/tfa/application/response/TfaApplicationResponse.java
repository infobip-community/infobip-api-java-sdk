
package io.github.infobip_community.client.channels.sms.model.tfa.application.response;

import java.util.ArrayList;
import java.util.List;

public final class TfaApplicationResponse {
    private List<ApplicationResponse> applications = new ArrayList<>();

    public TfaApplicationResponse() {}

    public List<ApplicationResponse> getApplications() {
        return applications;
    }

    public void setApplications(List<ApplicationResponse> applications) {
        this.applications = applications;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((applications == null) ? 0 : applications.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TfaApplicationResponse)) {
            return false;
        }
        TfaApplicationResponse other = (TfaApplicationResponse) obj;
        if (applications == null) {
            if (other.applications != null) {
                return false;
            }
        } else if (!applications.equals(other.applications)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TfaApplicationResponse [applications=" + applications + "]";
    }
}
