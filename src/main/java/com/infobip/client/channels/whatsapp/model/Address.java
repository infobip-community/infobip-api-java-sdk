
package com.infobip.client.channels.whatsapp.model;

public final class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String countryCode;
    private AddressType type;

    public Address() {}

    public Address street(String street) {
        this.street = street;
        return this;
    }

    public Address city(String city) {
        this.city = city;
        return this;
    }

    public Address state(String state) {
        this.state = state;
        return this;
    }

    public Address zip(String zip) {
        this.zip = zip;
        return this;
    }

    public Address country(String country) {
        this.country = country;
        return this;
    }

    public Address countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public Address type(AddressType type) {
        this.type = type;
        return this;
    }
}
