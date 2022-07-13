
package io.github.infobip_community.client.channels.whatsapp.model.template;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class QuickReplyButton extends Button {
    /**
     * <p>
     * QuickReplyButton.
     * </p>
     *
     * @param text {@link Button#Button(ButtonType, String)}
     */
    public QuickReplyButton(String text) {
        super(ButtonType.QUICK_REPLY, text);
    }
}
