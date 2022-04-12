
package io.github.infobip_community.client.channels.common;

public final class Price {
    private Integer pricePerMessage;
    private String currency;

    public Price() {}

    public Integer getPricePerMessage() {
        return pricePerMessage;
    }

    public void setPricePerMessage(Integer pricePerMessage) {
        this.pricePerMessage = pricePerMessage;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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
        if (!(obj instanceof Price)) {
            return false;
        }
        Price other = (Price) obj;
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
        return "Price [pricePerMessage=" + pricePerMessage + ", currency=" + currency + "]";
    }
}
