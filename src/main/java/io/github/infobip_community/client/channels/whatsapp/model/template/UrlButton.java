
package io.github.infobip_community.client.channels.whatsapp.model.template;

import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class UrlButton extends Button {
    @NotEmpty
    @URL
    private final String url;

    /**
     * <p>
     * UrlButton.
     * </p>
     *
     * @param text {@link Button#Button(ButtonType, String)}
     * @param url URL to which the end-user will be directed when hitting the
     *     button. URL is expected to start with https:// or http://. Can be static
     *     or dynamic. For dynamic URL registration, add a placeholder {{1}} at the
     *     end of the link. Example: https://www.infobip.com/{{1}}
     */
    public UrlButton(String text, String url) {
        super(ButtonType.URL, text);
        this.url = url;
    }
}
