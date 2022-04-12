
package io.github.infobip_community.client.channels.email.model;

import io.github.infobip_community.client.channels.common.NotifyContentType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.io.File;
import java.time.OffsetDateTime;
import org.hibernate.validator.constraints.URL;

public final class EmailFullyFeatured {
    @NotBlank
    @Email
    private final String from;
    @NotBlank
    @Email
    private final String to;
    @Email
    private String cc;
    @Email
    private String bcc;
    @NotBlank
    private final String subject;
    private String text;
    private String bulkId;
    private String messageId;
    private Integer templateid;
    private File attachment;
    private File inlineImage;
    private String html;
    @Email
    private String replyto;
    private String defaultplaceholders;
    private boolean preserverecipients;
    @URL
    private String trackingUrl;
    private boolean trackclicks;
    private boolean trackopens;
    private boolean track;
    private String callbackData;
    private boolean intermediateReport;
    @URL
    private String notifyUrl;
    private NotifyContentType notifyContentType;
    private OffsetDateTime sendAt;
    private String landingPagePlaceholders;
    private String landingPageId;

    /**
     * <p>
     * EmailFullyFeatured.
     * </p>
     *
     * @param from Email address with optional sender name.
     * @param to Email address of the recipient.
     * @param subject Message subject.
     */
    public EmailFullyFeatured(String from, String to, String subject) {
        this.from = from;
        this.to = to;
        this.subject = subject;
    }

    /**
     * CC recipient email address.
     */
    public EmailFullyFeatured cc(String cc) {
        this.cc = cc;
        return this;
    }

    /**
     * BCC recipient email address.
     */
    public EmailFullyFeatured bcc(String bcc) {
        this.bcc = bcc;
        return this;
    }

    /**
     * Body of message.
     */
    public EmailFullyFeatured text(String text) {
        this.text = text;
        return this;
    }

    /**
     * The ID uniquely identifies the sent Email request. This filter will enable
     * you to query delivery reports for all the messages using just one request.
     * You will receive a bulkId in the response after sending an Email request. If
     * you don't set your own bulkId, unique ID will be generated by our system and
     * returned in the API response. (Optional Field)
     */
    public EmailFullyFeatured bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * The ID that uniquely identifies the message sent for a recipient. (Optional
     * Field)
     */
    public EmailFullyFeatured messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Template identifier based on which the email message is generated. The
     * template is created over Infobip web interface. If templateId is present then
     * html and text values are ignored.
     *
     * NOTE : This field supports value of broadcast templateId only. Content
     * templateId is not supported.
     */
    public EmailFullyFeatured templateid(Integer templateid) {
        this.templateid = templateid;
        return this;
    }

    /**
     * File attachment.
     */
    public EmailFullyFeatured attachment(File attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * Using an inline image, it is possible to insert the image file inside the
     * HTML code of the email by using cid:FILENAME instead of providing any
     * external link to image.
     */
    public EmailFullyFeatured inlineImage(File inlineImage) {
        this.inlineImage = inlineImage;
        return this;
    }

    /**
     * HTML body of the message. If HTML and text fields are present, text field
     * will be ignored and HTML will be delivered as message body.
     */
    public EmailFullyFeatured html(String html) {
        this.html = html;
        return this;
    }

    /**
     * Email address to which recipients of the email can reply.
     */
    public EmailFullyFeatured replyto(String replyto) {
        this.replyto = replyto;
        return this;
    }

    /**
     * Default placeholder values used for all recipients. The values are used to
     * generate the email message.
     */
    public EmailFullyFeatured defaultplaceholders(String defaultplaceholders) {
        this.defaultplaceholders = defaultplaceholders;
        return this;
    }

    /**
     * This parameter enables preserving To recipients for an email when value is
     * true, default value is false for this parameter.
     */
    public EmailFullyFeatured preserverecipients(boolean preserverecipients) {
        this.preserverecipients = preserverecipients;
        return this;
    }

    /**
     * The URL on your callback server on which the open and click notifications
     * will be sent. If you are passing this parameter then track=true will be
     * assigned, you don't need to pass track=true separately. See the section
     * "Tracking Notifications" below for details.
     */
    public EmailFullyFeatured trackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
        return this;
    }

    /**
     * This parameter enables or disables track click feature.
     */
    public EmailFullyFeatured trackclicks(boolean trackclicks) {
        this.trackclicks = trackclicks;
        return this;
    }

