
package com.infobip.client.channels.whatsapp.model;

public final class Name {
    private final String firstName;
    private String lastName;
    private String middleName;
    private String nameSuffix;
    private String namePrefix;
    private final String formattedName;

    public Name(String firstName, String formattedName) {
        this.firstName = firstName;
        this.formattedName = formattedName;
    }

    public Name lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Name middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public Name nameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
        return this;
    }

    public Name namePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
}
