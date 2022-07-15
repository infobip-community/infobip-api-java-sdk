
package io.github.infobip_community.client.channels.mms.model;

import io.github.infobip_community.client.channels.common.DeliveryTimeWindow;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import java.time.OffsetDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

@Getter
@EqualsAndHashCode
@ToString
public final class Head {
    @NotBlank
    private final String from;
    @NotBlank
    private final String to;
    private String id;
    private String subject;
    private Integer validityPeriodMinutes;
    private String callbackData;
    @URL
    private String notifyUrl;
    private OffsetDateTime sendAt;
    private boolean intermediateReport;
    @Valid
    private DeliveryTimeWindow deliveryTimeWindow;

    /**
     * <p>
     * Head.
     * </p>
     *
     * @param from The originator (or sender) of the message; i.e. your contact
     *     number as seen by the end user.
     * @param to Mobile number to which MMS message is sent.
     */
    public Head(String from, String to) {
        this.from = from;
        this.to = to;
    }

    /**
     * External id, if not provided id will be returned in response.
     */
    public Head id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Subject line for the MMS message.
     */
    public Head subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Validity period of message in minutes, default is 48h. After the validity
     * period has expired message will exit send retry.
     */
    public Head validityPeriodMinutes(Integer validityPeriodMinutes) {
        this.validityPeriodMinutes = validityPeriodMinutes;
        return this;
    }

    /**
     * Additional client's data that will be sent on the notifyUrl. The maximum
     * value is 200 characters.
     */
    public Head callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * The URL on your call back server on which the Delivery report will be sent.
     */
    public Head notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Date and time when the message is to be sent. Used for scheduled SMS (see
     * Scheduled SMS endpoints for more details). Has the following format:
     * yyyy-MM-dd'T'HH:mm:ss.SSSZ.
     */
    public Head sendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /**
     * The real-time intermediate delivery report containing GSM error codes,
     * messages status, pricing, network and country codes, etc., which will be sent
     * on your callback server. Defaults to false.
     */
    public Head intermediateReport(boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
        return this;
    }

    /**
     * Set specific scheduling options to send a message within daily or hourly
     * intervals.
     */
    public Head deliveryTimeWindow(DeliveryTimeWindow deliveryTimeWindow) {
        this.deliveryTimeWindow = deliveryTimeWindow;
        return this;
    }
}
