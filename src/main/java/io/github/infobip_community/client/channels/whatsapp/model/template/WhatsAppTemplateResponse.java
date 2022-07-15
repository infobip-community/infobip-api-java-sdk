
package io.github.infobip_community.client.channels.whatsapp.model.template;

import lombok.*;

/**
 * <p>
 * List of all templates for given sender.
 * </p>
 */
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class WhatsAppTemplateResponse extends Template {
    private String id;
    private long businessAccountId;
    private StatusType status;
}
