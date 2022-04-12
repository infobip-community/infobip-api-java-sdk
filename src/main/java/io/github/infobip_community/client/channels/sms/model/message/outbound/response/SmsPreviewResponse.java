
package io.github.infobip_community.client.channels.sms.model.message.outbound.response;

import java.util.ArrayList;
import java.util.List;

public final class SmsPreviewResponse {
    private String originalText;
    private List<Preview> previews = new ArrayList<>();

    public SmsPreviewResponse() {}

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public List<Preview> getPreviews() {
        return previews;
    }

    public void setPreviews(List<Preview> previews) {
        this.previews = previews;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((originalText == null) ? 0 : originalText.hashCode());
        result = prime * result + ((previews == null) ? 0 : previews.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsPreviewResponse)) {
            return false;
        }
        SmsPreviewResponse other = (SmsPreviewResponse) obj;
        if (originalText == null) {
            if (other.originalText != null) {
                return false;
            }
        } else if (!originalText.equals(other.originalText)) {
            return false;
        }
        if (previews == null) {
            if (other.previews != null) {
                return false;
            }
        } else if (!previews.equals(other.previews)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SmsPreviewResponse [originalText=" + originalText + ", previews=" + previews + "]";
    }
}
