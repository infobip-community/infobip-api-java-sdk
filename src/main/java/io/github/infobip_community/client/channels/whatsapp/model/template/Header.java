
package io.github.infobip_community.client.channels.whatsapp.model.template;

public abstract class Header {
    protected final HeaderFormat format;

    /**
     * <p>
     * Header.
     * </p>
     *
     * @param format HeaderFormat
     */
    public Header(HeaderFormat format) {
        this.format = format;
    }

    public HeaderFormat getFormat() {
        return format;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((format == null) ? 0 : format.hashCode());
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
        if (format != other.format) {
            return false;
        }
        return true;
    }
}
