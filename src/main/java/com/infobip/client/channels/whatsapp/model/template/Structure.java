
package com.infobip.client.channels.whatsapp.model.template;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public final class Structure {
    @Valid
    private Header header;
    @NotEmpty
    private final String body;
    @Size(max = 60)
    private String footer;
    @Valid
    @Size(max = 3)
    private List<Button> buttons = new ArrayList<>();
    private StructureType type;

    /**
     * <p>
     * Structure.
     * <p>
     *
     * @param body Template body. Can be registered as plain text or text with
     *     placeholders. Placeholders have to be correctly formatted and in the
     *     correct order, regardless of other sections. Example: {{1}}, {{2}},
     *     {{3}}...
     */
    public Structure(String body) {
        this.body = body;
    }

    /**
     * Template header. Can be image, document, video, location or text.
     */
    public Structure header(Header header) {
        this.header = header;
        return this;
    }

    /**
     * Template footer. Plain text, up to 60 characters.
     */
    public Structure footer(String footer) {
        this.footer = footer;
        return this;
    }

    /**
     * Template buttons. Can be either up to 3 quick reply buttons or up to 2 call
     * to action buttons. Call to action buttons must be unique in type.
     */
    public Structure buttons(List<Button> buttons) {
        this.buttons = buttons;
        return this;
    }

    public Header getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    public String getFooter() {
        return footer;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public StructureType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((body == null) ? 0 : body.hashCode());
        result = prime * result + ((buttons == null) ? 0 : buttons.hashCode());
        result = prime * result + ((footer == null) ? 0 : footer.hashCode());
        result = prime * result + ((header == null) ? 0 : header.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Structure)) {
            return false;
        }
        Structure other = (Structure) obj;
        if (body == null) {
            if (other.body != null) {
                return false;
            }
        } else if (!body.equals(other.body)) {
            return false;
        }
        if (buttons == null) {
            if (other.buttons != null) {
                return false;
            }
        } else if (!buttons.equals(other.buttons)) {
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
        if (type != other.type) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Structure [header=" + header + ", body=" + body + ", footer=" + footer
                + ", buttons=" + buttons + ", type=" + type + "]";
    }
}
