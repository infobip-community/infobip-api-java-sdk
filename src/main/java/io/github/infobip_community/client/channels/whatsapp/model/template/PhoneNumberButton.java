
package io.github.infobip_community.client.channels.whatsapp.model.template;

import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class PhoneNumberButton extends Button {
    @NotEmpty
    private final String phoneNumber;

    /**
     * <p>
     * PhoneNumberButton.
     * </p>
     *
     * @param text {@link Button#Button(ButtonType, String)}
     * @param phoneNumber Phone number to which a phone call would be placed by
     *     end-user when hitting the button.
     */
    public PhoneNumberButton(String text, String phoneNumber) {
        super(ButtonType.PHONE_NUMBER, text);
        this.phoneNumber = phoneNumber;
    }
}
