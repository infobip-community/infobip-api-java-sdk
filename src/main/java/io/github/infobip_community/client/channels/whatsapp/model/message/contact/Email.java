
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

public final class Email {
    @jakarta.validation.constraints.Email
    private String email;
    private EmailType type;

    /**
     * <p>
     * Email.
     * </p>
     */
    public Email() {}

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

    public String getEmail() {
        return email;
    }

    public EmailType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Email)) {
            return false;
        }
        Email other = (Email) obj;
        if (email == null) {
            if (other.email != null) {
                return false;
            }
        } else if (!email.equals(other.email)) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Email [email=" + email + ", type=" + type + "]";
    }
}
