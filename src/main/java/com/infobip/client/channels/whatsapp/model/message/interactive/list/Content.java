
package com.infobip.client.channels.whatsapp.model.message.interactive.list;

import com.infobip.client.channels.whatsapp.model.message.MessageContent;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public final class Content extends MessageContent {
    @Valid
    @NotNull
    private final Body body;
    @Valid
    @NotNull
    private final Action action;
    @Valid
    private Header header;
    @Valid
    private Footer footer;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param body Body of a message containing one or more <a href=
     *     "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     *     elements</a>.
     * @param action Allows you to specify the title of the list and its sections.
     *     Each section can have a title and multiple rows to select.
     */
    public Content(Body body, Action action) {
        this.body = body;
        this.action = action;
    }

    /**
     * Header of a message containing one or more <a href=
     * "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     * elements</a>.
     */
    public Content header(Header header) {
        this.header = header;
        return this;
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

    public Body getBody() {
        return body;
    }

    public Action getAction() {
        return action;
    }

    public Header getHeader() {
        return header;
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
        return "Content [body=" + body + ", action=" + action + ", header=" + header + ", footer="
                + footer + "]";
    }
}
