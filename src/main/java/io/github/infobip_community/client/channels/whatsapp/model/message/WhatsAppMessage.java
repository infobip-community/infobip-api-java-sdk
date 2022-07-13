
package io.github.infobip_community.client.channels.whatsapp.model.message;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

@SuppressWarnings({"unchecked", "rawtypes"})
@Getter
@EqualsAndHashCode
@ToString
public abstract class WhatsAppMessage<T extends WhatsAppMessage<T>> {
    @NotBlank
    @Size(min = 1, max = 24)
    protected final String from;
    @NotBlank
    @Size(min = 1, max = 24)
    protected final String to;
    @Size(min = 0, max = 50)
    protected String messageId;
    @Valid
    @NotNull
    protected final MessageContent content;
    @Size(min = 0, max = 4000)
    protected String callbackData;
    @Size(min = 0, max = 2048)
    @URL
    protected String notifyUrl;

    /**
     * <p>
     * Create WhatsAppMessage.
     * </p>
     *
     * @param from Registered WhatsApp sender number. Must be in international
     *     format and comply with <a href=
     *     "https://www.infobip.com/docs/whatsapp/get-started#phone-number-what-you-need-to-know">WhatsApp's
     *     requirements</a>.
     * @param to Message recipient number. Must be in international format and
     *     comply with WhatsApp's requirements.
     * @param content The content object to build a message that will be sent.
     */
    public WhatsAppMessage(String from, String to, MessageContent content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    /**
     * The ID that uniquely identifies the message sent.
     */
    public T messageId(String messageId) {
        this.messageId = messageId;
        return (T) this;
    }

    /**
     * Custom client data that will be included in a <a href=
     * "https://www.infobip.com/docs/api#channels/whatsapp/receive-whatsapp-delivery-reports">Delivery
     * Report</a>.
     */
    public T callbackData(String callbackData) {
        this.callbackData = callbackData;
        return (T) this;
    }

    /**
     * The URL on your callback server to which delivery and seen reports will be
     * sent. <a href=
     * "https://www.infobip.com/docs/api#channels/whatsapp/receive-whatsapp-delivery-reports">Delivery
     * report format</a>, <a href=
     * "https://www.infobip.com/docs/api#channels/whatsapp/receive-whatsapp-seen-reports">Seen
     * report format</a>.
     */
    public T notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return (T) this;
    }
}
