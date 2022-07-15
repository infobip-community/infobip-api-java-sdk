
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class QuickReplyButton extends Button {
    @NotBlank
    @Size(max = 128)
    private final String parameter;

    /**
     * <p>
     * QuickReplyButton.
     * </p>
     *
     * @param parameter Payload of a quick reply button.
     */
    public QuickReplyButton(String parameter) {
        super(ButtonType.QUICK_REPLY);
        this.parameter = parameter;
    }
}
