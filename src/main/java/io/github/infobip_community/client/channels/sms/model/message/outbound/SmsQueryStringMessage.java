
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import io.github.infobip_community.client.channels.common.NotifyContentType;
import jakarta.validation.constraints.NotBlank;
import java.time.OffsetDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

@Getter
@EqualsAndHashCode
@ToString
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
}
