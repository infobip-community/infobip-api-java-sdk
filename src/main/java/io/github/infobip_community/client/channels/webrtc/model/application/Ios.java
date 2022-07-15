
package io.github.infobip_community.client.channels.webrtc.model.application;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public final class Ios {
    @NotBlank
    private String apnsCertificateFileName;
    @NotBlank
    private String apnsCertificateFileContent;
    private String apnsCertificatePassword;

    /**
     * <p>
     * Ios.
     * </p>
     *
     * @param apnsCertificateFileName Name of the APNS certificate file used to
     *     enable iOS push notifications.
     * @param apnsCertificateFileContent Content of the APNS certificate file used
     *     to enable iOS push notifications.
     */
    public Ios(String apnsCertificateFileName, String apnsCertificateFileContent) {
        this.apnsCertificateFileName = apnsCertificateFileName;
        this.apnsCertificateFileContent = apnsCertificateFileContent;
    }

    /**
     * Password used for decryption of the APNS certificate.
     */
    public Ios apnsCertificatePassword(String apnsCertificatePassword) {
        this.apnsCertificatePassword = apnsCertificatePassword;
        return this;
    }
}
