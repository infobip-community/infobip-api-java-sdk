
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
public final class Body {
    @NotEmpty
    private List<String> placeholders = new ArrayList<>();

    /**
     * <p>
     * Body.
     * </p>
     *
     * @param placeholders Template's parameters values ordered as registered in the
     *     template. The value must not be null, but can be an empty array if the
     *     template was registered without placeholders. Values within the array
     *     must not be null or empty.
     */
    public Body(List<String> placeholders) {
        this.placeholders = placeholders;
    }
}
