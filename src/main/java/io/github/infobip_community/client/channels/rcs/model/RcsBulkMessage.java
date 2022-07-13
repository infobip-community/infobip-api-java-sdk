
package io.github.infobip_community.client.channels.rcs.model;

import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class RcsBulkMessage {
    @Valid
    private List<RcsMessage> messages = new ArrayList<>();

    /**
     * RcsMessage List.
     */
    public RcsBulkMessage messages(List<RcsMessage> messages) {
        this.messages = messages;
        return this;
    }
}
