
package io.github.infobip_community.client.channels.email.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

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

    public String getTo() {
        return to;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailValidateAddress)) {
            return false;
        }
        EmailValidateAddress other = (EmailValidateAddress) obj;
        if (to == null) {
            if (other.to != null) {
                return false;
            }
        } else if (!to.equals(other.to)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmailValidateAddress [to=" + to + "]";
    }
}
