
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class Binary {
    private Integer dataCoding;
    private Integer esmClass;
    @NotBlank
    private final String hex;

    /**
     * <p>
     * Binary.
     * </p>
     *
     * @param hex Hexadecimal string. This is the representation of your binary
     *     data. Two hex digits represent one byte. They should be separated by the
     *     space character (Example: 0f c2 4a bf 34 13 ba).
     */
    public Binary(String hex) {
        this.hex = hex;
    }

    /**
     * Binary content data coding. The default value is (0) for GSM7. Example: (8)
     * for Unicode data.
     */
    public Binary dataCoding(Integer dataCoding) {
        this.dataCoding = dataCoding;
        return this;
    }

    /**
     * “Esm_class” parameter. Indicate special message attributes associated with
     * the SMS. Default value is (0).
     */
    public Binary esmClass(Integer esmClass) {
        this.esmClass = esmClass;
        return this;
    }
}
