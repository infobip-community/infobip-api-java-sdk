
package io.github.infobip_community.client.channels.webrtc.model.application;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class WebRtcApplication {
    @NotBlank
    private final String name;
    @Size(max = 160)
    private String description;
    @Valid
    private Ios ios;
    @Valid
    private Android android;
    private boolean appToApp = false;
    private boolean appToConversations = false;
    private boolean appToPhone = false;

    /**
     * <p>
     * WebRtcApplication.
     * </p>
     *
     * @param name Application name
     */
    public WebRtcApplication(String name) {
        this.name = name;
    }

    /**
     * Application description containing up to 160 characters.
     */
    public WebRtcApplication description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Configuration used to enable iOS push notifications.
     */
    public WebRtcApplication ios(Ios ios) {
        this.ios = ios;
        return this;
    }

    /**
     * Configuration used to enable Android push notifications.
     */
    public WebRtcApplication android(Android android) {
        this.android = android;
        return this;
    }

    /**
     * Enable to communicate app to app.
     */
    public WebRtcApplication appToApp(boolean appToApp) {
        this.appToApp = appToApp;
        return this;
    }

    /**
     * Enable to forward incoming calls to an agent on Conversations platform.
     */
    public WebRtcApplication appToConversations(boolean appToConversations) {
        this.appToConversations = appToConversations;
        return this;
    }

    /**
     * Enable to forward incoming calls to a phone number.
     */
    public WebRtcApplication appToPhone(boolean appToPhone) {
        this.appToPhone = appToPhone;
        return this;
    }
}
