
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import io.github.infobip_community.client.channels.common.NotifyContentType;
import jakarta.validation.constraints.NotBlank;
import java.time.OffsetDateTime;
import org.hibernate.validator.constraints.URL;

public final class SmsQueryStringMessage {
    @NotBlank
    private final String username;
    @NotBlank
    private final String password;
    private String bulkId;
    private String from;
    @NotBlank
    private final String to;
    private String text;
    private boolean flash;
    private Transliteration transliteration;
    private LanguageCode languageCode;
    private boolean intermediateReport;
    @URL
    private String notifyUrl;
    private NotifyContentType notifyContentType;
    private String callbackData;
    private Integer validityPeriod;
    private OffsetDateTime sendAt;
    private String track;
    private String processKey;
    private String trackingType;
    private String indiaDltContentTemplateId;
    private String indiaDltPrincipalEntityId;

    /**
     * <p>
     * SmsQueryStringMessage.
     * </p>
     *
     * @param username Username for authentication.
     * @param password Password for authentication.
     * @param to List of message recipients.
     *
     */
    public SmsQueryStringMessage(String username, String password, String to) {
        this.username = username;
        this.password = password;
        this.to = to;
    }

    /**
     * Unique ID assigned to the request if messaging multiple recipients or sending
     * multiple messages via a single API request.
     */
    public SmsQueryStringMessage bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * The sender ID which can be alphanumeric or numeric (e.g., CompanyName).
     */
    public SmsQueryStringMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Content of the message being sent.
     */
    public SmsQueryStringMessage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Sends a flash SMS if set to true.
     */
    public SmsQueryStringMessage flash(boolean flash) {
        this.flash = flash;
        return this;
    }

    /**
     * Conversion of a message text from one script to another.
     */
    public SmsQueryStringMessage transliteration(Transliteration transliteration) {
        this.transliteration = transliteration;
        return this;
    }

    /**
     * Code for language character set of a message content.
     */
    public SmsQueryStringMessage languageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Use a real-time intermediate delivery report that will be sent on your
     * callback server.
     */
    public SmsQueryStringMessage intermediateReport(boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
        return this;
    }

    /**
     * The URL on your call back server on to which a delivery report will be sent.
     */
    public SmsQueryStringMessage notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Preferred delivery report content type, application/json or application/xml.
     */
    public SmsQueryStringMessage notifyContentType(NotifyContentType notifyContentType) {
        this.notifyContentType = notifyContentType;
        return this;
    }