    /**
     * This parameter enables or disables track open feature.
     */
    public EmailFullyFeatured trackopens(boolean trackopens) {
        this.trackopens = trackopens;
        return this;
    }

    /**
     * Enable or disable open and click tracking.Default value is true. Passing true
     * will only enable tracking and the statistics would be visible in web
     * interface alone. This can be explicitly overridden by trackopens and
     * trackclikcs.
     */
    public EmailFullyFeatured track(boolean track) {
        this.track = track;
        return this;
    }

    /**
     * Additional client data that will be sent on the notifyUrl. The maximum value
     * is 4000 characters.
     */
    public EmailFullyFeatured callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * The real-time Intermediate delivery report that will be sent on your callback
     * server.
     */
    public EmailFullyFeatured intermediateReport(boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
        return this;
    }

    /**
     * The URL on your callback server on which the Delivery report will be sent.
     */
    public EmailFullyFeatured notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Preferred Delivery report content type. Can be application/json or
     * application/xml.
     */
    public EmailFullyFeatured notifyContentType(NotifyContentType notifyContentType) {
        this.notifyContentType = notifyContentType;
        return this;
    }

    /**
     * To schedule message at a given time in future. Time provided should be in UTC
     * in following format: yyyy-MM-dd'T'HH:mm:ss.SSSXXX.
     */
    public EmailFullyFeatured sendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /**
     * Personalize opt out landing page by inserting placeholders. Insert
     * placeholder or tag while designing landing page.
     */
    public EmailFullyFeatured landingPagePlaceholders(String landingPagePlaceholders) {
        this.landingPagePlaceholders = landingPagePlaceholders;
        return this;
    }

