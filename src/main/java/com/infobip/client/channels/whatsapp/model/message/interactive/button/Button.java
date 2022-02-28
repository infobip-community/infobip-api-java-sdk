
package com.infobip.client.channels.whatsapp.model.message.interactive.button;

public final class Button {
    private final ButtonType type;
    private final String id;
    private final String title;

    /**
     * <p>
     * Button.
     * </p>
     *
     * @param type ButtonType
     * @param id Unique identifier of the button.
     * @param title Unique title of the button. Doesn't allow emojis or markdown.
     */
    public Button(ButtonType type, String id, String title) {
        this.type = type;
        this.id = id;
        this.title = title;
    }

    public ButtonType getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button other = (Button) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!title.equals(other.title)) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Button [type=" + type + ", id=" + id + ", title=" + title + "]";
    }
}
