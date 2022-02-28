
package com.infobip.client.channels.webrtc.model;

import java.util.ArrayList;
import java.util.List;

public final class WebrtcApplicationResponses {
    private List<WebrtcApplicationResponse> responses = new ArrayList<>();

    public WebrtcApplicationResponses() {}

    public List<WebrtcApplicationResponse> getResponses() {
        return responses;
    }

    public void setResponses(List<WebrtcApplicationResponse> responses) {
        this.responses = responses;
    }
}
