
package com.infobip.client.channels.whatsapp.model.message.contact;

import com.infobip.client.channels.whatsapp.model.message.MessageContent;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

public final class Content extends MessageContent {
    @Valid
    @NotEmpty
    private List<Contact> contacts = new ArrayList<>();

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param contacts An array of contacts sent in a WhatsApp message.
     */
    public Content(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contacts == null) ? 0 : contacts.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content other = (Content) obj;
        if (contacts == null) {
            if (other.contacts != null) {
                return false;
            }
        } else if (!contacts.equals(other.contacts)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Content [contacts=" + contacts + "]";
    }
}
