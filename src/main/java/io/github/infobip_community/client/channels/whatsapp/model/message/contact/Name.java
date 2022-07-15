
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class Name {
    @NotEmpty
    private final String firstName;
    private String lastName;
    private String middleName;
    private String nameSuffix;
    private String namePrefix;
    @NotEmpty
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
}
