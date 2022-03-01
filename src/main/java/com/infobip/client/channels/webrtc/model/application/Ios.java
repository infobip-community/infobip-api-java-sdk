
package com.infobip.client.channels.webrtc.model.application;

import jakarta.validation.constraints.NotBlank;

public final class Ios {
    @NotBlank
    private String apnsCertificateFileName;
    @NotBlank
    private String apnsCertificateFileContent;
    private String apnsCertificatePassword;

    public Ios() {}

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

    public String getApnsCertificateFileName() {
        return apnsCertificateFileName;
    }

    public void setApnsCertificateFileName(String apnsCertificateFileName) {
        this.apnsCertificateFileName = apnsCertificateFileName;
    }

    public String getApnsCertificateFileContent() {
        return apnsCertificateFileContent;
    }

    public void setApnsCertificateFileContent(String apnsCertificateFileContent) {
        this.apnsCertificateFileContent = apnsCertificateFileContent;
    }

    public String getApnsCertificatePassword() {
        return apnsCertificatePassword;
    }

    public void setApnsCertificatePassword(String apnsCertificatePassword) {
        this.apnsCertificatePassword = apnsCertificatePassword;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apnsCertificateFileContent == null) ? 0
                : apnsCertificateFileContent.hashCode());
        result = prime * result
                + ((apnsCertificateFileName == null) ? 0 : apnsCertificateFileName.hashCode());
        result = prime * result
                + ((apnsCertificatePassword == null) ? 0 : apnsCertificatePassword.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ios)) {
            return false;
        }
        Ios other = (Ios) obj;
        if (apnsCertificateFileContent == null) {
            if (other.apnsCertificateFileContent != null) {
                return false;
            }
        } else if (!apnsCertificateFileContent.equals(other.apnsCertificateFileContent)) {
            return false;
        }
        if (apnsCertificateFileName == null) {
            if (other.apnsCertificateFileName != null) {
                return false;
            }
        } else if (!apnsCertificateFileName.equals(other.apnsCertificateFileName)) {
            return false;
        }
        if (apnsCertificatePassword == null) {
            if (other.apnsCertificatePassword != null) {
                return false;
            }
        } else if (!apnsCertificatePassword.equals(other.apnsCertificatePassword)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ios [apnsCertificateFileName=" + apnsCertificateFileName
                + ", apnsCertificateFileContent=" + apnsCertificateFileContent
                + ", apnsCertificatePassword=" + apnsCertificatePassword + "]";
    }
}
