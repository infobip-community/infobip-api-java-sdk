
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class Destination {
    private String messageId;
    @NotNull
    @Size(min = 0, max = 50)
    private final String to;

    /**
     * <p>
     * Destination.
     * </p>
     *
     * @param to Message destination address. Addresses must be in international
     *     format (Example: 41793026727).
     */
    public Destination(String to) {
        this.to = to;
    }

    /**
     * The ID that uniquely identifies the message sent.
     */
    public Destination messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
}
