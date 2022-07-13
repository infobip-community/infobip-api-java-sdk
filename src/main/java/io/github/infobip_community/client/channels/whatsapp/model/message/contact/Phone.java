
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class Phone {
    private String phone;
    private PhoneType type;
    private String waId;

    /**
     * Contact's phone number.
     */
    public Phone phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Type of the phone number. Can be CELL, MAIN, IPHONE, HOME or WORK.
     */
    public Phone type(PhoneType type) {
        this.type = type;
        return this;
    }

    /**
     * Contact's WhatsApp ID.
     */
    public Phone waId(String waId) {
        this.waId = waId;
        return this;
    }
}
