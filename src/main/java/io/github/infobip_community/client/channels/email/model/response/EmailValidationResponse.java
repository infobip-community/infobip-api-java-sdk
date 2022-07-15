
package io.github.infobip_community.client.channels.email.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class EmailValidationResponse {
    private String to;
    private String validMailbox;
    private Boolean validSyntax;
    private Boolean catchAll;
    private String didYouMean;
    private Boolean disposable;
    private Boolean roleBased;
}
