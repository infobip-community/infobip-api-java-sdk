
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class SmsFailover {
    @NotBlank
    @Size(min = 1, max = 24)
    private final String from;
    @NotBlank
    @Size(min = 1, max = 4096)
    private final String text;

    /**
     * <p>
     * SmsFailover.
     * </p>
     *
     * @param from SMS sender number. Must be in international format.
     * @param text Content of the SMS that will be sent.
     */
    public SmsFailover(String from, String text) {
        this.from = from;
        this.text = text;
    }
}
