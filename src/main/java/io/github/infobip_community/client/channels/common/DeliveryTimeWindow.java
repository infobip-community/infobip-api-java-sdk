
package io.github.infobip_community.client.channels.common;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

public final class DeliveryTimeWindow {
    @Valid
    @NotEmpty
    private List<Day> days = new ArrayList<>();
    @Valid
    private From from;
    @Valid
    private To to;

    /**
     * <p>
     * DeliveryTimeWindow.
     * </p>
     *
     * @param days Days of the week which are included in the delivery time window.
     *     At least one day must be provided.
     */
    public DeliveryTimeWindow(List<Day> days) {
        this.days = days;
    }

    /**
     * The exact time of day to end sending messages. Time is expressed in the UTC
     * time zone. If set, use it together with the from property with minimum 1 hour
     * difference.
     */
    public DeliveryTimeWindow from(From from) {
        this.from = from;
        return this;
    }

    /**
     * The exact time of day to end sending messages. Time is expressed in the UTC
     * time zone. If set, use it together with the from property with minimum 1 hour
     * difference.
     */
    public DeliveryTimeWindow to(To to) {
        this.to = to;
        return this;
    }

    public List<Day> getDays() {
        return days;
    }

    public From getFrom() {
        return from;
    }

    public To getTo() {
        return to;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((days == null) ? 0 : days.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryTimeWindow)) {
            return false;
        }
        DeliveryTimeWindow other = (DeliveryTimeWindow) obj;
        if (days == null) {
            if (other.days != null) {
                return false;
            }
        } else if (!days.equals(other.days)) {
            return false;
        }
        if (from == null) {
            if (other.from != null) {
                return false;
            }
        } else if (!from.equals(other.from)) {
            return false;
        }
        if (to == null) {
            if (other.to != null) {
                return false;
            }
        } else if (!to.equals(other.to)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DeliveryTimeWindow [days=" + days + ", from=" + from + ", to=" + to + "]";
    }
}
