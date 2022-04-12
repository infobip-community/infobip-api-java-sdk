
package io.github.infobip_community.client.channels.mms.model;

import io.github.infobip_community.client.channels.common.DeliveryTimeWindow;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import java.time.OffsetDateTime;
import org.hibernate.validator.constraints.URL;

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

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getValidityPeriodMinutes() {
        return validityPeriodMinutes;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public OffsetDateTime getSendAt() {
        return sendAt;
    }

    public boolean isIntermediateReport() {
        return intermediateReport;
    }

    public DeliveryTimeWindow getDeliveryTimeWindow() {
        return deliveryTimeWindow;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((callbackData == null) ? 0 : callbackData.hashCode());
        result = prime * result
                + ((deliveryTimeWindow == null) ? 0 : deliveryTimeWindow.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + (intermediateReport ? 1231 : 1237);
        result = prime * result + ((notifyUrl == null) ? 0 : notifyUrl.hashCode());
        result = prime * result + ((sendAt == null) ? 0 : sendAt.hashCode());
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        result = prime * result
                + ((validityPeriodMinutes == null) ? 0 : validityPeriodMinutes.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Head)) {
            return false;
        }
        Head other = (Head) obj;
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
        if (from == null) {
            if (other.from != null) {
                return false;
            }
        } else if (!from.equals(other.from)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (intermediateReport != other.intermediateReport) {
            return false;
        }
        if (notifyUrl == null) {
            if (other.notifyUrl != null) {
                return false;
            }
        } else if (!notifyUrl.equals(other.notifyUrl)) {
            return false;
        }
        if (sendAt == null) {
            if (other.sendAt != null) {
                return false;
            }
        } else if (!sendAt.equals(other.sendAt)) {
            return false;
        }
        if (subject == null) {
            if (other.subject != null) {
                return false;
            }
        } else if (!subject.equals(other.subject)) {
            return false;
        }
        if (to == null) {
            if (other.to != null) {
                return false;
            }
        } else if (!to.equals(other.to)) {
            return false;
        }
        if (validityPeriodMinutes == null) {
            if (other.validityPeriodMinutes != null) {
                return false;
            }
        } else if (!validityPeriodMinutes.equals(other.validityPeriodMinutes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Head [from=" + from + ", to=" + to + ", id=" + id + ", subject=" + subject
                + ", validityPeriodMinutes=" + validityPeriodMinutes + ", callbackData="
                + callbackData + ", notifyUrl=" + notifyUrl + ", sendAt=" + sendAt
                + ", intermediateReport=" + intermediateReport + ", deliveryTimeWindow="
                + deliveryTimeWindow + "]";
    }
}
