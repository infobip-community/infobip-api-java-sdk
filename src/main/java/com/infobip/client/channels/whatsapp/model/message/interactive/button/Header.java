
package com.infobip.client.channels.whatsapp.model.message.interactive.button;

public abstract class Header {
    protected final HeaderType type;

    /**
     * <p>
     * Header.
     * </p>
     *
     * @param type HeaderType
     */
    public Header(HeaderType type) {
        this.type = type;
    }

    public HeaderType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header other = (Header) obj;
        if (type != other.type) {
            return false;
        }
        return true;
    }
}
