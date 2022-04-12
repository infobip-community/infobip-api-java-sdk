
package io.github.infobip_community.client.channels.sms.model.message.outbound.response;

public final class Preview {
    private Integer charactersRemaining;
    private Configuration configuration;
    private Integer messageCount;
    private String textPreview;

    public Preview() {}

    public Integer getCharactersRemaining() {
        return charactersRemaining;
    }

    public void setCharactersRemaining(Integer charactersRemaining) {
        this.charactersRemaining = charactersRemaining;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public Integer getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    public String getTextPreview() {
        return textPreview;
    }

    public void setTextPreview(String textPreview) {
        this.textPreview = textPreview;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((charactersRemaining == null) ? 0 : charactersRemaining.hashCode());
        result = prime * result + ((configuration == null) ? 0 : configuration.hashCode());
        result = prime * result + ((messageCount == null) ? 0 : messageCount.hashCode());
        result = prime * result + ((textPreview == null) ? 0 : textPreview.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preview)) {
            return false;
        }
        Preview other = (Preview) obj;
        if (charactersRemaining == null) {
            if (other.charactersRemaining != null) {
                return false;
            }
        } else if (!charactersRemaining.equals(other.charactersRemaining)) {
            return false;
        }
        if (configuration == null) {
            if (other.configuration != null) {
                return false;
            }
        } else if (!configuration.equals(other.configuration)) {
            return false;
        }
        if (messageCount == null) {
            if (other.messageCount != null) {
                return false;
            }
        } else if (!messageCount.equals(other.messageCount)) {
            return false;
        }
        if (textPreview == null) {
            if (other.textPreview != null) {
                return false;
            }
        } else if (!textPreview.equals(other.textPreview)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Preview [charactersRemaining=" + charactersRemaining + ", configuration="
                + configuration + ", messageCount=" + messageCount + ", textPreview=" + textPreview
                + "]";
    }
}
