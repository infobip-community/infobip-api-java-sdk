
package com.infobip.client.channels.webrtc.model.application;

import java.util.ArrayList;
import java.util.List;

public final class WebRtcApplicationResponses {
    private List<WebRtcApplicationResponse> responses = new ArrayList<>();

    public WebRtcApplicationResponses() {}

    public List<WebRtcApplicationResponse> getResponses() {
        return responses;
    }

    public void setResponses(List<WebRtcApplicationResponse> responses) {
        this.responses = responses;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((responses == null) ? 0 : responses.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebRtcApplicationResponses)) {
            return false;
        }
        WebRtcApplicationResponses other = (WebRtcApplicationResponses) obj;
        if (responses == null) {
            if (other.responses != null) {
                return false;
            }
        } else if (!responses.equals(other.responses)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WebRtcApplicationResponses [responses=" + responses + "]";
    }
}
