
package io.github.infobip_community.client.channels.common;

import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

@Getter
@EqualsAndHashCode
@ToString
public abstract class FromTo {
    @NotNull
    @Range(min = 0, max = 23)
    protected final Integer hour;
    @NotNull
    @Range(min = 0, max = 59)
    protected final Integer minute;

    /**
     * <p>
     * FromTo.
     * </p>
     *
     * @param hour Hour when the time window opens when used in the from property or
     *     closes when used in the to property.
     * @param minute Minute when the time window opens when used in the from
     *     property or closes when used in the to property.
     */
    public FromTo(Integer hour, Integer minute) {
        this.hour = hour;
        this.minute = minute;
    }
}
