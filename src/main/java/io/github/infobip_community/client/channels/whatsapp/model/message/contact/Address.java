
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String countryCode;
    private AddressType type;

    /**
     * Street name.
     */
    public Address street(String street) {
        this.street = street;
        return this;
    }

    /**
     * City name.
     */
    public Address city(String city) {
        this.city = city;
        return this;
    }

    /**
     * State name.
     */
    public Address state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Zip code value.
     */
    public Address zip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Country name.
     */
    public Address country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Country code value.
     */
    public Address countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Type of the address. Can be HOME or WORK.
     */
    public Address type(AddressType type) {
        this.type = type;
        return this;
    }
}
