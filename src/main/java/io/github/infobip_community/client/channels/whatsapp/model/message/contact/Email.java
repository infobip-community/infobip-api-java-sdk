
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class Email {
    @jakarta.validation.constraints.Email
    private String email;
    private EmailType type;

    /**
     * Contact's email.
     */
    public Email email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Type of the email. Can be HOME or WORK.
     */
    public Email type(EmailType type) {
        this.type = type;
        return this;
    }
}
