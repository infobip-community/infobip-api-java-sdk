
package io.github.infobip_community.client.channels.common;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
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
}
