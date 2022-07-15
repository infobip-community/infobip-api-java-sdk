
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
public final class SmsAdvancedTextMessage extends AdvancedMessage<SmsAdvancedTextMessage> {
    @Valid
    @NotEmpty
    private List<TextMessage> messages = new ArrayList<>();
    @Valid
    private Tracking tracking;

    /**
     * <p>
     * SmsAdvancedTextMessage.
     * <p/>
     *
     * @param messages An array of message objects of a single message or multiple
     *     messages sent under one bulk ID.
     */
    public SmsAdvancedTextMessage(List<TextMessage> messages) {
        this.messages = messages;
    }

    /**
     * Sets up tracking parameters to track conversion metrics and type.
     */
    public SmsAdvancedTextMessage tracking(Tracking tracking) {
        this.tracking = tracking;
        return this;
    }
}
