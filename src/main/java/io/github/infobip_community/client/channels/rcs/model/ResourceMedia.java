
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class ResourceMedia {
    @Valid
    @NotNull
    private final ResourceUrl file;
    @Valid
    private ResourceUrl thumbnail;
    @NotNull
    private final Height height;

    /**
     * <p>
     * ResourceMedia.
     * </p>
     *
     * @param file Resource object describing the thumbnail of the card
     * @param height Height of the card media
     */
    public ResourceMedia(ResourceUrl file, Height height) {
        this.file = file;
        this.height = height;
    }

    /**
     * Resource object describing the thumbnail of the card.
     */
    public ResourceMedia thumbnail(ResourceUrl thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
}
