
package io.github.infobip_community.client.channels.email.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class EmailValidateAddress {
    @NotBlank
    @Email
    @Size(max = 2147483647)
    private final String to;

    /**
     * <p>
     * EmailValidateAddress.
     * </p>
     *
     * @param to Email address of the recipient.
     */
    public EmailValidateAddress(String to) {
        this.to = to;
    }
}
