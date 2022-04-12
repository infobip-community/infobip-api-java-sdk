
package io.github.infobip_community.client.channels.sms.model.tfa.application;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public final class TfaApplication {
    @Valid
    private Configuration configuration;
    private boolean enabled;
    @NotBlank
    private final String name;

    /**
     * <p>
     * TfaApplication.
     * </p>
     *
     * @param name 2FA application name.
     */
    public TfaApplication(String name) {
        this.name = name;
    }

    /**
     * Created 2FA application configuration.
     */
    public TfaApplication configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Indicates whether the created application is enabled.
     */
    public TfaApplication enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((configuration == null) ? 0 : configuration.hashCode());
        result = prime * result + (enabled ? 1231 : 1237);
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TfaApplication)) {
            return false;
        }
        TfaApplication other = (TfaApplication) obj;
        if (configuration == null) {
            if (other.configuration != null) {
                return false;
            }
        } else if (!configuration.equals(other.configuration)) {
            return false;
        }
        if (enabled != other.enabled) {
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
        return "TfaApplication [configuration=" + configuration + ", enabled=" + enabled + ", name="
                + name + "]";
    }
}
