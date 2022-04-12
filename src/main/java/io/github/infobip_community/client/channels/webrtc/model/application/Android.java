
package io.github.infobip_community.client.channels.webrtc.model.application;

import jakarta.validation.constraints.NotBlank;

public final class Android {
    @NotBlank
    private String fcmServerKey;

    public Android() {}

    /**
     * <p>
     * Android.
     * </p>
     *
     * @param fcmServerKey FCM Server Key used to enable Android push notifications.
     */
    public Android(String fcmServerKey) {
        this.fcmServerKey = fcmServerKey;
    }

    /**
     * FCM Server Key used to enable Android push notifications.
     */
    public String getFcmServerKey() {
        return fcmServerKey;
    }

    public void setFcmServerKey(String fcmServerKey) {
        this.fcmServerKey = fcmServerKey;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fcmServerKey == null) ? 0 : fcmServerKey.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Android)) {
            return false;
        }
        Android other = (Android) obj;
        if (fcmServerKey == null) {
            if (other.fcmServerKey != null) {
                return false;
            }
        } else if (!fcmServerKey.equals(other.fcmServerKey)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Android [fcmServerKey=" + fcmServerKey + "]";
    }
}