    /**
     * Additional client data to be sent over the notifyUrl.
     */
    public SmsQueryStringMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * The message validity period in minutes. When the period expires, it will not
     * be allowed for the message to be sent. Validity period longer than 48h is not
     * supported. Any bigger value will automatically default back to 2880.
     */
    public SmsQueryStringMessage validityPeriod(Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Date and time when the message is to be sent. Used for scheduled SMS. Has the
     * following format: yyyy-MM-dd'T'HH:mm:ss.SSSZ. Must be sooner than 180 days
     * from now.
     */
    public SmsQueryStringMessage sendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /**
     * Sets the conversion element to be tracked.
     */
    public SmsQueryStringMessage track(String track) {
        this.track = track;
        return this;
    }

    /**
     * The process key which uniquely identifies conversion tracking.
     */
    public SmsQueryStringMessage processKey(String processKey) {
        this.processKey = processKey;
        return this;
    }

    /**
     * Sets a custom conversion type naming convention, e.g. ONE_TIME_PIN,
     * SOCIAL_INVITES, etc.
     */
    public SmsQueryStringMessage trackingType(String trackingType) {
        this.trackingType = trackingType;
        return this;
    }

    /**
     * The ID of your registered DLT (Distributed Ledger Technology) content
     * template.
     */
    public SmsQueryStringMessage indiaDltContentTemplateId(String indiaDltContentTemplateId) {
        this.indiaDltContentTemplateId = indiaDltContentTemplateId;
        return this;
    }

    /**
     * Your DLT (Distributed Ledger Technology) entity id.
     */
    public SmsQueryStringMessage indiaDltPrincipalEntityId(String indiaDltPrincipalEntityId) {
        this.indiaDltPrincipalEntityId = indiaDltPrincipalEntityId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBulkId() {
        return bulkId;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getText() {
        return text;
    }

    public boolean isFlash() {
        return flash;
    }

    public Transliteration getTransliteration() {
        return transliteration;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public boolean isIntermediateReport() {
        return intermediateReport;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public NotifyContentType getNotifyContentType() {
        return notifyContentType;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public Integer getValidityPeriod() {
        return validityPeriod;
    }

    public OffsetDateTime getSendAt() {
        return sendAt;
    }

    public String getTrack() {
        return track;
    }

    public String getProcessKey() {
        return processKey;
    }

    public String getTrackingType() {
        return trackingType;
    }

    public String getIndiaDltContentTemplateId() {
        return indiaDltContentTemplateId;
    }

    public String getIndiaDltPrincipalEntityId() {
        return indiaDltPrincipalEntityId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bulkId == null) ? 0 : bulkId.hashCode());
        result = prime * result + ((callbackData == null) ? 0 : callbackData.hashCode());
        result = prime * result + (flash ? 1231 : 1237);
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result
                + ((indiaDltContentTemplateId == null) ? 0 : indiaDltContentTemplateId.hashCode());
        result = prime * result
                + ((indiaDltPrincipalEntityId == null) ? 0 : indiaDltPrincipalEntityId.hashCode());
        result = prime * result + (intermediateReport ? 1231 : 1237);
        result = prime * result + ((languageCode == null) ? 0 : languageCode.hashCode());
        result = prime * result + ((notifyContentType == null) ? 0 : notifyContentType.hashCode());
        result = prime * result + ((notifyUrl == null) ? 0 : notifyUrl.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((processKey == null) ? 0 : processKey.hashCode());
        result = prime * result + ((sendAt == null) ? 0 : sendAt.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        result = prime * result + ((track == null) ? 0 : track.hashCode());
        result = prime * result + ((trackingType == null) ? 0 : trackingType.hashCode());
        result = prime * result + ((transliteration == null) ? 0 : transliteration.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        result = prime * result + ((validityPeriod == null) ? 0 : validityPeriod.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsQueryStringMessage)) {
            return false;
        }
        SmsQueryStringMessage other = (SmsQueryStringMessage) obj;
        if (bulkId == null) {
            if (other.bulkId != null) {
                return false;
            }
        } else if (!bulkId.equals(other.bulkId)) {
            return false;
        }
        if (callbackData == null) {
            if (other.callbackData != null) {
                return false;
            }
        } else if (!callbackData.equals(other.callbackData)) {
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
        if (indiaDltContentTemplateId == null) {
            if (other.indiaDltContentTemplateId != null) {
                return false;
            }
        } else if (!indiaDltContentTemplateId.equals(other.indiaDltContentTemplateId)) {
            return false;
        }
        if (indiaDltPrincipalEntityId == null) {
            if (other.indiaDltPrincipalEntityId != null) {
                return false;
            }
        } else if (!indiaDltPrincipalEntityId.equals(other.indiaDltPrincipalEntityId)) {
            return false;
        }
        if (intermediateReport != other.intermediateReport) {
            return false;
        }
        if (languageCode != other.languageCode) {
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
        if (password == null) {
            if (other.password != null) {
                return false;
            }
        } else if (!password.equals(other.password)) {
            return false;
        }
        if (processKey == null) {
            if (other.processKey != null) {
                return false;
            }
        } else if (!processKey.equals(other.processKey)) {
            return false;
        }
        if (sendAt == null) {
            if (other.sendAt != null) {
                return false;
            }
        } else if (!sendAt.equals(other.sendAt)) {
            return false;
        }
        if (text == null) {
            if (other.text != null) {
                return false;
            }
        } else if (!text.equals(other.text)) {
            return false;
        }
        if (to == null) {
            if (other.to != null) {
                return false;
            }
        } else if (!to.equals(other.to)) {
            return false;
        }
        if (track == null) {
            if (other.track != null) {
                return false;
            }
        } else if (!track.equals(other.track)) {
            return false;
        }
        if (trackingType == null) {
            if (other.trackingType != null) {
                return false;
            }
        } else if (!trackingType.equals(other.trackingType)) {
            return false;
        }
        if (transliteration != other.transliteration) {
            return false;
        }
        if (username == null) {
            if (other.username != null) {
                return false;
            }
        } else if (!username.equals(other.username)) {
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

    @Override
    public String toString() {
        return "SmsQueryStringMessage [username=" + username + ", password=" + password
                + ", bulkId=" + bulkId + ", from=" + from + ", to=" + to + ", text=" + text
                + ", flash=" + flash + ", transliteration=" + transliteration + ", languageCode="
                + languageCode + ", intermediateReport=" + intermediateReport + ", notifyUrl="
                + notifyUrl + ", notifyContentType=" + notifyContentType + ", callbackData="
                + callbackData + ", validityPeriod=" + validityPeriod + ", sendAt=" + sendAt
                + ", track=" + track + ", processKey=" + processKey + ", trackingType="
                + trackingType + ", indiaDltContentTemplateId=" + indiaDltContentTemplateId
                + ", indiaDltPrincipalEntityId=" + indiaDltPrincipalEntityId + "]";
    }
}
