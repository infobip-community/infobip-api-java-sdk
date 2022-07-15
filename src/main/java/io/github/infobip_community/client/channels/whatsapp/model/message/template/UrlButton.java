
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class UrlButton extends Button {
    @NotBlank
    @URL
    private final String parameter;

    /**
     * <p>
     * UrlButton.
     * </p>
     *
     * @param parameter URL extension of a dynamic URL defined in the registered
     *     template.
     */
    public UrlButton(String parameter) {
        super(ButtonType.URL);
        this.parameter = parameter;
    }
}
