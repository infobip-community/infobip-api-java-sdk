
package io.github.infobip_community.client.channels.sms.model.message.scheduled;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class SmsQueryStringScheduledMessages {
    @NotBlank
    private final String bulkId;

    /**
     * <p>
     * SmsQueryStringScheduledMessages.
     * </p>
     *
     * @param bulkId bulkId
     */
    public SmsQueryStringScheduledMessages(String bulkId) {
        this.bulkId = bulkId;
    }
}
