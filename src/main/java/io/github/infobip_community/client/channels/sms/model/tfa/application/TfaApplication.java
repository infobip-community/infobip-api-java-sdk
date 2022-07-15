
package io.github.infobip_community.client.channels.sms.model.tfa.application;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
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
}
