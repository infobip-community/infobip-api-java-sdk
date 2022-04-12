
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

public final class Phone {
    private String phone;
    private PhoneType type;
    private String waId;

    /**
     * <p>
     * Phone.
     * </p>
     */
    public Phone() {}

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

    public String getPhone() {
        return phone;
    }

    public PhoneType getType() {
        return type;
    }

    public String getWaId() {
        return waId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((waId == null) ? 0 : waId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Phone)) {
            return false;
        }
        Phone other = (Phone) obj;
        if (phone == null) {
            if (other.phone != null) {
                return false;
            }
        } else if (!phone.equals(other.phone)) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        if (waId == null) {
            if (other.waId != null) {
                return false;
            }
        } else if (!waId.equals(other.waId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Phone [phone=" + phone + ", type=" + type + ", waId=" + waId + "]";
    }
}
