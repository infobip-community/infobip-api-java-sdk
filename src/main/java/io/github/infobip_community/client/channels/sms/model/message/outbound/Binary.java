
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.constraints.NotBlank;

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

    public Integer getDataCoding() {
        return dataCoding;
    }

    public Integer getEsmClass() {
        return esmClass;
    }

    public String getHex() {
        return hex;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dataCoding == null) ? 0 : dataCoding.hashCode());
        result = prime * result + ((esmClass == null) ? 0 : esmClass.hashCode());
        result = prime * result + ((hex == null) ? 0 : hex.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Binary)) {
            return false;
        }
        Binary other = (Binary) obj;
        if (dataCoding == null) {
            if (other.dataCoding != null) {
                return false;
            }
        } else if (!dataCoding.equals(other.dataCoding)) {
            return false;
        }
        if (esmClass == null) {
            if (other.esmClass != null) {
                return false;
            }
        } else if (!esmClass.equals(other.esmClass)) {
            return false;
        }
        if (hex == null) {
            if (other.hex != null) {
                return false;
            }
        } else if (!hex.equals(other.hex)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Binary [dataCoding=" + dataCoding + ", esmClass=" + esmClass + ", hex=" + hex + "]";
    }
}
