
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public final class Contact {
    private List<Address> addresses = new ArrayList<>();
    private String birthday;
    @Valid
    private List<Email> emails = new ArrayList<>();
    @Valid
    @NotNull
    private final Name name;
    private Org org;
    private List<Phone> phones = new ArrayList<>();
    @Valid
    private List<Url> urls = new ArrayList<>();

    /**
     * <p>
     * Contact.
     * </p>
     *
     * @param name Contains information about contact's name.
     */
    public Contact(Name name) {
        this.name = name;
    }

    /**
     * Array of addresses information.
     */
    public Contact addresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Date of birth in YYYY-MM-DD format.
     */
    public Contact birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    /**
     * Array of emails information.
     */
    public Contact emails(List<Email> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Contains information about contact's company.
     */
    public Contact org(Org org) {
        this.org = org;
        return this;
    }

    /**
     * Array of phones information.
     */
    public Contact phones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Array of urls information.
     */
    public Contact urls(List<Url> urls) {
        this.urls = urls;
        return this;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public String getBirthday() {
        return birthday;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public Name getName() {
        return name;
    }

    public Org getOrg() {
        return org;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public List<Url> getUrls() {
        return urls;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((addresses == null) ? 0 : addresses.hashCode());
        result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
        result = prime * result + ((emails == null) ? 0 : emails.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((org == null) ? 0 : org.hashCode());
        result = prime * result + ((phones == null) ? 0 : phones.hashCode());
        result = prime * result + ((urls == null) ? 0 : urls.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) obj;
        if (addresses == null) {
            if (other.addresses != null) {
                return false;
            }
        } else if (!addresses.equals(other.addresses)) {
            return false;
        }
        if (birthday == null) {
            if (other.birthday != null) {
                return false;
            }
        } else if (!birthday.equals(other.birthday)) {
            return false;
        }
        if (emails == null) {
            if (other.emails != null) {
                return false;
            }
        } else if (!emails.equals(other.emails)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (org == null) {
            if (other.org != null) {
                return false;
            }
        } else if (!org.equals(other.org)) {
            return false;
        }
        if (phones == null) {
            if (other.phones != null) {
                return false;
            }
        } else if (!phones.equals(other.phones)) {
            return false;
        }
        if (urls == null) {
            if (other.urls != null) {
                return false;
            }
        } else if (!urls.equals(other.urls)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contact [addresses=" + addresses + ", birthday=" + birthday + ", emails=" + emails
                + ", name=" + name + ", org=" + org + ", phones=" + phones + ", urls=" + urls + "]";
    }
}
