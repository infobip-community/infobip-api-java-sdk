
package io.github.infobip_community.client.channels.sms.model.tfa.pin;

import jakarta.validation.constraints.NotBlank;
import java.util.HashMap;
import java.util.Map;

public final class TfaSendPinCode {
    @NotBlank
    private final String applicationId;
    private String from;
    @NotBlank
    private final String messageId;
    private Map<String, String> placeholders = new HashMap<>();
    @NotBlank
    private final String to;

    /**
     * <p>
     * TfaSendPinCode.
     * </p>
     *
     * @param applicationId The ID of the application that represents your service,
     *     e.g. 2FA for login, 2FA for changing the password, etc.
     * @param messageId The ID of the message template (message body with the PIN
     *     placeholder) that is sent to the recipient.
     * @param to Phone number to which the 2FA message will be sent. Example:
     *     41793026727.
     */
    public TfaSendPinCode(String applicationId, String messageId, String to) {
        this.applicationId = applicationId;
        this.messageId = messageId;
        this.to = to;
    }

    /**
     * Use this parameter if you wish to override the sender ID from the created
     * message template parameter senderId.
     */
    public TfaSendPinCode from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Key value pairs that will be replaced during message sending. Placeholder
     * keys should NOT contain curly brackets and should NOT contain a pin
     * placeholder. Valid example: "placeholders":{"firstName":"John"}
     */
    public TfaSendPinCode placeholders(Map<String, String> placeholders) {
        this.placeholders = placeholders;
        return this;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getFrom() {
        return from;
    }

    public String getMessageId() {
        return messageId;
    }

    public Map<String, String> getPlaceholders() {
        return placeholders;
    }

    public String getTo() {
        return to;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((applicationId == null) ? 0 : applicationId.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((placeholders == null) ? 0 : placeholders.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TfaSendPinCode)) {
            return false;
        }
        TfaSendPinCode other = (TfaSendPinCode) obj;
        if (applicationId == null) {
            if (other.applicationId != null) {
                return false;
            }
        } else if (!applicationId.equals(other.applicationId)) {
            return false;
        }
        if (from == null) {
            if (other.from != null) {
                return false;
            }
        } else if (!from.equals(other.from)) {
            return false;
        }
        if (messageId == null) {
            if (other.messageId != null) {
                return false;
            }
        } else if (!messageId.equals(other.messageId)) {
            return false;
        }
        if (placeholders == null) {
            if (other.placeholders != null) {
                return false;
            }
        } else if (!placeholders.equals(other.placeholders)) {
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
        return "TfaSendPinCode [applicationId=" + applicationId + ", from=" + from + ", messageId="
                + messageId + ", placeholders=" + placeholders + ", to=" + to + "]";
    }
}
