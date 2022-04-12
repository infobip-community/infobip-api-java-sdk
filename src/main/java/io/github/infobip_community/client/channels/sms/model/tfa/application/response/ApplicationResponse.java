
package io.github.infobip_community.client.channels.sms.model.tfa.application.response;

import io.github.infobip_community.client.channels.sms.model.tfa.application.Configuration;

public final class ApplicationResponse {
    private String applicationId;
    private Configuration configuration;
    private Boolean enabled;
    private String name;

    public ApplicationResponse() {}

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((applicationId == null) ? 0 : applicationId.hashCode());
        result = prime * result + ((configuration == null) ? 0 : configuration.hashCode());
        result = prime * result + ((enabled == null) ? 0 : enabled.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationResponse)) {
            return false;
        }
        ApplicationResponse other = (ApplicationResponse) obj;
        if (applicationId == null) {
            if (other.applicationId != null) {
                return false;
            }
        } else if (!applicationId.equals(other.applicationId)) {
            return false;
        }
        if (configuration == null) {
            if (other.configuration != null) {
                return false;
            }
        } else if (!configuration.equals(other.configuration)) {
            return false;
        }
        if (enabled == null) {
            if (other.enabled != null) {
                return false;
            }
        } else if (!enabled.equals(other.enabled)) {
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
        return "ApplicationResponse [applicationId=" + applicationId + ", configuration="
                + configuration + ", enabled=" + enabled + ", name=" + name + "]";
    }
}
