
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.OffsetDateTime;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class SmsQueryStringMessageLogs {
    private String from;
    private String to;
    private String bulkId;
    private String messageId;
    private GeneralStatus generalStatus;
    private OffsetDateTime sentSince;
    private OffsetDateTime sentUntil;
    private Integer limit;
    private String mcc;
    private String mnc;

    /**
     * The sender ID which can be alphanumeric or numeric.
     */
    public SmsQueryStringMessageLogs from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Message destination address.
     */
    public SmsQueryStringMessageLogs to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Unique ID assigned to the request if messaging multiple recipients or sending
     * multiple messages via a single API request.
     */
    public SmsQueryStringMessageLogs bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Unique message ID for which a log is requested.
     */
    public SmsQueryStringMessageLogs messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Sent message status. Possible values: ACCEPTED, PENDING, UNDELIVERABLE,
     * DELIVERED, REJECTED, EXPIRED.
     */
    public SmsQueryStringMessageLogs generalStatus(GeneralStatus generalStatus) {
        this.generalStatus = generalStatus;
        return this;
    }

    /**
     * The logs will only include messages sent after this date. Use it together
     * with sentUntil to return a time range or if you want to fetch more than 1000
     * logs allowed per call. Has the following format: yyyy-MM-dd'T'HH:mm:ss.SSSZ.
     */
    public SmsQueryStringMessageLogs sentSince(OffsetDateTime sentSince) {
        this.sentSince = sentSince;
        return this;
    }

    /**
     * The logs will only include messages sent before this date. Use it together
     * with sentBefore to return a time range or if you want to fetch more than 1000
     * logs allowed per call. Has the following format: yyyy-MM-dd'T'HH:mm:ss.SSSZ.
     */
    public SmsQueryStringMessageLogs sentUntil(OffsetDateTime sentUntil) {
        this.sentUntil = sentUntil;
        return this;
    }

    /**
     * Maximum number of messages to include in logs. If not set, the latest 50
     * records are returned. Maximum limit value is 1000 and you can only access
     * logs for the last 48h. If you want to fetch more than 1000 logs allowed per
     * call, use sentBefore and sentUntil to retrieve them in pages.
     */
    public SmsQueryStringMessageLogs limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Mobile Country Code.
     */
    public SmsQueryStringMessageLogs mcc(String mcc) {
        this.mcc = mcc;
        return this;
    }

    /**
     * Mobile Network Code.
     */
    public SmsQueryStringMessageLogs mnc(String mnc) {
        this.mnc = mnc;
        return this;
    }
}
