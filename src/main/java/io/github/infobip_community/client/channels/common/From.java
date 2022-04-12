
package io.github.infobip_community.client.channels.common;

public final class From extends FromTo {
    /**
     * <p>
     * From.
     * </p>
     *
     * @param hour Hour when the time window opens when used in the from property or
     *     closes when used in the to property.
     * @param minute Minute when the time window opens when used in the from
     *     property or closes when used in the to property.
     */
    public From(Integer hour, Integer minute) {
        super(hour, minute);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof From)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "From [hour=" + hour + ", minute=" + minute + "]";
    }
}
