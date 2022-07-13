
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class BinaryMessage extends Message<BinaryMessage> {
    @Valid
    private Binary binary;

    /**
     * <p>
     * BinaryMessage.
     * </p>
     *
     * @param destinations An array of destination objects for where messages are
     *     being sent. A valid destination is required.
     */
    public BinaryMessage(List<Destination> destinations) {
        super(destinations);
    }

    /**
     * Binary.
     */
    public BinaryMessage binary(Binary binary) {
        this.binary = binary;
        return this;
    }
}
