
package io.github.infobip_community.client.channels.rcs.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public abstract class Content {
    protected final ContentType type;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @param type Message type, describing type of message which is going to be
     *     sent over RCS
     */
    public Content(ContentType type) {
        this.type = type;
    }
}
