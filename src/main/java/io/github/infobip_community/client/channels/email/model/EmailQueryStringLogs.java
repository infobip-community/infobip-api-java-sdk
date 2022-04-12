
package io.github.infobip_community.client.channels.email.model;

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
     * <p>
     * EmailQueryStringLogs.
     * </p>
     */
    public EmailQueryStringLogs() {}

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

    public String getMessageId() {
        return messageId;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getBulkId() {
        return bulkId;
    }

    public String getGeneralStatus() {
        return generalStatus;
    }

    public String getSentSince() {
        return sentSince;
    }

    public String getSentUntil() {
        return sentUntil;
    }

    public Integer getLimit() {
        return limit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bulkId == null) ? 0 : bulkId.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((generalStatus == null) ? 0 : generalStatus.hashCode());
        result = prime * result + ((limit == null) ? 0 : limit.hashCode());
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((sentSince == null) ? 0 : sentSince.hashCode());
        result = prime * result + ((sentUntil == null) ? 0 : sentUntil.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailQueryStringLogs)) {
            return false;
        }
        EmailQueryStringLogs other = (EmailQueryStringLogs) obj;
        if (bulkId == null) {
            if (other.bulkId != null) {
                return false;
            }
        } else if (!bulkId.equals(other.bulkId)) {
            return false;
        }
        if (from == null) {
            if (other.from != null) {
                return false;
            }
        } else if (!from.equals(other.from)) {
            return false;
        }
        if (generalStatus == null) {
            if (other.generalStatus != null) {
                return false;
            }
        } else if (!generalStatus.equals(other.generalStatus)) {
            return false;
        }
        if (limit == null) {
            if (other.limit != null) {
                return false;
            }
        } else if (!limit.equals(other.limit)) {
            return false;
        }
        if (messageId == null) {
            if (other.messageId != null) {
                return false;
            }
        } else if (!messageId.equals(other.messageId)) {
            return false;
        }
        if (sentSince == null) {
            if (other.sentSince != null) {
                return false;
            }
        } else if (!sentSince.equals(other.sentSince)) {
            return false;
        }
        if (sentUntil == null) {
            if (other.sentUntil != null) {
                return false;
            }
        } else if (!sentUntil.equals(other.sentUntil)) {
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
        return "EmailQueryStringLogs [messageId=" + messageId + ", from=" + from + ", to=" + to
                + ", bulkId=" + bulkId + ", generalStatus=" + generalStatus + ", sentSince="
                + sentSince + ", sentUntil=" + sentUntil + ", limit=" + limit + "]";
    }
}
