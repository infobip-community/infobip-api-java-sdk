
package com.infobip.client.channels.whatsapp.model.message.interactive.multiproduct;

import com.infobip.client.channels.whatsapp.model.message.MessageContent;

public final class Content extends MessageContent {
    private final Header header;
    private final Body body;
    private final Action action;
    private Footer footer;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param header Header of a message containing one or more <a href=
     *     "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     *     elements</a>.
     * @param body Body of a message containing one or more <a href=
     *     "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     *     elements</a>.
     * @param action Allows you to specify catalog and product details sent in the
     *     multi-product message.
     */
    public Content(Header header, Body body, Action action) {
        this.header = header;
        this.body = body;
        this.action = action;
    }

    /**
     * Footer of a message containing one or more <a href=
     * "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     * elements</a>.
     */
    public Content footer(Footer footer) {
        this.footer = footer;
        return this;
    }

    public Header getHeader() {
        return header;
    }

    public Body getBody() {
        return body;
    }

    public Action getAction() {
        return action;
    }

    public Footer getFooter() {
        return footer;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((action == null) ? 0 : action.hashCode());
        result = prime * result + ((body == null) ? 0 : body.hashCode());
        result = prime * result + ((footer == null) ? 0 : footer.hashCode());
        result = prime * result + ((header == null) ? 0 : header.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content other = (Content) obj;
        if (action == null) {
            if (other.action != null) {
                return false;
            }
        } else if (!action.equals(other.action)) {
            return false;
        }
        if (body == null) {
            if (other.body != null) {
                return false;
            }
        } else if (!body.equals(other.body)) {
            return false;
        }
        if (footer == null) {
            if (other.footer != null) {
                return false;
            }
        } else if (!footer.equals(other.footer)) {
            return false;
        }
        if (header == null) {
            if (other.header != null) {
                return false;
            }
        } else if (!header.equals(other.header)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Content [header=" + header + ", body=" + body + ", action="
                + action + ", footer=" + footer + "]";
    }
}
