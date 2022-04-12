
package io.github.infobip_community.client.channels.sms.model.tfa.template.response;

import io.github.infobip_community.client.channels.sms.model.common.Regional;
import io.github.infobip_community.client.channels.sms.model.tfa.template.Language;
import io.github.infobip_community.client.channels.sms.model.tfa.template.PinType;

public final class TemplateResponse {
    private String applicationId;
    private Language language;
    private String messageId;
    private String messageText;
    private Integer pinLength;
    private String pinPlaceholder;
    private PinType pinType;
    private Regional regional;
    private String repeatDtmf;
    private String senderId;
    private Double speechRate;

    public TemplateResponse() {}

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Integer getPinLength() {
        return pinLength;
    }

    public void setPinLength(Integer pinLength) {
        this.pinLength = pinLength;
    }

    public String getPinPlaceholder() {
        return pinPlaceholder;
    }

    public void setPinPlaceholder(String pinPlaceholder) {
        this.pinPlaceholder = pinPlaceholder;
    }

    public PinType getPinType() {
        return pinType;
    }

    public void setPinType(PinType pinType) {
        this.pinType = pinType;
    }

    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
    }

    public String getRepeatDtmf() {
        return repeatDtmf;
    }

    public void setRepeatDtmf(String repeatDtmf) {
        this.repeatDtmf = repeatDtmf;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public Double getSpeechRate() {
        return speechRate;
    }

    public void setSpeechRate(Double speechRate) {
        this.speechRate = speechRate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((applicationId == null) ? 0 : applicationId.hashCode());
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((messageText == null) ? 0 : messageText.hashCode());
        result = prime * result + ((pinLength == null) ? 0 : pinLength.hashCode());
        result = prime * result + ((pinPlaceholder == null) ? 0 : pinPlaceholder.hashCode());
        result = prime * result + ((pinType == null) ? 0 : pinType.hashCode());
        result = prime * result + ((regional == null) ? 0 : regional.hashCode());
        result = prime * result + ((repeatDtmf == null) ? 0 : repeatDtmf.hashCode());
        result = prime * result + ((senderId == null) ? 0 : senderId.hashCode());
        result = prime * result + ((speechRate == null) ? 0 : speechRate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateResponse)) {
            return false;
        }
        TemplateResponse other = (TemplateResponse) obj;
        if (applicationId == null) {
            if (other.applicationId != null) {
                return false;
            }
        } else if (!applicationId.equals(other.applicationId)) {
            return false;
        }
        if (language != other.language) {
            return false;
        }
        if (messageId == null) {
            if (other.messageId != null) {
                return false;
            }
        } else if (!messageId.equals(other.messageId)) {
            return false;
        }
        if (messageText == null) {
            if (other.messageText != null) {
                return false;
            }
        } else if (!messageText.equals(other.messageText)) {
            return false;
        }
        if (pinLength == null) {
            if (other.pinLength != null) {
                return false;
            }
        } else if (!pinLength.equals(other.pinLength)) {
            return false;
        }
        if (pinPlaceholder == null) {
            if (other.pinPlaceholder != null) {
                return false;
            }
        } else if (!pinPlaceholder.equals(other.pinPlaceholder)) {
            return false;
        }
        if (pinType != other.pinType) {
            return false;
        }
        if (regional == null) {
            if (other.regional != null) {
                return false;
            }
        } else if (!regional.equals(other.regional)) {
            return false;
        }
        if (repeatDtmf == null) {
            if (other.repeatDtmf != null) {
                return false;
            }
        } else if (!repeatDtmf.equals(other.repeatDtmf)) {
            return false;
        }
        if (senderId == null) {
            if (other.senderId != null) {
                return false;
            }
        } else if (!senderId.equals(other.senderId)) {
            return false;
        }
        if (speechRate == null) {
            if (other.speechRate != null) {
                return false;
            }
        } else if (!speechRate.equals(other.speechRate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TemplateResponse [applicationId=" + applicationId + ", language=" + language
                + ", messageId=" + messageId + ", messageText=" + messageText + ", pinLength="
                + pinLength + ", pinPlaceholder=" + pinPlaceholder + ", pinType=" + pinType
                + ", regional=" + regional + ", repeatDtmf=" + repeatDtmf + ", senderId=" + senderId
                + ", speechRate=" + speechRate + "]";
    }
}
