
package io.github.infobip_community.client.channels.sms.model.common;

public final class ResultPrice {
    private String currency;
    private Double pricePerMessage;

    public ResultPrice() {}

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getPricePerMessage() {
        return pricePerMessage;
    }

    public void setPricePerMessage(Double pricePerMessage) {
        this.pricePerMessage = pricePerMessage;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((currency == null) ? 0 : currency.hashCode());
        result = prime * result + ((pricePerMessage == null) ? 0 : pricePerMessage.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultPrice)) {
            return false;
        }
        ResultPrice other = (ResultPrice) obj;
        if (currency == null) {
            if (other.currency != null) {
                return false;
            }
        } else if (!currency.equals(other.currency)) {
            return false;
        }
        if (pricePerMessage == null) {
            if (other.pricePerMessage != null) {
                return false;
            }
        } else if (!pricePerMessage.equals(other.pricePerMessage)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResultPrice [currency=" + currency + ", pricePerMessage=" + pricePerMessage
                + "]";
    }
}
