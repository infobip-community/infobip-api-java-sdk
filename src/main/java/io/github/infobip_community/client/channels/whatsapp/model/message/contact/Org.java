
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class Org {
    private String company;
    private String department;
    private String title;

    /**
     * Company name.
     */
    public Org company(String company) {
        this.company = company;
        return this;
    }

    /**
     * Department name.
     */
    public Org department(String department) {
        this.department = department;
        return this;
    }

    /**
     * Title value.
     */
    public Org title(String title) {
        this.title = title;
        return this;
    }
}
