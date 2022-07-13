
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
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
}
