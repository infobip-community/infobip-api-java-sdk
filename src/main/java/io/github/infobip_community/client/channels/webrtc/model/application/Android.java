
package io.github.infobip_community.client.channels.webrtc.model.application;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class Android {
    @NotBlank
    private String fcmServerKey;

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
}
