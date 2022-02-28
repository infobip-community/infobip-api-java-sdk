
package com.infobip.client.channels.webrtc.model.application;

public final class WebRtcApplication {
    private final String name;
    private String description;
    private Ios ios;
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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Ios getIos() {
        return ios;
    }

    public Android getAndroid() {
        return android;
    }

    public boolean isAppToApp() {
        return appToApp;
    }

    public boolean isAppToConversations() {
        return appToConversations;
    }

    public boolean isAppToPhone() {
        return appToPhone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((android == null) ? 0 : android.hashCode());
        result = prime * result + (appToApp ? 1231 : 1237);
        result = prime * result + (appToConversations ? 1231 : 1237);
        result = prime * result + (appToPhone ? 1231 : 1237);
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((ios == null) ? 0 : ios.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebRtcApplication)) {
            return false;
        }
        WebRtcApplication other = (WebRtcApplication) obj;
        if (android == null) {
            if (other.android != null) {
                return false;
            }
        } else if (!android.equals(other.android)) {
            return false;
        }
        if (appToApp != other.appToApp) {
            return false;
        }
        if (appToConversations != other.appToConversations) {
            return false;
        }
        if (appToPhone != other.appToPhone) {
            return false;
        }
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (ios == null) {
            if (other.ios != null) {
                return false;
            }
        } else if (!ios.equals(other.ios)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WebRtcApplication [name=" + name + ", description=" + description + ", ios=" + ios
                + ", android=" + android + ", appToApp=" + appToApp + ", appToConversations="
                + appToConversations + ", appToPhone=" + appToPhone + "]";
    }
}