    /**
     * Opt out landing page which will be used and displayed once end user clicks
     * unsubscribe link. If not present default opt out landing page will be
     * displayed. Create landing page on IB’s portal and use last 6 digits from URL
     * to use that opt out page.
     */
    public EmailFullyFeatured landingPageId(String landingPageId) {
        this.landingPageId = landingPageId;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getCc() {
        return cc;
    }

    public String getBcc() {
        return bcc;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public String getBulkId() {
        return bulkId;
    }

    public String getMessageId() {
        return messageId;
    }

    public Integer getTemplateid() {
        return templateid;
    }

    public File getAttachment() {
        return attachment;
    }

    public File getInlineImage() {
        return inlineImage;
    }

    public String getHtml() {
        return html;
    }

    public String getReplyto() {
        return replyto;
    }

    public String getDefaultplaceholders() {
        return defaultplaceholders;
    }

    public boolean isPreserverecipients() {
        return preserverecipients;
    }

    public String getTrackingUrl() {
        return trackingUrl;
    }

    public boolean isTrackclicks() {
        return trackclicks;
    }

    public boolean isTrackopens() {
        return trackopens;
    }

    public boolean isTrack() {
        return track;
    }

    public String getCallbackData() {
        return callbackData;
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

    public OffsetDateTime getSendAt() {
        return sendAt;
    }

    public String getLandingPagePlaceholders() {
        return landingPagePlaceholders;
    }

    public String getLandingPageId() {
        return landingPageId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((attachment == null) ? 0 : attachment.hashCode());
        result = prime * result + ((bcc == null) ? 0 : bcc.hashCode());
        result = prime * result + ((bulkId == null) ? 0 : bulkId.hashCode());
        result = prime * result + ((callbackData == null) ? 0 : callbackData.hashCode());
        result = prime * result + ((cc == null) ? 0 : cc.hashCode());
        result = prime * result
                + ((defaultplaceholders == null) ? 0 : defaultplaceholders.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((html == null) ? 0 : html.hashCode());
        result = prime * result + ((inlineImage == null) ? 0 : inlineImage.hashCode());
        result = prime * result + (intermediateReport ? 1231 : 1237);
        result = prime * result + ((landingPageId == null) ? 0 : landingPageId.hashCode());
        result = prime * result
                + ((landingPagePlaceholders == null) ? 0 : landingPagePlaceholders.hashCode());
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((notifyContentType == null) ? 0 : notifyContentType.hashCode());
        result = prime * result + ((notifyUrl == null) ? 0 : notifyUrl.hashCode());
        result = prime * result + (preserverecipients ? 1231 : 1237);
        result = prime * result + ((replyto == null) ? 0 : replyto.hashCode());
        result = prime * result + ((sendAt == null) ? 0 : sendAt.hashCode());
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        result = prime * result + ((templateid == null) ? 0 : templateid.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        result = prime * result + (track ? 1231 : 1237);
        result = prime * result + (trackclicks ? 1231 : 1237);
        result = prime * result + ((trackingUrl == null) ? 0 : trackingUrl.hashCode());
        result = prime * result + (trackopens ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailFullyFeatured)) {
            return false;
        }
        EmailFullyFeatured other = (EmailFullyFeatured) obj;
        if (attachment == null) {
            if (other.attachment != null) {
                return false;
            }
        } else if (!attachment.equals(other.attachment)) {
            return false;
        }
        if (bcc == null) {
            if (other.bcc != null) {
                return false;
            }
        } else if (!bcc.equals(other.bcc)) {
            return false;
        }
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
        if (cc == null) {
            if (other.cc != null) {
                return false;
            }
        } else if (!cc.equals(other.cc)) {
            return false;
        }
        if (defaultplaceholders == null) {
            if (other.defaultplaceholders != null) {
                return false;
            }
        } else if (!defaultplaceholders.equals(other.defaultplaceholders)) {
            return false;
        }
        if (from == null) {
            if (other.from != null) {
                return false;
            }
        } else if (!from.equals(other.from)) {
            return false;
        }
        if (html == null) {
            if (other.html != null) {
                return false;
            }
        } else if (!html.equals(other.html)) {
            return false;
        }
        if (inlineImage == null) {
            if (other.inlineImage != null) {
                return false;
            }
        } else if (!inlineImage.equals(other.inlineImage)) {
            return false;
        }
        if (intermediateReport != other.intermediateReport) {
            return false;
        }
        if (landingPageId == null) {
            if (other.landingPageId != null) {
                return false;
            }
        } else if (!landingPageId.equals(other.landingPageId)) {
            return false;
        }
        if (landingPagePlaceholders == null) {
            if (other.landingPagePlaceholders != null) {
                return false;
            }
        } else if (!landingPagePlaceholders.equals(other.landingPagePlaceholders)) {
            return false;
        }
        if (messageId == null) {
            if (other.messageId != null) {
                return false;
            }
        } else if (!messageId.equals(other.messageId)) {
            return false;
        }
        if (notifyContentType == null) {
            if (other.notifyContentType != null) {
                return false;
            }
        } else if (!notifyContentType.equals(other.notifyContentType)) {
            return false;
        }
        if (notifyUrl == null) {
            if (other.notifyUrl != null) {
                return false;
            }
        } else if (!notifyUrl.equals(other.notifyUrl)) {
            return false;
        }
        if (preserverecipients != other.preserverecipients) {
            return false;
        }
        if (replyto == null) {
            if (other.replyto != null) {
                return false;
            }
        } else if (!replyto.equals(other.replyto)) {
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
        if (templateid == null) {
            if (other.templateid != null) {
                return false;
            }
        } else if (!templateid.equals(other.templateid)) {
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
        if (track != other.track) {
            return false;
        }
        if (trackclicks != other.trackclicks) {
            return false;
        }
        if (trackingUrl == null) {
            if (other.trackingUrl != null) {
                return false;
            }
        } else if (!trackingUrl.equals(other.trackingUrl)) {
            return false;
        }
        if (trackopens != other.trackopens) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmailFullyFeatured [from=" + from + ", to=" + to + ", cc=" + cc + ", bcc=" + bcc
                + ", subject=" + subject + ", text=" + text + ", bulkId=" + bulkId + ", messageId="
                + messageId + ", templateid=" + templateid + ", attachment=" + attachment
                + ", inlineImage=" + inlineImage + ", html=" + html + ", replyto=" + replyto
                + ", defaultplaceholders=" + defaultplaceholders + ", preserverecipients="
                + preserverecipients + ", trackingUrl=" + trackingUrl + ", trackclicks="
                + trackclicks + ", trackopens=" + trackopens + ", track=" + track
                + ", callbackData=" + callbackData + ", intermediateReport=" + intermediateReport
                + ", notifyUrl=" + notifyUrl + ", notifyContentType=" + notifyContentType
                + ", sendAt=" + sendAt + ", landingPagePlaceholders=" + landingPagePlaceholders
                + ", landingPageId=" + landingPageId + "]";
    }
}
