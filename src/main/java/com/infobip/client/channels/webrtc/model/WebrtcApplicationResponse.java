
package com.infobip.client.channels.webrtc.model;

import com.infobip.client.channels.webrtc.model.application.Android;
import com.infobip.client.channels.webrtc.model.application.Ios;

/**
 * <p>
 * WebrtcApplicationResponse.
 * </p>
 */
public final class WebrtcApplicationResponse {
    private String id;
    private String name;
    private String description;
    private Ios ios;
    private Android android;
    private Boolean appToApp;
    private Boolean appToConversations;
    private Boolean appToPhone;

    public WebrtcApplicationResponse() {}

    /**
     * Application identifier.
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Application name.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Application description containing up to 160 characters.
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Configuration used to enable iOS push notifications.
     */
    public Ios getIos() {
        return ios;
    }

    public void setIos(Ios ios) {
        this.ios = ios;
    }

    /**
     * Configuration used to enable Android push notifications.
     */
    public Android getAndroid() {
        return android;
    }

    public void setAndroid(Android android) {
        this.android = android;
    }

    /**
     * Enable to communicate app to app.
     */
    public Boolean getAppToApp() {
        return appToApp;
    }

    public void setAppToApp(Boolean appToApp) {
        this.appToApp = appToApp;
    }

    /**
     * Enable to forward incoming calls to an agent on Conversations platform.
     */
    public Boolean getAppToConversations() {
        return appToConversations;
    }

    public void setAppToConversations(Boolean appToConversations) {
        this.appToConversations = appToConversations;
    }

    /**
     * Enable to forward incoming calls to a phone number.
     */
    public Boolean getAppToPhone() {
        return appToPhone;
    }

    public void setAppToPhone(Boolean appToPhone) {
        this.appToPhone = appToPhone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((android == null) ? 0 : android.hashCode());
        result = prime * result + ((appToApp == null) ? 0 : appToApp.hashCode());
        result = prime * result
                + ((appToConversations == null) ? 0 : appToConversations.hashCode());
        result = prime * result + ((appToPhone == null) ? 0 : appToPhone.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((ios == null) ? 0 : ios.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebrtcApplicationResponse)) {
            return false;
        }
        WebrtcApplicationResponse other = (WebrtcApplicationResponse) obj;
        if (android == null) {
            if (other.android != null) {
                return false;
            }
        } else if (!android.equals(other.android)) {
            return false;
        }
        if (appToApp == null) {
            if (other.appToApp != null) {
                return false;
            }
        } else if (!appToApp.equals(other.appToApp)) {
            return false;
        }
        if (appToConversations == null) {
            if (other.appToConversations != null) {
                return false;
            }
        } else if (!appToConversations.equals(other.appToConversations)) {
            return false;
        }
        if (appToPhone == null) {
            if (other.appToPhone != null) {
                return false;
            }
        } else if (!appToPhone.equals(other.appToPhone)) {
            return false;
        }
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
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
        return "WebrtcApplicationResponse [id=" + id + ", name=" + name + ", description="
                + description + ", ios=" + ios + ", android=" + android + ", appToApp=" + appToApp
                + ", appToConversations=" + appToConversations + ", appToPhone=" + appToPhone + "]";
    }
}
