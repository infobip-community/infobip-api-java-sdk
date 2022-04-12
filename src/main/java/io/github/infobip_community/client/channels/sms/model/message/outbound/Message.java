
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import io.github.infobip_community.client.channels.common.DeliveryTimeWindow;
import io.github.infobip_community.client.channels.common.NotifyContentType;
import io.github.infobip_community.client.channels.sms.model.common.Regional;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.validator.constraints.URL;

@SuppressWarnings({"unchecked", "rawtypes"})
public abstract class Message<T extends Message<T>> {
    @Size(min = 0, max = 4000)
    protected String callbackData;
    @Valid
    protected DeliveryTimeWindow deliveryTimeWindow;
    @Valid
    @NotEmpty
    protected List<Destination> destinations = new ArrayList<>();
    protected boolean flash;
    protected String from;
    protected boolean intermediateReport;
    protected NotifyContentType notifyContentType;
    @URL
    protected String notifyUrl;
    @Valid
    protected Regional regional;
    protected OffsetDateTime sendAt;
    protected Long validityPeriod;

    /**
     * <p>
     * Message.
     * </p>
     *
     * @param destinations An array of destination objects for where messages are
     *     being sent. A valid destination is required.
     */
    public Message(List<Destination> destinations) {
        this.destinations = destinations;
    }

    /**
     * Additional data that can be used for identifying, managing, or monitoring a
     * message. Data included here will also be automatically included in the
     * message Delivery Report. The maximum value is 4000 characters and any
     * overhead may be truncated.
     */
    public T callbackData(String callbackData) {
        this.callbackData = callbackData;
        return (T) this;
    }

    /**
     * Sets specific scheduling options to send a message within daily or hourly
     * intervals.
     */
    public T deliveryTimeWindow(DeliveryTimeWindow deliveryTimeWindow) {
        this.deliveryTimeWindow = deliveryTimeWindow;
        return (T) this;
    }

    /**
     * Allows for sending a flash SMS to automatically appear on recipient devices
     * without interaction. Set to true to enable flash SMS, or leave the default
     * value, false to send a standard SMS.
     */
    public T flash(boolean flash) {
        this.flash = flash;
        return (T) this;
    }

    /**
     * The sender ID which can be alphanumeric or numeric (e.g., CompanyName). Make
     * sure you don't exceed character limit.
     */
    public T from(String from) {
        this.from = from;
        return (T) this;
    }

    /**
     * The real-time intermediate delivery report containing GSM error codes,
     * messages status, pricing, network and country codes, etc., which will be sent
     * on your callback server. Defaults to false.
     */
    public T intermediateReport(boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
        return (T) this;
    }

    /**
     * Preferred delivery report content type, application/json or application/xml.
     */
    public T notifyContentType(NotifyContentType notifyContentType) {
        this.notifyContentType = notifyContentType;
        return (T) this;
    }

    /**
     * The URL on your call back server on to which a delivery report will be sent.
     * The retry cycle for when your URL becomes unavailable uses the following
     * formula: 1min + (1min * retryNumber * retryNumber).
     */
    public T notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return (T) this;
    }

    /**
     * Region-specific parameters, often imposed by local laws. Use this, if country
     * or region that you are sending an SMS to requires additional information.
     */
    public T regional(Regional regional) {
        this.regional = regional;
        return (T) this;
    }

    /**
     * Date and time when the message is to be sent. Used for scheduled SMS. Has the
     * following format: yyyy-MM-dd'T'HH:mm:ss.SSSZ, and can only be scheduled for
     * no later than 180 days in advance.
     */
    public T sendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
        return (T) this;
    }

    /**
     * The message validity period in minutes. When the period expires, it will not
     * be allowed for the message to be sent. Validity period longer than 48h is not
     * supported. Any bigger value will automatically default back to 2880.
     */
    public T validityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return (T) this;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public DeliveryTimeWindow getDeliveryTimeWindow() {
        return deliveryTimeWindow;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public boolean isFlash() {
        return flash;
    }

    public String getFrom() {
        return from;
    }

    public boolean isIntermediateReport() {
        return intermediateReport;
    }

    public NotifyContentType getNotifyContentType() {
        return notifyContentType;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public Regional getRegional() {
        return regional;
    }

    public OffsetDateTime getSendAt() {
        return sendAt;
    }

    public Long getValidityPeriod() {
        return validityPeriod;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((callbackData == null) ? 0 : callbackData.hashCode());
        result = prime * result
                + ((deliveryTimeWindow == null) ? 0 : deliveryTimeWindow.hashCode());
        result = prime * result + ((destinations == null) ? 0 : destinations.hashCode());
        result = prime * result + (flash ? 1231 : 1237);
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + (intermediateReport ? 1231 : 1237);
        result = prime * result + ((notifyContentType == null) ? 0 : notifyContentType.hashCode());
        result = prime * result + ((notifyUrl == null) ? 0 : notifyUrl.hashCode());
        result = prime * result + ((regional == null) ? 0 : regional.hashCode());
        result = prime * result + ((sendAt == null) ? 0 : sendAt.hashCode());
        result = prime * result + ((validityPeriod == null) ? 0 : validityPeriod.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message other = (Message) obj;
        if (callbackData == null) {
            if (other.callbackData != null) {
                return false;
            }
        } else if (!callbackData.equals(other.callbackData)) {
            return false;
        }
        if (deliveryTimeWindow == null) {
            if (other.deliveryTimeWindow != null) {
                return false;
            }
        } else if (!deliveryTimeWindow.equals(other.deliveryTimeWindow)) {
            return false;
        }
        if (destinations == null) {
            if (other.destinations != null) {
                return false;
            }
        } else if (!destinations.equals(other.destinations)) {
            return false;
        }
        if (flash != other.flash) {
            return false;
        }
        if (from == null) {
            if (other.from != null) {
                return false;
            }
        } else if (!from.equals(other.from)) {
            return false;
        }
        if (intermediateReport != other.intermediateReport) {
            return false;
        }
        if (notifyContentType != other.notifyContentType) {
            return false;
        }
        if (notifyUrl == null) {
            if (other.notifyUrl != null) {
                return false;
            }
        } else if (!notifyUrl.equals(other.notifyUrl)) {
            return false;
        }
        if (regional == null) {
            if (other.regional != null) {
                return false;
            }
        } else if (!regional.equals(other.regional)) {
            return false;
        }
        if (sendAt == null) {
            if (other.sendAt != null) {
                return false;
            }
        } else if (!sendAt.equals(other.sendAt)) {
            return false;
        }
        if (validityPeriod == null) {
            if (other.validityPeriod != null) {
                return false;
            }
        } else if (!validityPeriod.equals(other.validityPeriod)) {
            return false;
        }
        return true;
    }
}
