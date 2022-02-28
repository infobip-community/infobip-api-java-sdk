
package com.infobip.client.channels.whatsapp.model.message.interactive.product;

import com.infobip.client.channels.whatsapp.model.message.MessageContent;

public final class Content extends MessageContent {
    private final Action action;
    private Body body;
    private Footer footer;

    /**
     * <p>
     * Content.
     * </p>
     *
     * @see MessageContent#MessageContent()
     *
     * @param action Allows you to specify catalog and product details sent in the
     *     product message.
     */
    public Content(Action action) {
        this.action = action;
    }

    /**
     * Body of a message containing one or more <a href=
     * "https://www.infobip.com/docs/whatsapp/message-types#free-form-messages">interactive
     * elements</a>.
     */
    public Content body(Body body) {
        this.body = body;
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

    public Action getAction() {
        return action;
    }

    public Body getBody() {
        return body;
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
        return true;
    }

    @Override
    public String toString() {
        return "Content [action=" + action + ", body=" + body + ", footer="
                + footer + "]";
    }
}
