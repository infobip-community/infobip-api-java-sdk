
package com.infobip.client.channels.whatsapp.model;

import java.util.ArrayList;
import java.util.List;

public final class Contact {
    private List<Address> addresses = new ArrayList<>();
    private String birthday;
    private List<Email> emails = new ArrayList<>();
    private final Name name;
    private Org org;
    private List<Phone> phones = new ArrayList<>();
    private List<Url> urls = new ArrayList<>();

    public Contact(Name name) {
        this.name = name;
    }

    public Contact addresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    public Contact birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public Contact emails(List<Email> emails) {
        this.emails = emails;
        return this;
    }

    public Contact org(Org org) {
        this.org = org;
        return this;
    }

    public Contact phones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    public Contact urls(List<Url> urls) {
        this.urls = urls;
        return this;
    }
}
