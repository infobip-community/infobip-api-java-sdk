
package com.infobip.client.channels.whatsapp.model.message.contact;

public final class Name {
    private final String firstName;
    private String lastName;
    private String middleName;
    private String nameSuffix;
    private String namePrefix;
    private final String formattedName;

    /**
     * <p>
     * Name.
     * </p>
     *
     * @param firstName Contact's first name.
     * @param formattedName Contact's full name as it normally appears.
     */
    public Name(String firstName, String formattedName) {
        this.firstName = firstName;
        this.formattedName = formattedName;
    }

    /**
     * Contact's last name.
     */
    public Name lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Contact's middle name.
     */
    public Name middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Contact's name suffix.
     */
    public Name nameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
        return this;
    }

    /**
     * Contact's name prefix.
     */
    public Name namePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public String getFormattedName() {
        return formattedName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((formattedName == null) ? 0 : formattedName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
        result = prime * result + ((namePrefix == null) ? 0 : namePrefix.hashCode());
        result = prime * result + ((nameSuffix == null) ? 0 : nameSuffix.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name other = (Name) obj;
        if (firstName == null) {
            if (other.firstName != null) {
                return false;
            }
        } else if (!firstName.equals(other.firstName)) {
            return false;
        }
        if (formattedName == null) {
            if (other.formattedName != null) {
                return false;
            }
        } else if (!formattedName.equals(other.formattedName)) {
            return false;
        }
        if (lastName == null) {
            if (other.lastName != null) {
                return false;
            }
        } else if (!lastName.equals(other.lastName)) {
            return false;
        }
        if (middleName == null) {
            if (other.middleName != null) {
                return false;
            }
        } else if (!middleName.equals(other.middleName)) {
            return false;
        }
        if (namePrefix == null) {
            if (other.namePrefix != null) {
                return false;
            }
        } else if (!namePrefix.equals(other.namePrefix)) {
            return false;
        }
        if (nameSuffix == null) {
            if (other.nameSuffix != null) {
                return false;
            }
        } else if (!nameSuffix.equals(other.nameSuffix)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Name [firstName=" + firstName + ", lastName=" + lastName + ", middleName="
                + middleName + ", nameSuffix=" + nameSuffix + ", namePrefix=" + namePrefix
                + ", formattedName=" + formattedName + "]";
    }
}
