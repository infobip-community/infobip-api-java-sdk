
package io.github.infobip_community.client.channels.email.model.response;

public final class EmailValidationResponse {
    private String to;
    private String validMailbox;
    private Boolean validSyntax;
    private Boolean catchAll;
    private String didYouMean;
    private Boolean disposable;
    private Boolean roleBased;

    public EmailValidationResponse() {}

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getValidMailbox() {
        return validMailbox;
    }

    public void setValidMailbox(String validMailbox) {
        this.validMailbox = validMailbox;
    }

    public Boolean getValidSyntax() {
        return validSyntax;
    }

    public void setValidSyntax(Boolean validSyntax) {
        this.validSyntax = validSyntax;
    }

    public Boolean getCatchAll() {
        return catchAll;
    }

    public void setCatchAll(Boolean catchAll) {
        this.catchAll = catchAll;
    }

    public String getDidYouMean() {
        return didYouMean;
    }

    public void setDidYouMean(String didYouMean) {
        this.didYouMean = didYouMean;
    }

    public Boolean getDisposable() {
        return disposable;
    }

    public void setDisposable(Boolean disposable) {
        this.disposable = disposable;
    }

    public Boolean getRoleBased() {
        return roleBased;
    }

    public void setRoleBased(Boolean roleBased) {
        this.roleBased = roleBased;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((catchAll == null) ? 0 : catchAll.hashCode());
        result = prime * result + ((didYouMean == null) ? 0 : didYouMean.hashCode());
        result = prime * result + ((disposable == null) ? 0 : disposable.hashCode());
        result = prime * result + ((roleBased == null) ? 0 : roleBased.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        result = prime * result + ((validMailbox == null) ? 0 : validMailbox.hashCode());
        result = prime * result + ((validSyntax == null) ? 0 : validSyntax.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailValidationResponse)) {
            return false;
        }
        EmailValidationResponse other = (EmailValidationResponse) obj;
        if (catchAll == null) {
            if (other.catchAll != null) {
                return false;
            }
        } else if (!catchAll.equals(other.catchAll)) {
            return false;
        }
        if (didYouMean == null) {
            if (other.didYouMean != null) {
                return false;
            }
        } else if (!didYouMean.equals(other.didYouMean)) {
            return false;
        }
        if (disposable == null) {
            if (other.disposable != null) {
                return false;
            }
        } else if (!disposable.equals(other.disposable)) {
            return false;
        }
        if (roleBased == null) {
            if (other.roleBased != null) {
                return false;
            }
        } else if (!roleBased.equals(other.roleBased)) {
            return false;
        }
        if (to == null) {
            if (other.to != null) {
                return false;
            }
        } else if (!to.equals(other.to)) {
            return false;
        }
        if (validMailbox == null) {
            if (other.validMailbox != null) {
                return false;
            }
        } else if (!validMailbox.equals(other.validMailbox)) {
            return false;
        }
        if (validSyntax == null) {
            if (other.validSyntax != null) {
                return false;
            }
        } else if (!validSyntax.equals(other.validSyntax)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmailValidationResponse [to=" + to + ", validMailbox=" + validMailbox
                + ", validSyntax=" + validSyntax + ", catchAll=" + catchAll + ", didYouMean="
                + didYouMean + ", disposable=" + disposable + ", roleBased=" + roleBased + "]";
    }
}
