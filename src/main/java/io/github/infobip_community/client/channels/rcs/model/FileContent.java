
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class FileContent extends Content {
    @Valid
    @NotNull
    private final ResourceUrl file;
    @Valid
    private ResourceUrl thumbnail;

    /**
     * <p>
     * FileContent.
     * </p>
     *
     * @param file Resource object describing the thumbnail of the card
     */
    public FileContent(ResourceUrl file) {
        super(ContentType.FILE);
        this.file = file;
    }

    /**
     * Resource object describing the thumbnail of the card.
     */
    public FileContent thumbnail(ResourceUrl thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
}
