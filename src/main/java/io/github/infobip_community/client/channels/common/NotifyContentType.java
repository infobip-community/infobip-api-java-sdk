
package io.github.infobip_community.client.channels.common;

import com.fasterxml.jackson.annotation.JsonValue;

public enum NotifyContentType {
    //@formatter:off
    JSON("application/json"),
    XML("application/xml");
    //@formatter:on

    private final String notifyContentType;

    private NotifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
    }

    @JsonValue
    public String getNotifyContentType() {
        return notifyContentType;
    }

    @Override
    public String toString() {
        return notifyContentType;
    }
}
