
package io.github.infobip_community.client.channels.common;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
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
}
