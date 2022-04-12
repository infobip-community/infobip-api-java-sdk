
package io.github.infobip_community.client.channels.whatsapp.model.message.template;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public final class TemplateData {
    @Valid
    @NotNull
    private final Body body;
    @Valid
    private Header header;
    @Valid
    private List<Button> buttons = new ArrayList<>();

    /**
     * <p>
     * TemplateData.
     * </p>
     *
     * @param body Template body.
     */
    public TemplateData(Body body) {
        this.body = body;
    }

    /**
     * Template header. Should be defined, only if placeholders or media have been
     * registered in the template's header.
     */
    public TemplateData header(Header header) {
        this.header = header;
        return this;
    }

    /**
     * Template buttons. Should be defined in correct order, only if quick reply or
     * dynamic URL buttons have been registered. It can have up to three quick reply
     * buttons or only one dynamic URL button.
     */
    public TemplateData buttons(List<Button> buttons) {
        this.buttons = buttons;
        return this;
    }

    public Body getBody() {
        return body;
    }

    public Header getHeader() {
        return header;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((body == null) ? 0 : body.hashCode());
        result = prime * result + ((buttons == null) ? 0 : buttons.hashCode());
        result = prime * result + ((header == null) ? 0 : header.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateData)) {
            return false;
        }
        TemplateData other = (TemplateData) obj;
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
        return "TemplateData [body=" + body + ", header=" + header + ", buttons=" + buttons + "]";
    }
}
