
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

@Getter
@EqualsAndHashCode
@ToString
public final class ResourceUrl {
    @NotBlank
    @Size(min = 1, max = 1000)
    @URL
    private final String url;

    /**
     * <p>
     * ResourceUrl.
     * </p>
     *
     * @param url URL of the given resource
     */
    public ResourceUrl(String url) {
        this.url = url;
    }
}
