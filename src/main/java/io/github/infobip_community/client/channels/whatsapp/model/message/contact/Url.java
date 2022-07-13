
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class Url {
    @URL
    private String url;
    private UrlType type;

    /**
     * Contact's url.
     */
    public Url url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Type of the url. Can be HOME or WORK.
     */
    public Url type(UrlType type) {
        this.type = type;
        return this;
    }
}
