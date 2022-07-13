
package io.github.infobip_community.client.channels.email.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class EmailQueryStringLogs {
    private String messageId;
    private String from;
    private String to;
    private String bulkId;
    private String generalStatus;
    private String sentSince;
    private String sentUntil;
    private Integer limit;

    /**
     * The ID that uniquely identifies the sent email.
     */
    public EmailQueryStringLogs messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * From email address.
     */
    public EmailQueryStringLogs from(String from) {
        this.from = from;
        return this;
    }

    /**
     * The recipient email address.
     */
    public EmailQueryStringLogs to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Bulk ID that uniquely identifies the request.
     */
    public EmailQueryStringLogs bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Indicates whether the initiated email has been successfully sent, not sent,
     * delivered, not delivered, waiting for delivery or any other possible status.
     */
    public EmailQueryStringLogs generalStatus(String generalStatus) {
        this.generalStatus = generalStatus;
        return this;
    }

    /**
     * Tells when the email was initiated. Has the following format:
     * yyyy-MM-dd'T'HH:mm:ss.SSSZ.
     */
    public EmailQueryStringLogs sentSince(String sentSince) {
        this.sentSince = sentSince;
        return this;
    }

    /**
     * Tells when the email request was processed by Infobip.Has the following
     * format: yyyy-MM-dd'T'HH:mm:ss.SSSZ.
     */
    public EmailQueryStringLogs sentUntil(String sentUntil) {
        this.sentUntil = sentUntil;
        return this;
    }

    /**
     * Maximum number of logs.
     */
    public EmailQueryStringLogs limit(Integer limit) {
        this.limit = limit;
        return this;
    }
}
