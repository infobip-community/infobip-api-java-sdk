
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class SmsAdvancedBinaryMessage extends AdvancedMessage<SmsAdvancedBinaryMessage> {
    @Valid
    @NotEmpty
    private List<BinaryMessage> messages = new ArrayList<>();

    /**
     * <p>
     * SmsAdvancedBinaryMessage.
     * </p>
     *
     * @param messages An array of message objects of a single message or multiple
     *     messages sent under one bulk ID.
     */
    public SmsAdvancedBinaryMessage(List<BinaryMessage> messages) {
        this.messages = messages;
    }
}
