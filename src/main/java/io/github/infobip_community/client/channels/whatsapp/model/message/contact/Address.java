
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

public final class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String countryCode;
    private AddressType type;

    /**
     * <p>
     * Address.
     * </p>
     */
    public Address() {}

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

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public AddressType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((zip == null) ? 0 : zip.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address other = (Address) obj;
        if (city == null) {
            if (other.city != null) {
                return false;
            }
        } else if (!city.equals(other.city)) {
            return false;
        }
        if (country == null) {
            if (other.country != null) {
                return false;
            }
        } else if (!country.equals(other.country)) {
            return false;
        }
        if (countryCode == null) {
            if (other.countryCode != null) {
                return false;
            }
        } else if (!countryCode.equals(other.countryCode)) {
            return false;
        }
        if (state == null) {
            if (other.state != null) {
                return false;
            }
        } else if (!state.equals(other.state)) {
            return false;
        }
        if (street == null) {
            if (other.street != null) {
                return false;
            }
        } else if (!street.equals(other.street)) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        if (zip == null) {
            if (other.zip != null) {
                return false;
            }
        } else if (!zip.equals(other.zip)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
                + ", country=" + country + ", countryCode=" + countryCode + ", type=" + type + "]";
    }
}
